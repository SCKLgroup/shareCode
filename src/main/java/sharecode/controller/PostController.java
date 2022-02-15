package sharecode.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import sharecode.service.PostService;
import sharecode.vo.PostVO;

@Controller
public class PostController {

	@Autowired
	PostService postService;
	
	@RequestMapping(value = "shareCode/post.do")
	public String postInsertAction(PostVO vo) {
		postService.postInsertAction(vo);
		return "/shareCode/list";
	}
	
	@RequestMapping(value = "shareCode/postInfo.do")
	public String postInfoSelect(int no, Model model, HttpSession session) {
		session.setAttribute("postInfo",postService.postInfoSelect(no));
		
		return "/shareCode/post-detail";
	}
	
	@RequestMapping(value = "shareCode/postModify.do")
	public String postInfoUpdate(int no) {
		postService.postInfoUpdate(no);
		
		return "redirect:/shareCode/postInfo.do";
	}
}