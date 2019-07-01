package com.lr.common.ms.service.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "redis")
@Component
@Data
public class RedisConfig extends CachingConfigurerSupport {


    private String host;
    private int port;
    private int timeout;//秒
    private String password;
    private int poolMaxTotal;
    private int poolMaxIdle;
    private int poolMaxWait;//秒
    private int database;
}
