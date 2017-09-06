package com.denk.test;

import com.denk.controller.WeatherAPIController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.StopWatch;


/**
 * Created by lvdengke1 on 2017/8/23.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SimpleTest {

    @Autowired
    private WeatherAPIController weatherApiController;

    @Test
    public void testAPI() {
        System.out.println(weatherApiController.listCitys());
    }

    public static void main(String[] args) throws Exception {
        StopWatch sw = new StopWatch();
        sw.start("读取文件");
        Thread.sleep(1000);
        sw.stop();
        sw.start("文件删除");
        Thread.sleep(100);
        sw.stop();
        sw.start("文件拷贝");
        Thread.sleep(10);
        sw.stop();
        System.out.println(sw.prettyPrint());

        long stime = System.currentTimeMillis();
        Thread.sleep(1000);
        long etime = System.currentTimeMillis();
        System.out.println("执行时间:" + (etime - stime));
    }
}