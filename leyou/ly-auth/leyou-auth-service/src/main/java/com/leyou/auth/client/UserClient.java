package com.leyou.auth.client;

import com.leyou.user.api.UserApi;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * 用户feignclient
 */
@FeignClient(value = "user-service")
public interface UserClient extends UserApi {
}
