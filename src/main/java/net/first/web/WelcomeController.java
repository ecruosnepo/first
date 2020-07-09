package net.first.web;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {
	// helloworld 요청이 들어오면 이 매소드 실행
	@GetMapping("/helloworld")
	public String welcome(Model model) {
		// 리턴 값과 이름이 같은 templates 폴더 내의 파일을 불러옴
		// 스프링 2.0 이후로 mustache 파일만 불러오기 가능
		List<MyModel> repo = Arrays.asList(new MyModel("jojo"), new MyModel("yoobie"));
		model.addAttribute("repo", repo);
		return "welcome";
	}
}
