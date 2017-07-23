package org.jlhh.cpf.feign.controller;

import org.jlhh.cpf.feign.service.Micros1Service;
import org.jlhh.cpf.feign.service.RibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wangjialin on 2017/6/28.
 */
@RestController
public class FeignController {
    @Autowired
    Micros1Service micros1Service;
    @Autowired
    RibbonService ribbonService;
    @RequestMapping("/feignTest")
    public String feignTest() {
        return this.micros1Service.hello();
    }
    @RequestMapping("/feignTest1")
    public String feignTest1() {
        return this.ribbonService.hello();
    }
}
