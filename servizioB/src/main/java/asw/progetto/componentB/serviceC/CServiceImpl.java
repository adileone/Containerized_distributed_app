package asw.progetto.componentB.serviceC;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import asw.progetto.componentB.domain.Cservice;



@Service 
public class CServiceImpl implements Cservice {

	private final Logger logger = Logger.getLogger(CServiceImpl.class.toString()); 

	@Autowired 
	private CClient cClient;

	@HystrixCommand(fallbackMethod="getFallbackWord")
	public String callC(@RequestParam("sightings") String sightings) {
		logger.info("XXX qui la chiamata: sto passando " + sightings );
		return cClient.callC(sightings); 
	}

	public String getFallbackWord() {
		logger.info("failed to callC(): using fallback");
		return "something"; 
	}
}

