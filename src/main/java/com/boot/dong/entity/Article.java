package com.boot.dong.entity;

import java.util.Date;

public class Article {
    private Integer id;

    private String city;

    private String cityid;

    private Date createtime;

    private Date lastupdatetime;

    private String articletype;

    private Integer ifapprove;

    private String logo;

    private String shopcolumn;

    private String shopcolumnid;

    private String shopcolumntype;

    private String shopcolumntypeid;

    private Integer sort;

    private String summary;

    private String tag;

    private String title;

    private Integer top;

    private String url;

    private String province;

    private String provinceid;

    private String chl;

    private Integer recommend;

    private String author;

    private String source;

    private Integer hotread;

    private Integer attention;

    private Integer recommenddetail;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getCityid() {
        return cityid;
    }

    public void setCityid(String cityid) {
        this.cityid = cityid == null ? null : cityid.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getLastupdatetime() {
        return lastupdatetime;
    }

    public void setLastupdatetime(Date lastupdatetime) {
        this.lastupdatetime = lastupdatetime;
    }

    public String getArticletype() {
        return articletype;
    }

    public void setArticletype(String articletype) {
        this.articletype = articletype == null ? null : articletype.trim();
    }

    public Integer getIfapprove() {
        return ifapprove;
    }

    public void setIfapprove(Integer ifapprove) {
        this.ifapprove = ifapprove;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo == null ? null : logo.trim();
    }

    public String getShopcolumn() {
        return shopcolumn;
    }

    public void setShopcolumn(String shopcolumn) {
        this.shopcolumn = shopcolumn == null ? null : shopcolumn.trim();
    }

    public String getShopcolumnid() {
        return shopcolumnid;
    }

    public void setShopcolumnid(String shopcolumnid) {
        this.shopcolumnid = shopcolumnid == null ? null : shopcolumnid.trim();
    }

    public String getShopcolumntype() {
        return shopcolumntype;
    }

    public void setShopcolumntype(String shopcolumntype) {
        this.shopcolumntype = shopcolumntype == null ? null : shopcolumntype.trim();
    }

    public String getShopcolumntypeid() {
        return shopcolumntypeid;
    }

    public void setShopcolumntypeid(String shopcolumntypeid) {
        this.shopcolumntypeid = shopcolumntypeid == null ? null : shopcolumntypeid.trim();
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary == null ? null : summary.trim();
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag == null ? null : tag.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Integer getTop() {
        return top;
    }

    public void setTop(Integer top) {
        this.top = top;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getProvinceid() {
        return provinceid;
    }

    public void setProvinceid(String provinceid) {
        this.provinceid = provinceid == null ? null : provinceid.trim();
    }

    public String getChl() {
        return chl;
    }

    public void setChl(String chl) {
        this.chl = chl == null ? null : chl.trim();
    }

    public Integer getRecommend() {
        return recommend;
    }

    public void setRecommend(Integer recommend) {
        this.recommend = recommend;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }

    public Integer getHotread() {
        return hotread;
    }

    public void setHotread(Integer hotread) {
        this.hotread = hotread;
    }

    public Integer getAttention() {
        return attention;
    }

    public void setAttention(Integer attention) {
        this.attention = attention;
    }

    public Integer getRecommenddetail() {
        return recommenddetail;
    }

    public void setRecommenddetail(Integer recommenddetail) {
        this.recommenddetail = recommenddetail;
    }
}