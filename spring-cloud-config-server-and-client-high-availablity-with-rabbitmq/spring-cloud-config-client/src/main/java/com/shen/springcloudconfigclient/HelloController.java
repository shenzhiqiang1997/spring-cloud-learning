package com.shen.springcloudconfigclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
// 这个注解是针对spring boot2.0的要想能动态刷新配置
// 一定要在@Value对象所在的类加上这个注释
@RefreshScope
public class HelloController {
    // 由于设置了bootstrap.properties 会先去配置信息请求
    // 在整个项目启动后直接将这个并注入到当前对象中
    @Value("${hello}")
    private String hello;

    @GetMapping("/hello")
    public String hello(){
        return hello;
    }
}
