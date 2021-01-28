package com.nxyf.client;

import com.nxyf.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @program: nxyf
 * @description:
 * @author: myj
 * @create: 2021-01-25 13:59
 */

@FeignClient(value = "nxyf-provider",fallback = PaymentClientImpl.class)
public interface PaymentClient {

    @GetMapping("/nxyf-provider/payment/info")
    public R queryInfo();
}
