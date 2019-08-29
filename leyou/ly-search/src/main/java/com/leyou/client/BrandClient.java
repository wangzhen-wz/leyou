package com.leyou.client;

import com.leyou.item.api.BrandApi;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * 品牌FeignClient
 */
@FeignClient(value = "item-service")
public interface BrandClient extends BrandApi {
}
