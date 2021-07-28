package com.example.hellospring;
//https://zetcode.com/java/getpostrequest/


import ch.qos.logback.core.joran.util.beans.BeanDescriptionFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class Scheduler {

    //@Scheduled(cron = "0 * 9 * * ?")
    @Scheduled(fixedRate = 1000)        
    public void cronJobSch() throws IOException, InterruptedException {
        System.out.println("Java cron job start");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        Date now = new Date();
        String strDate = sdf.format(now);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("http://webcode.me"))
                .build();

        HttpResponse<String> response = client.send(request,
                HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());
        
        
        System.out.println("Java cron job expression:: " + strDate);
        
        
        
        
    }
}