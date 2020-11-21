/**
 * Copyright (c) 2020-2025. www.op-platform.com All Rights Reserved.
 * 项目名称：****平台
 * 类名称：UserInfoFilter.java
 * 创建人：nie-dongjia
 * 联系方式：niedongjiamail@qq.com
 */
package cn.platform.spring.cas.filter;

import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * <b>类  名：</b>cn.platform.spring.cas.filter.UserInfoFilter<br/>
 * <b>类描述：</b>TODO<br/>
 * <b>@author：</b>nie-dongjia<br/>
 * <b>创建时间：</b>2020/11/21 15:39<br/>
 * <b>修改人：</b>nie-dongjia<br/>
 * <b>修改时间：</b>2020/11/21 15:39<br/>
 * <b>修改备注：</b><br/>
 *
 * @version 1.0<br />
 */
public class UserInfoFilter extends OncePerRequestFilter {
    @Override
    protected void doFilterInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, FilterChain filterChain) throws ServletException, IOException {

    }
}
