

package com.herokuapp.jurin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

@Controller
public class LoginController {	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String hello(Model model){
		model.addAttribute("title","ログイン");
		model.addAttribute("message","ログイン");
		
		LoginFormModel loginFormModel = new LoginFormModel();
		model.addAttribute("loginFormModel",loginFormModel);
		return "login";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String form(@ModelAttribute LoginFormModel loginFormModel
						, BindingResult result
						, Model model){
		model.addAttribute("title","ログイン");
		model.addAttribute("message","ログイン");
		return "login";
	}
}
