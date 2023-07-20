package cn.itcast.order.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;

/**
 * DefaultFeignConfiguration
 *
 * @author liliudong
 * @version 1.0
 * @description Feign配置类
 * @date 2023/7/20 14:55
 */
public class DefaultFeignConfiguration {

    @Bean
    public Logger.Level level() {
        return Logger.Level.FULL;
    }
}
