package com.mytest.controller;

import com.mytest.ResponseStatusException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringMvcTestController {

  @GetMapping("echo")
  public String echo(@RequestParam("str") String str) {
    return str;
  }

  @GetMapping(value = "/echo_with_runtime_exception", produces = "application/json")
  public String echoWithRuntimeException(@RequestParam("str") String str) {
    throw new RuntimeException("I have not yet been implemented.");
  }

  @GetMapping("/echo_with_custom_exception")
  public String echoWithCustomException(@RequestParam("str") String str) {
    throw new ResponseStatusException("Oops. Conflict!!!");
  }
}
