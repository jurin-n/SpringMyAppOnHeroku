

package com.herokuapp.jurin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

@Controller
public class MyAppController {	
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String hello(Model model){
		model.addAttribute("title","サンプル― GET /hello");
		model.addAttribute("message","サンプルです。");
		
		FormModel formModel = new FormModel();
		formModel.setInput("ここに書く！！");
		model.addAttribute("formModel",formModel);
		return "showMessage";
	}
	
	@RequestMapping(value = "/hello", method = RequestMethod.POST)
	public String form(@ModelAttribute FormModel formModel
						, BindingResult result
						, Model model){
		model.addAttribute("title","サンプル― POST /hello");
		model.addAttribute("message","サンプルPOST済み。");
		return "showMessage";
	}
}
