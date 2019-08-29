package com.leyou.comments.client;

import com.leyou.order.api.OrderApi;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * 订单接口
 */
@FeignClient(value = "order-service")
public interface OrderClient extends OrderApi {
}
