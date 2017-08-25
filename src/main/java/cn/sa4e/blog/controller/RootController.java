package cn.sa4e.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.dubbo.config.annotation.Reference;

import cn.sa4e.blog.model.Blog;
import cn.sa4e.blog.service.IBlogService;

/**
* Root后台管理控制器
* @author Sa4e e-mail:hasaigive@gmial.com
* @date 2017年8月24日
*/
@Controller
@RequestMapping("/root")
public class RootController {
	
	@Reference(version = "0.0.1")
	private IBlogService blogService;
	
	@GetMapping
	public String showRootIndex() {
		return "root/index";
	}
	
	@PostMapping("/publish")
	public String publishContent(Blog blog) throws Exception{
		blogService.publish(blog);
		return "root/index";
	}
	
}



