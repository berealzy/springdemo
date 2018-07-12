package com.migu.spring.profile;

import org.springframework.stereotype.Component;

public class DemoBean {

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    String content;

    public DemoBean(String content) {
        this.content = content;
    }
}
