/**
 * Copyright (c) 2020-2025. www.op-platform.com All Rights Reserved.
 * 项目名称：****平台
 * 类名称：WebMvcConfiguration.java
 * 创建人：nie-dongjia
 * 联系方式：niedongjiamail@qq.com
 */
package cn.platform.spring.cas.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * <b>类  名：</b>cn.platform.spring.cas.config.WebMvcConfiguration<br/>
 * <b>类描述：</b><br/>
 * <b>@author：</b>nie-dongjia<br/>
 * <b>创建时间：</b>2020/11/15 23:00<br/>
 * <b>修改人：</b>nie-dongjia<br/>
 * <b>修改时间：</b>2020/11/15 23:00<br/>
 * <b>修改备注：</b><br/>
 *
 * @version 1.0<br />
 */
@Configuration
public class WebMvcConfiguration implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry){
        registry.addMapping("/**")
                .allowedOrigins("*")
                .allowedHeaders("*")
                .allowedMethods("*")
                .allowCredentials(true)
                .exposedHeaders(HttpHeaders.SET_COOKIE);
    }
}
