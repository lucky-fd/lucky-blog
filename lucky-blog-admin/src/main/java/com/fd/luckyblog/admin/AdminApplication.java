package com.fd.luckyblog.admin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import springfox.documentation.oas.annotations.EnableOpenApi;

import javax.annotation.PostConstruct;
import java.util.TimeZone;

/**
 * mogu-admin 启动类
 *
 * @author 陌溪
 * @date 2020年12月31日21:26:04
 */
@EnableTransactionManagement
@SpringBootApplication
@EnableOpenApi
@EnableDiscoveryClient
@EnableCaching
@EnableRabbit
@EnableFeignClients("com.fd.luckyblog.commons.feign")
@ComponentScan(basePackages = {
        "com.fd.luckyblog.commons.config",
        "com.fd.luckyblog.commons.fallback",
        "com.fd.luckyblog.utils",
        "com.fd.luckyblog.admin",
        "com.fd.luckyblog.xo.utils",
        "com.fd.luckyblog.xo.service"
})
@MapperScan("com.fd.luckyblog.xo.mapper")
public class AdminApplication {

    public static void main(String[] args) {
        TimeZone.setDefault(TimeZone.getTimeZone("Asia/Shanghai"));
        SpringApplication.run(AdminApplication.class, args);
    }

    /**
     * 设置时区
     */
    @PostConstruct
    void setDefaultTimezone() {
        TimeZone.setDefault(TimeZone.getTimeZone("Asia/Shanghai"));
    }
}
