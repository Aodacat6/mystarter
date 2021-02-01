package com.mycom.mystarter;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author ：songdalin
 * @date ：2021-02-01 下午 02:43
 * @description：业务方法
 * @modified By：
 * @version: 1.0
 */
@Aspect
public class Service {



    public Service(String aopClass) {
        this.aopClass = aopClass;
    }

    private String aopClass;

    public void
}
