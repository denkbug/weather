package com.denk.webmagic.processor;

import com.denk.model.Weather;
import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.processor.PageProcessor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lvdengke1 on 2017/7/26.
 */
public class WeatherPageProcessor implements PageProcessor {
    private Site site = Site.me().setRetryTimes(30).setSleepTime(1);

    @Override
    public void process(Page page) {
        List<String> targetUrls = getRealTargetUrls(page.getHtml().links().regex("(http://www\\.weather\\.com\\.cn/weather1d/\\d{9}\\.shtml)").all());
        page.addTargetRequests(targetUrls);

        String cityId = page.getUrl().regex("http://www\\.weather\\.com\\.cn/weather/(\\d{9})\\.shtml").toString();
        String cityName = page.getHtml().xpath("//div[@class='crumbs fl']/tidyText()").toString().replaceAll("[^\u4e00-\u9fa5]", "");
        String maxTemperature = page.getHtml().xpath("//div[@class='c7d']/ul[@class='t clearfix']/li[1]/p[@class='tem']/span/text()").toString();
        String minTemperature = page.getHtml().xpath("//div[@class='c7d']/ul[@class='t clearfix']/li[1]/p[@class='tem']/i/text()").toString();

        Weather weather = new Weather(cityId, cityName, minTemperature, maxTemperature);
        page.putField("weather", weather);

    }

    @Override
    public Site getSite() {
        return site;
    }

    private List<String> getRealTargetUrls(List<String> urls) {
        List<String> urls_real = new ArrayList<>();
        for (int i = 0; i < urls.size(); i++) {
            urls_real.add(urls.get(i).replaceAll("1d", ""));
        }
        return urls_real;
    }

}
