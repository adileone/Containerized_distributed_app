package asw.progetto.componentA.serviceC;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import asw.progetto.componentA.domain.Cservice;

@Service 
public class CServiceImpl implements Cservice {

	private final Logger logger = Logger.getLogger(CServiceImpl.class.toString()); 

	@Autowired 
	private CClient cClient;

	@HystrixCommand(fallbackMethod="getFallbackWord")
	public String callC(String sightings) {
		logger.info("XXX qui la chiamata: sto passando " + sightings );
		return cClient.callC(sightings); 
	}

	public String getFallbackWord() {
		logger.info("failed to callC(): using fallback");
		return "something"; 
	}


	@HystrixCommand(fallbackMethod="getFallbackWord")
	public String callCGet() {
		return cClient.callCGet(); 
	}

	public String getFallbackGet() {
		logger.info(" failed to callCGet(): using fallback");
		return "something"; 
	}
}

