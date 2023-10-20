/**
 * Copyright(c) 2018 Sunyur.com, All Rights Reserved. Author: shijianlei Create date: 2023/10/20
 */
package com.github.springboot.git.commond.service.impl;

import com.github.springboot.git.commond.service.FooService;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.stereotype.Service;

/**
 *
 *
 * @author shijianlei
 * @date 2023/10/20 10:36
 */
@Service
public class FooServiceImpl implements FooService {
    @Override
    public String test01() {
        return RandomStringUtils.randomAlphabetic(10);
    }
}