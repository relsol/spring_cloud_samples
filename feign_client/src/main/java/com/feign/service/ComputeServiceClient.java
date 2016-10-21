package com.feign.service;

import com.feign.common.ComputeClientHystrix;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by RelSol.Chen on 2016/10/20.
 * value="compute-service" 为服务提供者
 * 添加回调类ComputeClientHystrix
 */
@FeignClient(value = "compute-service", fallback = ComputeClientHystrix.class) // client服务提供者
public interface ComputeServiceClient {

    @RequestMapping(method = RequestMethod.GET, value = "/add")
    Integer add(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b);

}
