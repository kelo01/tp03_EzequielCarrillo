package ar.edu.unju.fi.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class FormularioControler {

	@GetMapping("/form-cliente")
	
	public String getForm() {
		return "form-cliente";
	}
	
	
}
	
