package com.leyou.client;

import com.leyou.item.api.SpecApi;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * spec FeignClient
 */
@FeignClient(value = "item-service")
public interface SpecClient extends SpecApi {
}
