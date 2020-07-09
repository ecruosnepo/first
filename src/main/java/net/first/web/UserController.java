package net.first.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import net.first.domain.User;
import net.first.domain.UserRepository;

@Controller
@RequestMapping("/users") // 하위 매서드에 모두 적용됨
public class UserController {
	@Autowired
	private UserRepository userRepository;
	
	@PostMapping("")
	public String create(User user) {
		System.out.println("user: " + user);
		userRepository.save(user);
		return "redirect:/users"; // 매서드로 맵핑하려면 redirect: 를 붙여줘야 함
	}
	
	@GetMapping("")
	public String list(Model model) {
		model.addAttribute("users", userRepository.findAll());
		return "/user/list";
	}
}
