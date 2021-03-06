package cn.sa4e.blog.service.test;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.alibaba.dubbo.config.annotation.Reference;

import cn.sa4e.blog.model.User;
import cn.sa4e.blog.service.IUserService;
import cn.sa4e.blog.utils.MD5Utils;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestUserService {
	
	@Reference(version = "0.0.1")
	private IUserService userService;
	
	@Test
	public void testInsert() throws Exception{
		//User user = new User("kryst4l", "123", "hasaigive@gmail.com");
		//userService.insert(user);
	}
	
	@Test
	public void testGetAllUser() throws Exception{
		List<User> userList = userService.getAllUser();
		Assert.assertEquals(userList.size(),4);
	}
	
	//初始化root权限信息
	@Test
	public void initUser() throws Exception{
		String password = "laiI.1.II.11.";
		password = MD5Utils.md5(password);
		User user = new User("sa4e", password, null);
		userService.insert(user);
	}
}
