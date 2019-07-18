package com.tedu.test;

import javax.annotation.Resource;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tedu.dao.Dasdasd;
import com.tedu.dao.TUserDao;
import com.tedu.entity.TUser;

public class TUserTest {
	
	
	
	@Test
	public void findByUsername() {
		
		AbstractApplicationContext con = new ClassPathXmlApplicationContext("spring-mybatis.xml");
		TUserDao tUserDao = con.getBean("tuserDao",TUserDao.class);
		
		System.out.println(tUserDao);
		
		System.out.println(tUserDao.findByUsername("ÕÅÈý"));
		
		
		
	}
	@Test
	public void findByTEmpId() {
		
		
		
	}
	
}
