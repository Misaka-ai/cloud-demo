package cn.itcast.order.clients;

import cn.itcast.order.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * UserClient
 *
 * @author liliudong
 * @version 1.0
 * @description 用户客户端
 * @date 2023/7/20 14:31
 */
@FeignClient(value = "userservice", path = "/user")
public interface UserClient {
    /**
     * 获取用户信息
     *
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    User getById(@PathVariable Long id);
}
