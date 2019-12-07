package controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import dao.doggyDAO;
import model.doggyModel;

@RestController
@RequestMapping("/post")
public class doggyController {

	@Autowired
	private doggyDAO dao;
	
	@PostMapping("/makePosts")
	public String makePost(List<doggyModel> posts) {
		dao.saveAll(posts);
		return "Posts was maked: "+posts.size();
	}
	
	@GetMapping("/getPosts")
	public List<doggyModel> getPosts(){
		return (List<doggyModel>) dao.findAll();
	}
	
}
