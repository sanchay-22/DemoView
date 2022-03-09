package com.example.demo.project;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller 

public class ViewController {
	
	@GetMapping("/")
	
	public String Method(Model modelobj)
	{
		model.addAttribute("player", new playerclass());
		return"formview";
	}

}
