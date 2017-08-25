package cn.sa4e.blog.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.alibaba.dubbo.config.annotation.Reference;

import cn.sa4e.blog.model.Blog;
import cn.sa4e.blog.service.IBlogService;

/**
* Blog控制器
* @author Sa4e e-mail:hasaigive@gmial.com
* @date 2017年8月24日
*/
@Controller
public class BlogController {
	
	@Reference(version = "0.0.1")
	private IBlogService blogService;
	
	@GetMapping("/blogs")
	public String getBlogList(Model model) throws Exception{
		List<Blog> blogList = blogService.getBlogList();
		model.addAttribute("blogList", blogList);
		return "index";
	}
	
	@GetMapping("/content/{id}")
	public String getContent(@PathVariable("id") Long id,Model model) throws Exception{
		Blog content = blogService.getContent(id);
		model.addAttribute("blog", content);
		return "content";
	}
}







