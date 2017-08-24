package com.denk.test;

import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lvdengke1 on 2017/7/27.
 */
@RestController
public class TestScheduleController {
    public static void main(String[] args) {

//        TestSpider testSpider = new TestSpider(new WeatherPageProcessor());
//
//        testSpider.addUrl("http://www.weather.com.cn/weather/101011000.shtml")
//                .addPipeline(new TestPipeline())
//                .thread(100)
//                .run();


        try {
            String a = "D";
            System.out.println(a.length());
            System.out.println(a.getBytes().length);
            System.out.println(a.getBytes("utf-8").length);
            System.out.println(a.getBytes("utf-16").length);
            System.out.println(a.getBytes("gbk").length);
            System.out.println(a.getBytes("unicode").length);
            System.out.println("###############");
            String b = "吕";
            System.out.println(b.length());
            System.out.println(b.getBytes().length);
            System.out.println(b.getBytes("utf-8").length);
            System.out.println(b.getBytes("utf-16").length);
            System.out.println(b.getBytes("gbk").length);
            System.out.println(a.getBytes("unicode").length);
        }catch (Exception e){
            e.printStackTrace();
        }



    }
}
