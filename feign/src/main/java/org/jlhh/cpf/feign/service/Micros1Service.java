package org.jlhh.cpf.feign.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by wangjialin on 2017/6/28.
 */
@FeignClient("cpf-micros1")
public interface Micros1Service {
    @RequestMapping("/hello")
    String hello();
}
