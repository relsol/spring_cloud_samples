package com.feign.common;

import com.feign.service.ComputeServiceClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by RelSol.Chen on 2016/10/20.
 * 回调类，实现@FeignClient的接口，此时实现的方法就是对应@FeignClient接口中映射的fallback函数。
 */
@Component
public class ComputeClientHystrix implements ComputeServiceClient {

    /**
     * add方法的回调方法，当请求服务内的add方法失败时，返回-9999
     * @param a
     * @param b
     * @return
     */
    @Override
    public Integer add(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b) {
        return -9999;
    }
}
