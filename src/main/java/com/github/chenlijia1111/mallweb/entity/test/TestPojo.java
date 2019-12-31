package com.github.chenlijia1111.mallweb.entity.test;

import com.github.chenlijia1111.utils.core.annos.PropertyCheck;
import io.swagger.annotations.ApiModel;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Chen LiJia
 * @since 2019/12/31
 */
@Setter
@Getter
@ApiModel
public class TestPojo {

    @PropertyCheck(name = "姓名")
    private String name;

    @PropertyCheck(name = "年龄")
    private Integer age;

}
