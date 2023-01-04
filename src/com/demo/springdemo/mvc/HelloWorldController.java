package com.demo.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {
	
	// need a controller method to show the initial form
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	// need a controller method to process the HTML form
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	// new a controller method to read form data and add data to model
	@RequestMapping("/processFormTwo")
	public String letsShoutDude(HttpServletRequest request, Model model) {
		// read the request parameter from the HTML form
		String theName = request.getParameter("studentName");
		
		// convert the data to all caps
		theName = theName.toUpperCase();
		
		// create a message
		String result = "Yo! "+ theName;
		
		// add message to model
		model.addAttribute("message", result);
		
		return "helloworld";
	}
	
	// new a controller method to read form data and add data to model
		@RequestMapping("/processFormThree")
		public String processFormThree(@RequestParam("studentName") String theName, Model model) {
			
			// convert the data to all caps
			theName = theName.toUpperCase();
			
			// create a message
			String result = "Hey My friend! "+ theName;
			
			// add message to model
			model.addAttribute("message", result);
			
			return "helloworld";
		}

}
