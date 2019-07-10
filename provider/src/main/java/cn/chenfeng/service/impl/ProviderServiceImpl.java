/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: ProviderServiceImpl
 * Author:   chenf
 * Date:     2019/7/9 0009 7:52
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 */
package cn.chenfeng.service.impl;

import cn.chenfeng.service.ProviderService;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 〈〉
 *
 * @author chenf
 * @create 2019/7/9 0009
 * @since 1.0.0
 */
@Service(interfaceClass = ProviderService.class)
@Transactional
public class ProviderServiceImpl implements ProviderService {

    @Override
    public String hello(String name) {
        System.out.println("你好" + name);
        return "hehe";
    }
}