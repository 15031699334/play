package com.boot.dong.controller;

import com.alibaba.fastjson.JSONObject;
import com.boot.dong.entity.User;
import com.boot.dong.service.UserService;
import com.boot.dong.service.ThymeleafService;
import com.boot.dong.service.TokenService;
import com.boot.dong.util.RedisUtil;
import com.boot.dong.util.token.UserLoginToken;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class WebController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    StringRedisTemplate stringRedisTemplate;
    @Autowired
    UserService userService;
    @Autowired
    RedisUtil redisUtil;
    @Autowired
    ThymeleafService thymeleafService;
    @Autowired
    TokenService tokenService;

    /**
     * redis 测试
     */
    @GetMapping("/test1")
    @ResponseBody
    public void test1(){
        // 保存字符串
        // 普通
        stringRedisTemplate.opsForValue().set("aaa", "111");
        System.out.println(stringRedisTemplate.opsForValue().get("aaa"));
        // 封装好之后的
        redisUtil.set("bbb", "value");
        System.out.println(redisUtil.hasKey("bbb"));
        System.out.println(redisUtil.get("aaa"));

    }

    /**
     *  thymeleaf 以html结尾的请求 结合nginx实现静态化
     * @param pageName     xxx
     * @param request
     * @param response
     */
//    @ResponseBody
    @GetMapping(value = "{pageName}.html")
    public String pageCreate(@PathVariable String pageName, HttpServletRequest request, HttpServletResponse response, Model model){

        System.out.println("html 生成 走了controller: " + pageName);
        try {
            thymeleafService.createHtml(pageName, request, response, model);
        } catch (Exception e) {
            e.printStackTrace();
            return "error";
        }
        return pageName;
    }


    //登录
    @ResponseBody
    @PostMapping("/login")
    public Object login(@RequestBody JSONObject json){
        JSONObject jsonObject = new JSONObject();
        User userForBase=userService.findByUsername(json.getString("username"));
        if(userForBase==null){
            jsonObject.put("message","登录失败,用户不存在");
            return jsonObject;
        }else {
            if (!userForBase.getPassword().equals(json.getString("password"))){
                jsonObject.put("message","登录失败,密码错误");
                return jsonObject;
            }else {
                String token = tokenService.getToken(userForBase);
                jsonObject.put("token", token);
                jsonObject.put("user", userForBase);
                return jsonObject;
            }
        }
    }
    @UserLoginToken
    @GetMapping("/getMessage")
    @ResponseBody
    public String getMessage(){
        return "你已通过验证";
    }



}
