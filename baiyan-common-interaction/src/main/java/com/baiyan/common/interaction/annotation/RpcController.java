package com.baiyan.common.interaction.annotation;

import org.springframework.stereotype.Controller;

import java.lang.annotation.*;

/**
 * rpc请求注解
 * @author baiyan
 * @date 2021/03/05
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Rpc
@Controller
public @interface RpcController {
}
