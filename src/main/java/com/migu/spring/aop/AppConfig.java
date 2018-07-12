package com.migu.spring.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.migu.spring.aop")
@EnableAspectJAutoProxy
public class AppConfig {
}
