package com.backend.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemoController {
	@ResponseBody
	@RequestMapping("/checkattendance")
	public String home() {
		return "출석큐알";
	}

}
