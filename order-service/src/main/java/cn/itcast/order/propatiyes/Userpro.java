package cn.itcast.order.propatiyes;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@Data
@ConfigurationProperties(prefix = "zhangsan")
public class Userpro {
    private String name;
    private Integer gender;
    private Integer age;
}
