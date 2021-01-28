package com.nxyf.controller;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.nxyf.utils.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
@Slf4j
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;

    @Value("${nacos.configInfo}")
    private String configInfo;

    @GetMapping("/info")
//    @SentinelResource(value = "info",blockHandler = "blockHandlerMethod")
    public R queryInfo(@RequestParam(value = "p1",required = false) String p1,
                       @RequestParam(value = "p2",required = false) String p2) {

        log.info("p1======="+p1+"===========p2======"+p2);
//        int r=1/0;
        /*try {
            int r=1/0;
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        return R.ok().put("data", serverPort).put("configInfo",configInfo);
    }

    public R blockHandlerMethod(String p1,String p2,BlockException blockException){
        return R.error("服务降级方法");
    }

}
