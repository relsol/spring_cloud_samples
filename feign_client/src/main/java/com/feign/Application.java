package com.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;


/**
 * Created by RelSol.Chen on 2016/10/20.
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@EnableHystrixDashboard // 开启Hystrix Dashboard监控功能，浏览器访问 /hystrix 或 hystrix.stream
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
