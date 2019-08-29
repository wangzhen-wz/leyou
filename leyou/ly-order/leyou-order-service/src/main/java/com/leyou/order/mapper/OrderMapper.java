package com.leyou.order.mapper;

import com.leyou.order.pojo.Order;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface OrderMapper extends Mapper<Order> {
    /**
     * 分页查询订单
     * @param userId
     * @param status
     * @return
     */
    List<Order> queryOrderList(@Param("userId") Long userId , @Param("status") Integer status);
}
