package com.nxyf.client;

import com.nxyf.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @program: nxyf
 * @description:
 * @author: myj
 * @create: 2021-01-25 13:59
 */
@Component
@FeignClient(value = "nxyf-provider")
public interface PaymentClient {

    @GetMapping("/payment/info")
    public R queryInfo();
}
