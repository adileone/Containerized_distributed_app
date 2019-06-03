package asw.progetto.componentC.rest;

import java.util.LinkedList;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import asw.progetto.componentC.domain.Cservice;

@RestController
@RequestMapping("/")
public class CserviceController {

	private final Logger logger = Logger.getLogger(CserviceController.class.toString()); 

	@Autowired 
	private Cservice cservice;

	@GetMapping
	public LinkedList<String> retList() {
		logger.info("inRetList");
		return cservice.getList();
	}

	@PostMapping
	public LinkedList<String> addgetList(@RequestParam(required = false) String  sightings) {
		logger.info("addgetList(): " + sightings);
		return cservice.register(sightings);
	}

}	
