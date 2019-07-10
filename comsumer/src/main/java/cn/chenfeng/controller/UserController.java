/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: cotroller
 * Author:   chenf
 * Date:     2019/7/10 0010 0:34
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 */
package cn.chenfeng.controller;

import cn.chenfeng.service.ProviderService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 〈〉
 *
 * @author chenf
 * @create 2019/7/10 0010
 * @since 1.0.0
 */
@Controller
@RequestMapping("/hello")
public class UserController {

    @Reference
    private ProviderService providerService;


    @RequestMapping(value = "/test")
    public @ResponseBody String test(String name){

        String hello = providerService.hello(name);

        return name + hello;
    }
}