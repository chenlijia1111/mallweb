package com.github.chenlijia1111.mallweb.conf;

import com.github.chenlijia1111.utils.core.ParameterCheckProxy;
import com.github.chenlijia1111.utils.database.mybatis.PagePlugin;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author chenlijia
 * @version 1.0
 * @since 2019/8/8 0008 下午 7:50
 **/
@Configuration
public class BeanConfig {

    /**
     * 注入分页插件
     *
     * @return
     */
    @Bean
    public PagePlugin pageHelper() {
        PagePlugin pagePlugin = new PagePlugin();
        return pagePlugin;

    }

    @Bean
    public ParameterCheckProxy parameterCheckProxy(){
        return new ParameterCheckProxy();
    }

}
