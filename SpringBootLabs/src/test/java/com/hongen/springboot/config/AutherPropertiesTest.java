package com.hongen.springboot.config;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.hongen.springboot.SpringBootLabsApplicationTests;

public class AutherPropertiesTest extends SpringBootLabsApplicationTests {
	@Autowired
	private AutherProperties auther;

	@Test
	public void testAutherProperties() {
		Assert.assertEquals("hongru", auther.getName());
		Assert.assertEquals("hongrujob@126.com", auther.getEmail());
		Assert.assertEquals("北京市", auther.getAddress());
		System.out.println(auther.getDesc());
	}
}
