package com.baiyan.common.interaction.annotation;

import org.springframework.web.bind.annotation.RestController;

import java.lang.annotation.*;

/**
 * web请求注解
 * @author baiyan
 * @date 2021/03/05
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Web
@RestController
public @interface WebRestController {
}
