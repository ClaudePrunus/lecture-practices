package com.revature.controller;

import static com.revature.util.ClientMessageUtil.REGISTRATION_SUCCESSFUL;
import static com.revature.util.ClientMessageUtil.SOMETHING_IS_WRONG;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.revature.model.ClientMessage;
import com.revature.model.Hero;
import com.revature.service.HeroService;

//this will tell Spring MVC that this class can handle HTTP requests
@Controller
//@RequestMapping specifies a URL at which the method is available - binding a function/class to a URL pattern (GET or POST)
@RequestMapping("/api")
public class HeroControllerImpl implements HeroController {
	
	//since this controller relies on the service layer, we need to inject this dependency
	@Autowired
	HeroService heroService;

	/*
	 *Get mapping specifies that if the client sends a get request to this URL, this method will trigger the response 
	 *URL: 0
	 *-------------
	 *@ResponseBody specifies what we return to the client (typically in JSON format) -> Java (JSON marshaling object)
	 */
	@Override
	@GetMapping("/findAllHeroes") //case sensitive
	public @ResponseBody List<Hero> findAllHeros() {
		// we would have to call the service layer here
		return heroService.getAllHeroes();
	}

	@Override
	@PostMapping("/register") //automatically allows us to create new resources through our controller
	//@RequestBdy specifies the time of information the method is taking in -> un-marshaling (taking in JSON object and turning into Java objects)
	public @ResponseBody ClientMessage registerHero(@RequestBody Hero hero) {
		/* based on whether the insert operation is successful, we will return a specific ClientMessage
		* when I call the service method 
		*
		*But if it is successful, we send a SUCCESS message; if not successful, we sent back a message "something went wrong"
		*/
		return heroService.registerHero(hero) ? REGISTRATION_SUCCESSFUL : SOMETHING_IS_WRONG;
	}

	@Override
	@GetMapping("/findHero")
	//@RequestParam will extract name from params of the URL for us
	//e.g. http://localhost:8080/HelloSpringMVCandSpringData/api/findHero?name=bob
	public @ResponseBody Hero findHero(@RequestParam String name) {
		return heroService.getHero(name); //thanks to Jackson Databind, this will return a JSON object
	}

}
