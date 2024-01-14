package com.fd.luckyblog.admin.config;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InitConfig implements InitializingBean {

    @Value("${spring.cloud.nacos.config.server-addr}")
    private String nacos;
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("===========nacos-addr:" + nacos + "============================");
    }
}
