package com.mycom.mystarter;


import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author ：songdalin
 * @date ：2021-02-01 下午 02:38
 * @description：配置信息 实体类
 * @modified By：
 * @version: 1.0
 */
@ConfigurationProperties(prefix = "demo")
public class Properties {

    private String aopClass;

    private Integer age;

    public String getAopClass() {
        return aopClass;
    }

    public void setAopClass(String aopClass) {
        this.aopClass = aopClass;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
