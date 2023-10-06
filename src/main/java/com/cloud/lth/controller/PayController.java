package com.cloud.lth.controller;

import com.cloud.lth.pojo.OrderInfo;
import com.cloud.lth.service.UserService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Log4j2
@RequestMapping("/lth/api/order")
public class PayController {


    @Autowired
    private UserService userService;

    public static void main(String[] args) {
        byte[] bytes = new byte[1024 * 1024 * 10];
        byte[] bytes1 = new byte[1024 * 1024 * 100];
        byte[] bytes2 = new byte[1024 * 1024 * 100];
    }

    @PostMapping(value = "/create")
    public OrderInfo createOrder(@RequestHeader(value = "accountId") Long accountId,
                                 @RequestHeader(value = "userId") Long userId,
                                 @RequestBody OrderInfo orderInfo) {
        try {
            userService.testa(orderInfo);
            System.out.println(orderInfo.toString());
        } catch (InterruptedException e) {
            System.out.println("异常了");
        }
        return orderInfo;
    }

    @PostMapping(value = "/create1")
    public OrderInfo createOrder1(@RequestHeader(value = "accountId") Long accountId,
                                 @RequestHeader(value = "userId") Long userId,
                                 @RequestBody OrderInfo orderInfo) {
        String str = "1";
        userService.testb(str);
        System.out.println(str);
        return orderInfo;
    }




}
