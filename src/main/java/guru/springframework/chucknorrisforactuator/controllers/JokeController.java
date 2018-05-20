package guru.springframework.chucknorrisforactuator.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import guru.springframework.chucknorrisforactuator.services.JokeService;

@Controller
public class JokeController {
//This is the instance of the Service
	private JokeService jokeservice;
    @Autowired
	public JokeController(JokeService jokeservice) {
		this.jokeservice = jokeservice;
	}
	@RequestMapping({"/",""})
    public String showJoke(Model model){
//This is the method from the Service
        model.addAttribute("joke", jokeservice.getJoke());
//THis is the name of the view 
        return "chucknorris";	
    }
}
