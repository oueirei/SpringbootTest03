package com.springboot_test03.config;

import com.alibaba.druid.pool.DruidDataSource;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;


//@Component
@Data
@ConfigurationProperties(prefix = "config")
public class configClass {
    private String name;
    private String ipAddress;
}
