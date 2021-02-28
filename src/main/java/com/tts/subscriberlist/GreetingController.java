package com.tts.subscriberlist;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {

		@GetMapping("/greeting")
		public String greeting(
				@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
			List<Integer> integerList = new ArrayList<>();
			integerList.add(300);
			integerList.add(18);
			integerList.add(42);
			model.addAttribute("integerList", integerList);
			
			
			model.addAttribute("name", name);
			return "greeting";
		}
		
		@GetMapping("/endpoint")
		public String endpoint() {
			return "endpoint";
		}

	
//		@GetMapping("/formy")
//		public String greetingForm(Model model) {
//			model.addAttribute("form", new Form());
//			return "form";
//		}
//		
//		@PostMapping("/formy")
//		public String greetingSubmit(
//				@ModelAttribute Form form, Model model) {
//			model.addAttribute("form", form);
//			return "formResult";
//		}
		
}
