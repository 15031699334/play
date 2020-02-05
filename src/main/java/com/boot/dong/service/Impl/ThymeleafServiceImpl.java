package com.boot.dong.service.Impl;

import com.boot.dong.entity.Article;
import com.boot.dong.mapper.ArticleMapper;
import com.boot.dong.service.ThymeleafService;
import com.boot.dong.util.PathUtil;
import com.boot.dong.util.ThymeleafUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import sun.dc.path.PathException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ThymeleafServiceImpl implements ThymeleafService {

    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    ThymeleafUtil thymeleafUtil;
    @Autowired
    PathUtil pathUtil;
    @Autowired
    private ArticleMapper articleMapper;


    /**
     * 创建html页面
     *
     * @param pageName
     * @throws Exception
     */
    @Override
    public void createHtml(String pageName, HttpServletRequest request, HttpServletResponse response, Model model) throws Exception{
        // 页面所需参数
        Map<String, Object> map = new HashMap<>();
        switch (pageName){
            case "id":
                map.put("name","姓名");
                map.put("age","10岁");
                map.put("email","邮箱");
                // 首次请求时 返回页面的参数
//                request.setAttribute("obj", map);
                model.mergeAttributes(map);
//                model.addAllAttributes(map);
                break; //可选
            /*       *-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-      PC端页面           *-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-   */
            case "header":      // 头
                break;
            case "footer":      // 底
                break;
            case "index":   // 首页
                logger.info("走到了 首页");
                break;
            case "information":     // 钢板资讯
                logger.info("走到了 information");
                List<Article> list = articleMapper.getAllNews();
//                request.setAttribute("news", list);
                model.addAttribute("news", list);
                map.put("news", list);
                break;
            default:      // 所有的都没有走到 自动走进此项之中
                logger.info("service 参数获取错误");
                throw new PathException("页面不存在");
        }
        thymeleafUtil.createHtml(pageName, request, map);
    }


    @Override
    public void deleteHtml(String fileName) {
        try {
            thymeleafUtil.deleteHtml(fileName);
            System.out.println("已删除静态文件：" + fileName);
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
}
