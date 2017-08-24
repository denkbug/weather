package com.denk.test;

import us.codecraft.webmagic.Request;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.processor.PageProcessor;

/**
 * Created by lvdengke1 on 2017/8/22.
 */
public class TestSpider extends Spider {
    public TestSpider(PageProcessor pageProcessor) {
        super(pageProcessor);
    }

    @Override
    protected void onSuccess(Request request) {
        super.onSuccess(request);
        System.out.println("########onsuccess................");
    }

    @Override
    public void run() {
        System.out.println("########run................");
        super.run();
        System.out.println("########run................");
    }

    @Override
    protected void onError(Request request) {
        super.onError(request);
        System.out.println("########onerror................");
    }
}
