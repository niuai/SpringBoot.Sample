package com.niuai.demo.service.impl;

import com.niuai.demo.service.MyService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class MyServiceImpl implements MyService {

    @Override
    public void test() {
        log.info("I am MyService");
    }
}
