/*
 * Copyright (c) 2020-2025. zntie.com All Rights Reserved.
 * 项目名称：
 * 类名称：OnlineRatingController.java
 * 创建人：chen aotu
 * 联系方式：niedongjiamail@qq.com
 * 项目官网:
 */
package cn.platform.spring.cas.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

/**
 * 测试接口
 *
 * @author op.nie-dongjia
 * @date 2016/10/31
 */
@RequestMapping("/api/index/")
@RestController
public class IndexController {
    @GetMapping(value = "current-time")
    public Object realTime() {
        LocalDateTime time = LocalDateTime.now();
        return time.toString();
    }

}