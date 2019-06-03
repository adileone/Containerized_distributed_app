package asw.progetto.componentA.rest;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import asw.progetto.componentA.domain.Aservice;

@RestController
@RequestMapping("/")
public class AserviceController {

	@Autowired 
	private Aservice aservice;

	private final Logger logger = Logger.getLogger(AserviceController.class.toString()); 

	@PostMapping
	public void getAnimal(@RequestParam String animal) {
		logger.info("callC(): " + aservice.getCall(animal));
	}

	@GetMapping
	public String callCforGet() {
		logger.info("callCForget()");
		return aservice.getCallforGet();
	}

}