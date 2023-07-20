package com.example.demo.evaluacion.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class ControladorLoto {

	@GetMapping({"/loto/menu", "/loto/menu/"})
    public String showLottoMenu() {
        return "loto/lotto-menu";
    }

	@Controller
	public class LottoController {

	    private final LottoService lottoService;

	    @Autowired
	    public LottoController(LottoService lottoService) {
	        this.lottoService = lottoService;
	    }

	    @GetMapping("/loto/genera/49/6/spain")
	    public String generateSpanishLotto(Model model) {
	        int[] combination = lottoService.generateSpanishLottoCombination();
	        model.addAttribute("combination", combination);
	        return "/loto/spanish-lotto";
	    }
	    
	    @GetMapping("/loto/genera/49/6/germany")
	    public String generateGermanLotto(Model model) {
	        // Lógica para generar combinación alemana - 6 de 49
	    	int[] combination = lottoService.generateSpanishLottoCombination();
	        model.addAttribute("combination", combination);
	        return "/loto/german-lotto";
	    }
	    
	    
	    @GetMapping("/loto/genera/49/5/france")
	    public String generateFrenchLotto(Model model) {
	        // Lógica para generar combinación francesa - 5 de 49
	    	int[] combination = lottoService.generateFrenchLottoCombination();
	        model.addAttribute("combination", combination);
	        return "/loto/french-lotto";
	    }

	    @GetMapping("/loto/genera/90/6/italy")
	    public String generateItalianLotto(Model model) {
	        // Lógica para generar combinación italiana - 6 de 90
	    	int[] combination = lottoService.generateItalianLottoCombination();
	        model.addAttribute("combination", combination);
	        return "/loto/italian-lotto";
	    }
	    
	    

	}

    

   

}
