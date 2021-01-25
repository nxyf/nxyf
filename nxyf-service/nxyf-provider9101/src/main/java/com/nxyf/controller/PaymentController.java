package com.nxyf.controller;

import com.nxyf.utils.R;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: nxyf
 * @description:
 * @author: myj
 * @create: 2021-01-25 11:30
 */
@RestController
@RequestMapping("/payment")
@RefreshScope //配置中心刷新
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;

    @Value("${nacos.configInfo}")
    private String configInfo;

    @GetMapping("/info")
    public R queryInfo() {
        return R.ok().put("data", serverPort).put("configInfo",configInfo);
    }

}
