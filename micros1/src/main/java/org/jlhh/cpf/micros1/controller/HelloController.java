package org.jlhh.cpf.micros1.controller;


import com.netflix.discovery.converters.Auto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wangjialin on 2017/6/28.
 */
@RestController
public class HelloController {
    private final Logger logger = LoggerFactory.getLogger(getClass());
    @Auto
    private DiscoveryClient client;
    @Value("${test.name1}")
    private String name1;
    @Value("${test.tt}")
    private String tt;

    @RequestMapping(value = "/hello")
    public String hello() {
        return "hello world!" + name1 + ":::" + tt;
    }
}
