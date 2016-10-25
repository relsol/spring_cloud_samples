package com.zuuldemo;

import com.zuuldemo.filter.AccessFilter;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

/**
 * Created by RelSol.Chen on 2016/10/25.
 */
@EnableZuulProxy // @EnableZuulProxy注解开启Zuul
@SpringCloudApplication // 整合了@SpringBootApplication、@EnableDiscoveryClient、@EnableCircuitBreake
public class Application {

    public static void main(String[] args) {
        new SpringApplicationBuilder(Application.class).web(true).run(args);
    }

    @Bean
    public AccessFilter accessFilter() {
        return new AccessFilter();
    }
}
