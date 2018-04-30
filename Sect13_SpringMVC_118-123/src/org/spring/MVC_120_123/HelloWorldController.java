package org.spring.MVC_120_123;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello") //parent-mapping
public class HelloWorldController {
	//need a controller method to show the Initial HTML form
	
	@RequestMapping("/showForm")
	public String showForm()
	{
		return "helloworld-form";
	}
	
	// need a controller method to process the HTML form
	@RequestMapping("/processForm")
	public String processForm()
	{
		return "helloworld";
	}
	
	
	//new Controller method to read Form Data
	//add data to model
	
	@RequestMapping("/processFormVersionTwo")
	public String letsShoutDude(HttpServletRequest request, Model model)
	{
		
		//read a request Parameter from HTML form
		String theName=request.getParameter("studentName");
		
		// Convert that data to all caps
		theName=theName.toUpperCase();
		
		//create the message
		String result = "Yo  !  " +theName;
		
		//add message to model
		model.addAttribute("message", result);

		return "helloworld";
	}
	
	@RequestMapping("/processFormVersionThree")
	public String processFormVersionThree(@RequestParam("studentName") String theName,Model model)
	{
		
		//read a request Parameter from HTML form
		//String theName=request.getParameter("studentName");
		
		// Convert that data to all caps
		theName=theName.toUpperCase();
		
		//create the message
		String result = "hey My Friend from V3 !  " +theName;
		
		//add message to model
		model.addAttribute("message", result);

		return "helloworld";
	}
}
