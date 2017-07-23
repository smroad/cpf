package org.jlhh.cpf.eserver.controller

import org.springframework.stereotype.Controller
import org.jlhh.cpf.eserver.service.TestScalaService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.{RequestMapping, RequestMethod, ResponseBody}

@Controller
class TestScalaController @Autowired() (private val testScalaService:TestScalaService){
  @RequestMapping(value = Array("/testscala"), method = Array(RequestMethod.GET))
  @ResponseBody
  def hello():String={
    println(testScalaService.test(999))
    return "test"
  }
}