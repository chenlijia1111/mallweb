package com.github.chenlijia1111.mallweb.controller;

import com.github.chenlijia1111.mallweb.entity.test.TestPojo;
import com.github.chenlijia1111.utils.common.Result;
import com.github.chenlijia1111.utils.core.annos.PropertyCheck;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Chen LiJia
 * @since 2019/12/31
 */
@RestController
@RequestMapping("test")
public class TestParameterController {


    @GetMapping(value = "test1")
    @PropertyCheck
    public Result test1(@PropertyCheck TestPojo params, @PropertyCheck(name = "测试参数") Integer testParam) {
        return Result.success("查询成果");
    }

}
