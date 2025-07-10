package com.springboot_test03.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


//@Component
@Data
@ConfigurationProperties(prefix = "config1")
public class configClass1 {
    //test01
    //test02
    private String name;
    private String ipAddress;
    //private
}
