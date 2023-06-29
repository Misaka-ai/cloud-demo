package cn.itcast.order.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * RestTemplateConfiguration
 *
 * @author liliudong
 * @version 1.0
 * @description
 * @date 2023/6/29 17:51
 */
@Configuration
public class RestTemplateConfiguration {

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
