package spring.boot.maven.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

	@RequestMapping("/index")
	public String index() {
		return "MainPage";
	}
	@RequestMapping("/style.css")
	public String style() {
		return "style.css";
	}

	@RequestMapping(method = RequestMethod.GET, value = "/login.html")
	public String login() {
		return "login.html";
	}

}
