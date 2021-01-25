package com.nxyf.controller;

import com.nxyf.client.PaymentClient;
import com.nxyf.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: nxyf
 * @description:
 * @author: myj
 * @create: 2021-01-25 13:56
 */
@RestController
@RefreshScope
@RequestMapping("/consumer")
public class ConsumerController {

    @Autowired
    private PaymentClient paymentClient;

    @GetMapping("/info")
    public R queryInfo() {
        return R.ok().put("data",paymentClient.queryInfo());
    }
}
