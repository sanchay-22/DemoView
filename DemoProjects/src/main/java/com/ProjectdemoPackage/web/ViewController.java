package com.ProjectdemoPackage.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.ProjectdemoPackage.domain.Players;
@Controller
public class ViewController {
	@GetMapping("/")
	public String hello(Model model)
	{
		model.addAttribute("player", new Players());
		return"index";
	}
	@PostMapping("/processform")
	public String formSubmit(@ModelAttribute("player") Players player, RedirectAttributes attr)

	{
		attr.addFlashAttribute("player",player);
		return"redirect:/display";
	}
	@GetMapping("/display")
	public String displayForm(@ModelAttribute("player") Players player)
	{
		return"submitForm";
	}
}
