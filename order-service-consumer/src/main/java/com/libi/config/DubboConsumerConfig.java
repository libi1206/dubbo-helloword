package com.libi.config;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import com.libi.service.OrderService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.io.IOException;

/**
 * @author libi
 */
@Configuration
@EnableDubbo(scanBasePackages = "com.libi.service.impl")
@PropertySource("classpath:/config/dubbo-consumer.properties")
@ComponentScan(basePackages = "com.libi.service.impl")
public class DubboConsumerConfig {

    public static void main(String[] args) throws IOException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DubboConsumerConfig.class);
        context.start();
        OrderService orderService = (OrderService) context.getBean("orderService");
        orderService.initOrder("123");
        System.in.read();
    }
}
