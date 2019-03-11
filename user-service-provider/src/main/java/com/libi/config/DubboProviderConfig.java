package com.libi.config;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.io.IOException;

/**
 * @author libi
 */
@Configuration
@EnableDubbo(scanBasePackages = "com.libi.service.impl")
@PropertySource("classpath:/config/dubbo-provider.properties")
public class DubboProviderConfig {
    public static void main(String[] args) throws IOException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DubboProviderConfig.class);
        context.start();
        System.in.read();
    }
}
