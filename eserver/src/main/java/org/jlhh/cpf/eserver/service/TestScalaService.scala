package org.jlhh.cpf.eserver.service

import org.springframework.stereotype.Service

import scala.reflect.ClassTag

@Service
class TestScalaService {
  def test(id:Int): Int ={
    return 9;
  }
}