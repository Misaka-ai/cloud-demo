package cn.itcast.order.config;

import com.alibaba.cloud.nacos.ribbon.NacosRule;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class RibbonRuleConfiguration {
    @Bean
    public IRule iRule() {
        return new NacosRule();
    }
}
