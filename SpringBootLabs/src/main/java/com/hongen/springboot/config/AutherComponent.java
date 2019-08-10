package com.hongen.springboot.config;

import javax.validation.constraints.NotEmpty;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.annotation.Validated;

/**
 * @Value 注解方式强制字段必须对应在配置文件， @ConfigurationProperties 注解方式则不是必须的。
 * 一般情况下，所有字段应该保证一一对应在配置文件。如果没有属性值对应的话，该字段默认为空，
 *  @ConfigurationProperties 注解方式也不会引发任何异常，Spring Boot 推荐使用 @ConfigurationProperties 注解方式获取属性。
 */
@Configuration
@ConfigurationProperties(prefix = "auther")
@Validated
public class AutherComponent {

    @NotEmpty
    private String name;
    private String email;
    private String address;
    private String desc;
    private String uuid;
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getDesc() {
        return desc;
    }
    public void setDesc(String desc) {
        this.desc = desc;
    }
    public String getUuid() {
        return uuid;
    }
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }
    
}
