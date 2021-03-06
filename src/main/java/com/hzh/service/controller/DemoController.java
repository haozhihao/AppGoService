package com.hzh.service.controller;


import com.hzh.service.service.IDemoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "test-controller")
@RestController
@RequestMapping("/DemoController")
public class DemoController {

    @Autowired
    IDemoService iDemoService;

    @ApiOperation(value = "test-inter",response = String.class)
    @GetMapping("testInter")
    public String testInter(String pram) {
        return pram;
    }
}
