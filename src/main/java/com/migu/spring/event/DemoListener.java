package com.migu.spring.event;


import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class DemoListener implements ApplicationListener<DemoEvent>{
    public void onApplicationEvent(DemoEvent event) {
           String content = event.getMessage();
           System.out.println("the things is listened ：" + content);
    }
}
