package com.leyou.client;

import com.leyou.item.api.SpuApi;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * spu FeignClient
 */
@FeignClient(value = "item-service")
public interface SpuClient extends SpuApi {
}
