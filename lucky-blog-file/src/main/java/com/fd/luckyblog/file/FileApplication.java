package com.fd.luckyblog.file;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import springfox.documentation.oas.annotations.EnableOpenApi;


@EnableTransactionManagement
@SpringBootApplication
@EnableOpenApi
@EnableDiscoveryClient
@EnableFeignClients("com.fd.luckyblog.commons.feign")
@ComponentScan(basePackages = {
        "com.fd.luckyblog.commons.config.feign",
        "com.fd.luckyblog.commons.handler",
        "com.fd.luckyblog.commons.config.redis",
        "com.fd.luckyblog.utils",
        "com.fd.luckyblog.file"})
@MapperScan("com.fd.luckyblog.file.mapper")
public class FileApplication {

    public static void main(String[] args) {
        SpringApplication.run(FileApplication.class, args);
    }
}
