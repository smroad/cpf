package org.jlhh.cpf.ribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by wangjialin on 2017/6/28.
 */
@RestController
public class ConsumerController {
    @Autowired
    RestTemplate restTemplate;
    @RequestMapping(value = "/ribbon/hello")
    public String hello() {
        return "::::::"+this.restTemplate
                .getForEntity("http://cpf-micros1/hello", String.class)
                .getBody();
    }

    @RequestMapping(value = "/hello1")
    public String hello1() {
        return "::::::";
    }
}
