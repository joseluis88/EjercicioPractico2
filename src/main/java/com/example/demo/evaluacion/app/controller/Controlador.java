package com.example.demo.evaluacion.app.controller;

import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Controlador {
	// Generar un índice aleatorio
	private Random random = new Random();
	
	
	@GetMapping({"/", "/home", "", "/index"})
	public String proverbioChino(Model model){
		
		String[] proverbios = {
	            "El que pregunta es tonto por cinco minutos, pero el que no pregunta sigue siendo tonto para siempre.",
	            "No me digas cómo luchaste, dime cómo caíste y volviste a levantarte.",
	            "El mejor momento para plantar un árbol fue hace 20 años. El segundo mejor momento es ahora.",
	            "El sabio no dice lo que sabe, el necio no sabe lo que dice.",
	            "La mejor época para sembrar un árbol fue hace 20 años. La segunda mejor época es ahora.",
	            "El que golpea la piedra con paciencia y perseverancia, termina por pulirla.",
	            "El que vive en armonía con sí mismo, vive en armonía con el universo.",
	            "El que ha dicho la palabra, ha puesto la mano en el puñal.",
	            "Cuando soplan vientos de cambio, algunos construyen muros, otros construyen molinos.",
	            "Si no cambias la dirección, es probable que termines llegando donde te diriges."
	        };

	       
	        int indiceProverbio = random.nextInt(proverbios.length);

	        // Obtener el proverbio aleatorio
	        String proverbioAleatorio = proverbios[indiceProverbio];
		
	        model.addAttribute("valor", "Recogido de la ruta: " + proverbioAleatorio);
		
		
		return "index";
	}
}
