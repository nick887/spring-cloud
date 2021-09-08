package icu.nickxiao.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author nick
 * @version 1.0, 2021/9/7
 * @since 1.0.0
 */
@ComponentScan(basePackages = "icu.nickxiao")
@MapperScan(basePackages = {
        "icu.nickxiao.springcloud.dao",
        "org.mybatis.dynamic.sql.util.mybatis3"
})
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
