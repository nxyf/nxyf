package com.nxyf.filter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.http.server.RequestPath;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

/**
 * @program: nxyf
 * @description:自定义全局过滤器
 * @author: myj
 * @create: 2021-01-25 17:30
 */
@Component
@Slf4j
public class NxyfGlobalFilter implements GlobalFilter, Ordered {
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        RequestPath path = exchange.getRequest().getPath();
        log.info("gateway--全局过滤器--path：" + path);
        return chain.filter(exchange);
    }

    @Override
    public int getOrder() {
        return 0;
    }
}
