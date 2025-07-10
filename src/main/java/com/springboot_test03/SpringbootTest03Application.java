package com.springboot_test03;

import com.alibaba.druid.pool.DruidDataSource;
import com.springboot_test03.config.configClass;
import com.springboot_test03.config.configClass1;
import org.springframework.boot.ConfigurableBootstrapContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
@EnableConfigurationProperties({configClass.class, configClass1.class})
public class SpringbootTest03Application {

    @Bean
    @ConfigurationProperties(prefix = "datasource")
    public DruidDataSource dds(){
        DruidDataSource dds = new DruidDataSource();
        //dds.setDriverClassName("com.mysql.jdbc.Driver");
        return  dds;
    }
    public static void main(String[] args) {

        ConfigurableApplicationContext ctx =
                SpringApplication.run(SpringbootTest03Application.class, args);
        configClass c = ctx.getBean(configClass.class);
        System.out.println(c.getName());

        DruidDataSource ds = ctx.getBean(DruidDataSource.class);
        System.out.println(ds.getDriverClassName());
    }

}


