package cn.itcast.order.web;

import cn.itcast.order.pojo.Order;
import cn.itcast.order.propatiyes.Userpro;
import cn.itcast.order.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RefreshScope
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;


    @Autowired
    private Userpro userpro;
   /* @Value("${zhangsan.name}")
    private String name;*/

    @GetMapping("/{orderId}")
    public Order queryOrderByUserId(@PathVariable("orderId") Long orderId) {
        // 根据id查询订单并返回
        log.info("-------------{}-{}------------", userpro.getName(), userpro.getAge());
        return orderService.queryOrderById(orderId);
    }
}
