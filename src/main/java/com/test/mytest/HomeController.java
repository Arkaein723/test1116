package com.test.mytest;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	public String home(Locale locale, Model model) {
		String commit_1 = "asdf";
		String commit_2 = "asdf";
		
		return "home";
	}
	
}
