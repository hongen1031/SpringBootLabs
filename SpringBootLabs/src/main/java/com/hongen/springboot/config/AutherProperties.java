package com.hongen.springboot.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * https://www.bysocket.com/technique/2135.html
 */
@Configuration
//@PropertySource("classpath:auther.properties") //优先级小于application,即使指定了属性文件
public class AutherProperties {
	
	@Value("${auther.name}")
	private String name;

	@Value("${auther.email}")
	private String email;
	
	@Value("${auther.address}")
	private String address;

	@Value("${auther.desc}")
	private String desc;

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
	
}
