package com.sankuai.hujing02.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDE.
 * User: hujing02
 * Time: 2016/11/25 上午11:38
 * Description:
 */
@RestController
@EnableAutoConfiguration
public class SpringBootExample {
    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SpringBootExample.class, args);
    }
}
