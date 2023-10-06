package com.cloud.lth.service.impl;

import com.cloud.lth.pojo.OrderInfo;
import com.cloud.lth.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public synchronized void testa(OrderInfo orderInfo) throws InterruptedException {
        orderInfo.setName("王菲");
        System.out.println("方法A开始执行"+System.currentTimeMillis());
        Thread.sleep(5000);
        System.out.println("调用方法B"+System.currentTimeMillis());
        testb("2");
    }

    @Override
    public void testb(String nameStr) {
        System.out.println("方法B开始执行"+nameStr);
        nameStr = "修改后的Str";
    }

}
