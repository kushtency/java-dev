package learn.dev.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// REST api
@RestController("")
public class HomePageController {
	@GetMapping("/home")
	public String homePage() {
		return "hello world";
	}
}
