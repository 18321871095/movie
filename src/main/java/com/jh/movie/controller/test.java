package com.jh.movie.controller;

import com.jh.movie.bean.people;
import com.jh.movie.exception.customException.HttpException;
import com.jh.movie.exception.customException.NotFundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class test {
    private static Logger logger= LoggerFactory.getLogger(test.class);

    @Autowired
    private people p;

    @GetMapping("/test")
    public void test()  {
        throw new HttpException(10001,"请求出错1");
    }


    @RequestMapping("/getIndexImg")
    @CrossOrigin(origins = "*",maxAge = 3600)
    public List<String> getIndexImg(HttpServletRequest request){
        logger.info("获取首页列表");
        List<String> imgs=new ArrayList<>();
        //String realPath = request.getSession().getServletContext().getRealPath("/static/");
        /*imgs.add("http://localhost:8081/img/1.jpg");
        imgs.add("http://localhost:8081/img/2.png");
        imgs.add("http://localhost:8081/img/3.png");
        imgs.add("http://localhost:8081/img/4.jpeg");
        imgs.add("http://localhost:8081/img/5.jpg");
        imgs.add("http://localhost:8081/img/6.jpg");*/
        imgs.add("http://chinaecdsurvey.com:8080/img/1.jpg");
        imgs.add("http://chinaecdsurvey.com:8080/img/2.png");
        imgs.add("http://chinaecdsurvey.com:8080/img/3.png");
        imgs.add("http://chinaecdsurvey.com:8080/img/4.jpeg");
        imgs.add("http://chinaecdsurvey.com:8080/img/5.jpg");
        imgs.add("http://chinaecdsurvey.com:8080/img/6.jpg");
        return imgs;
    }
    @RequestMapping("/getHotxImg")
    @CrossOrigin(origins = "*",maxAge = 3600)
    public List<Map<String,String>> getHotxImg(HttpServletRequest request){
        logger.info("获取超英列表");
        List<Map<String,String>> imgs=new ArrayList<>();
        /*String url="http://localhost:8081/img/hot/";*/
        String url="http://chinaecdsurvey.com:8080/img/hot/";
        //String realPath = request.getSession().getServletContext().getRealPath("/static/");
        Map<String,String> map1=new HashMap<>();
        map1.put("img",url+1+".jpg");
        map1.put("score","6.0");
        map1.put("text","凡是-不平凡");
        Map<String,String> map2=new HashMap<>();
        map2.put("img",url+2+".jpg");
        map2.put("score","8.0");
        map2.put("text","黑豹");
        Map<String,String> map3=new HashMap<>();
        map3.put("img",url+3+".jpg");
        map3.put("score","7.8");
        map3.put("text","冰冻大冒险2");
        Map<String,String> map4=new HashMap<>();
        map4.put("img",url+4+".jpg");
        map4.put("score","9.5");
        map4.put("text","哥斯拉2");
        Map<String,String> map5=new HashMap<>();
        map5.put("img",url+5+".jpg");
        map5.put("score","8.2");
        map5.put("text","奇幻之旅2");
        Map<String,String> map6=new HashMap<>();
        map6.put("img",url+6+".jpg");
        map6.put("score","9.0");
        map6.put("text","哪吒之魔童降临");
        Map<String,String> map7=new HashMap<>();
        map7.put("img",url+7+".jpg");
        map7.put("score","9.3");
        map7.put("text","小偷情侣");
        Map<String,String> map8=new HashMap<>();
        map8.put("img",url+8+".jpg");
        map8.put("score","6.6");
        map8.put("text","乐高大战动画");
        Map<String,String> map9=new HashMap<>();
        map9.put("img",url+9+".jpg");
        map9.put("score","8.6");
        map9.put("text","机器人之恋");
        Map<String,String> map10=new HashMap<>();
        map10.put("img",url+10+".jpg");
        map10.put("score","9.6");
        map10.put("text","我的青春");
        Map<String,String> map11=new HashMap<>();
        map11.put("img",url+11+".jpg");
        map11.put("score","8.6");
        map11.put("text","海浪之恋");
        Map<String,String> map12=new HashMap<>();
        map12.put("img",url+12+".jpg");
        map12.put("score","7.2");
        map12.put("text","悟空传");
       /* imgs.add("http://chinaecdsurvey.com:8080/img/hot/1.jpg");
        imgs.add("http://chinaecdsurvey.com:8080/img/hot/2.jpg");
        imgs.add("http://chinaecdsurvey.com:8080/img/hot/3.jpg");
        imgs.add("http://chinaecdsurvey.com:8080/img/hot/4.jpg");
        imgs.add("http://chinaecdsurvey.com:8080/img/hot/5.jpg");
        imgs.add("http://chinaecdsurvey.com:8080/img/hot/6.jpg");
        imgs.add("http://chinaecdsurvey.com:8080/img/hot/7.jpeg");
        imgs.add("http://chinaecdsurvey.com:8080/img/hot/8.jpg");
        imgs.add("http://chinaecdsurvey.com:8080/img/hot/9.jpg");
        imgs.add("http://chinaecdsurvey.com:8080/img/hot/10.jpg");
        imgs.add("http://chinaecdsurvey.com:8080/img/hot/11.jpg");
        imgs.add("http://chinaecdsurvey.com:8080/img/hot/12.jpg");*/
        imgs.add(map1);imgs.add(map2);imgs.add(map3);imgs.add(map4);imgs.add(map5);
        imgs.add(map6);imgs.add(map7);imgs.add(map8);imgs.add(map9);imgs.add(map10);
        imgs.add(map11);
        imgs.add(map12);
        return imgs;
    }
    @RequestMapping("/getLikeImg")
    @CrossOrigin(origins = "*",maxAge = 3600)
    public List<Map<String,String>> getLikeImg(HttpServletRequest request){
        logger.info("获取喜欢列表");
        List<Map<String,String>> imgs=new ArrayList<>();
        /*String url="http://localhost:8081/img/hot/";*/
        String url="http://chinaecdsurvey.com:8080/img/like/";
        //String realPath = request.getSession().getServletContext().getRealPath("/static/");
        Map<String,String> map1=new HashMap<>();
        map1.put("img",url+"chaonnengzhandui.jpg");
        map1.put("text","超能战队");
        map1.put("score","8.0");
        map1.put("jieshao","2015/美国/动画");
        map1.put("classify","动画");
        map1.put("time","2015-05-06(美国)");
        Map<String,String> map2=new HashMap<>();
        map2.put("img",url+"heiguafu.jpg");
        map2.put("text","黑寡妇");
        map2.put("score","9.2");
        map2.put("jieshao","2019/美国/动作");
        map2.put("classify","动作");
        map2.put("time","2019-10-06(美国)");
        Map<String,String> map3=new HashMap<>();
        map3.put("img",url+"huamulan.jpeg");
        map3.put("text","花木兰");
        map3.put("score","10.0");
        map3.put("jieshao","2019/中国/动画");
        map3.put("classify","中国英雄");
        map3.put("time","2019-06-06(中国)");
        Map<String,String> map4=new HashMap<>();
        map4.put("img",url+"shanghai.jpeg");
        map4.put("text","上海电瓶");
        map4.put("score","7.6");
        map4.put("jieshao","2019/中国/搞笑");
        map4.put("classify","搞笑");
        map4.put("time","2019-08-06(中国)");
        Map<String,String> map5=new HashMap<>();
        map5.put("img",url+"tegong.jpg");
        map5.put("score","8.6");
        map5.put("text","小黄人2");
        map5.put("jieshao","2018/美国/动画");
        map5.put("classify","动画");
        map5.put("time","2018-09-15(美国)");
        Map<String,String> map6=new HashMap<>();
        map6.put("img",url+"yangmennvjiang.jpg");
        map6.put("score","8.2");
        map6.put("text","杨门女将");
        map6.put("jieshao","2017/中国/动作");
        map6.put("classify","巾帼英雄");
        map6.put("time","2017-08-15(中国)");
        imgs.add(map1);imgs.add(map2);imgs.add(map3);imgs.add(map4);imgs.add(map5);
        imgs.add(map6);
        return imgs;
    }
    @RequestMapping("/getVideoImg")
    @CrossOrigin(origins = "*",maxAge = 3600)
    public List<Map<String,String>> getVideoImg(HttpServletRequest request){
        logger.info("获取热门预告");
        List<Map<String,String>> imgs=new ArrayList<>();
        /*String url="http://localhost:8081/img/hot/";*/
        String url="http://chinaecdsurvey.com:8080/img/video/";
        //String realPath = request.getSession().getServletContext().getRealPath("/static/");
        Map<String,String> map1=new HashMap<>();
        map1.put("poster",url+"tr3.jpg");
        map1.put("src",url+"tr3.mp4");

        Map<String,String> map2=new HashMap<>();
        map2.put("poster",url+"women.jpg");
        map2.put("src",url+"women.mp4");

        Map<String,String> map3=new HashMap<>();
        map3.put("poster",url+"chongwu.jpg");
        map3.put("src",url+"chongwu.mp4");

        Map<String,String> map4=new HashMap<>();
        map4.put("poster",url+"jixianfeng.jpg");
        map4.put("src",url+"jixianfeng.mp4");

        imgs.add(map1);imgs.add(map2);imgs.add(map3);imgs.add(map4);
        return imgs;
    }
}
