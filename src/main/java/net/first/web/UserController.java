package net.first.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {
	private List<User> users = new ArrayList<>();
	
	@PostMapping("/create")
	public String create(User user) {
		System.out.println("userId: " + user);
		users.add(user);
		return "redirect:/list"; // 매서드로 맵핑하려면 redirect: 를 붙여줘야 함
	}
	
	@GetMapping("/list")
	public String list(Model model) {
		model.addAttribute("users", users);
		return "list";
	}
}
