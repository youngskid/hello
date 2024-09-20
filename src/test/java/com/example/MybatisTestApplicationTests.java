package com.example;

import com.example.mapper.usemapper;
import com.example.pojo.use;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.util.List;
//@EnableWebMvc
@SpringBootTest
class MybatisTestApplicationTests {

	@Test
	void contextLoads() {
	}
	@Autowired
	private usemapper test1;
	@Test
	public void batiste()
	{
		//List<use> t = test1.l();

		//t.stream().forEach(use-> {System.out.println(use);});
	}

}
