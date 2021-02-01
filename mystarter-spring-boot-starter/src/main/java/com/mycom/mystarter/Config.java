package com.mycom.mystarter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author ：songdalin
 * @date ：2021-02-01 下午 03:02
 * @description： 配置类
 * @modified By：
 * @version: 1.0
 */
//注入spring
@Configuration
//开启配置文件属性读取
@EnableConfigurationProperties(Properties.class)
//控制是否开启
@ConditionalOnProperty(
        prefix = "demo",
        name = "isOpen",
        havingValue = "true"
)
public class Config {

    @Autowired
    private Properties properties;

    @Bean("demoService")
    public Service service() {
        return new Service(properties.getAopClass());
    }
}
