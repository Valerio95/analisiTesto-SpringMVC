package it.dstech.formazione.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import it.dstech.formazione.gestione.Gestione;


@Controller
public class ContaVocali {
	
	
	@RequestMapping(value  = "/contaV")
	public ModelAndView checkParameter(@RequestParam("testo") String testo, Model model) {
		Gestione gestione = new Gestione(testo);
		int risultato = gestione.contaVocali();
	return new ModelAndView("risultato", "risultato", risultato);
	}
}
