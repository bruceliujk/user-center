package com.cloud.lth.pojo;

import lombok.Data;

@Data
public class OrderInfo extends UserBaseInfo{
    //订单表id
    private Long id;
    //订单名称
    private String name;
    //订单创建时间
    private Long startTime;
    //订单状态 1创建 2未支付 3支付中 4支付失败 5支付成功 6关闭
    private Integer status;
    //订单结束时间
    private Long endTime;
    //订单有效时间
    private Long effective;
    //订单结果
    private String result;


}
