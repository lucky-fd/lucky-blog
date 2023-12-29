package com.moxi.mogublog.sms.config;

import io.lettuce.core.ClientOptions;
import org.springframework.boot.autoconfigure.data.redis.LettuceClientConfigurationBuilderCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * mogu_blog_v2
 *
 * @author lucky_fd
 * @since 2023-12-27
 *
 * 解决Redis lettuce驱动连接出现 NOAUTH Authentication required.
 */
//@Configuration
public class RedisWebConfig implements WebMvcConfigurer {

    @Bean
    public LettuceClientConfigurationBuilderCustomizer redisBuilderCustomizer() {
        return builder -> builder.clientOptions(
                ClientOptions
                        .builder()
                        .build()
        );
    }
}
