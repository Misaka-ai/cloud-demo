package cn.itcast.order.service;

import cn.itcast.order.clients.UserClient;
import cn.itcast.order.mapper.OrderMapper;
import cn.itcast.order.pojo.Order;
import cn.itcast.order.pojo.User;
import org.checkerframework.checker.units.qual.A;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class OrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private UserClient userClient;

    public Order queryOrderById(Long orderId) {
        // 1.查询订单
        Order order = orderMapper.findById(orderId);
        // ResponseEntity<User> responseEntity = restTemplate.getForEntity("http://userservice/user/" + order.getUserId(), User.class);
        // User user = responseEntity.getBody();
        // 2. 使用client直接调用UserService服务
        User user = userClient.getById(order.getUserId());
        order.setUser(user);
        // 4.返回
        return order;
    }
}
