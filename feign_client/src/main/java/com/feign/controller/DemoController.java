package com.feign.controller;

import com.feign.service.ComputeServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by RelSol.Chen on 2016/10/20.
 */
@RestController
public class DemoController {

    @Autowired
    private ComputeServiceClient demoClient;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public Integer add() {
        return demoClient.add(10, 20);
    }

}
