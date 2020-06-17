package it.dstech.formazione.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SceltaOperazione {
	
	
	@RequestMapping(value  = "/controllaFrase")
	public ModelAndView checkParameter(@RequestParam("testo") String testo, Model model) {
		System.out.println(testo);
	return new ModelAndView("sceltaOperazione", "testo", testo);
	}

}
