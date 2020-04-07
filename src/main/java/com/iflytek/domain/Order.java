package com.iflytek.domain;

import lombok.Data;

@Data
public class Order {
    private String orderId;
    private String payment;
    private String paymentType;
    private String postPrice;
    private int status;
    private String crateTime;
    private String paymentTime;
    private String shippingName;
    private String shippingNo;
    private int userId;
    private String userName;
}
