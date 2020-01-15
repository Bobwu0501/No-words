package com.wsy.nowords.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * 描述：
 * 测试服务运行
 *
 * @author wushunyu
 * @date 2020/1/15
 */
@RestController
@Slf4j
public class TestController {


    @GetMapping("/test")
    public String testServer() {
        log.info("项目运行成功");
        return "service is ok";
    }
}
