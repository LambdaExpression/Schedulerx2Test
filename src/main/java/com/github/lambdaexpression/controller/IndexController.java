package com.github.lambdaexpression.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lin
 * @date 2020/11/19
 */
@RefreshScope
@RestController
@RequestMapping
public class IndexController {

    @Value("${test.config}")
    private String config;

    @GetMapping("/")
    public String index() {
        return config;
    }

}
