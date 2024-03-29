package asw.progetto.componentA.domain;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;


@Service
public class Aservice {

	@Value("${uname}") 
	/* il nome associato al profilo */ 
	private String name;

	@Autowired 
	private Cservice cService;

	@Autowired
	private SimpleProducerService simpleProducerService;

	private final Logger logger = Logger.getLogger(Aservice.class.toString()); 

	public String getCall(String animal) {

		String nome = name;
		String call = nome +":"+animal;
		logger.info(call);
		cService.callC(call);
		return call;
	}

	public String getCallforGet() {
		return cService.callCGet(); 
	}

	public String getKafkaCall(String animal) {
		String nome = name;
		String call = nome +":"+animal;
		logger.info("sending message: " + call);
		simpleProducerService.publish(call); 
		return call;
	}
}