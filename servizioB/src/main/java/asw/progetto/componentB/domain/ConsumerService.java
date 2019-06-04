package asw.progetto.componentB.domain;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;


@Service 
public class ConsumerService {

	private Logger logger = Logger.getLogger(ConsumerService.class.toString());

	@Value("${uname}") 
	/* il nome associato al profilo */ 
	private String name;

	@Autowired 
	private Cservice cService;

	public String filter(String inMessage) {

		String nome = name;
		String call = nome +":"+inMessage;
		logger.info(call);
		cService.callC(call);
		return call;
	}

}
