package asw.progetto.componentA.domain;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SimpleProducerService {

	private static final Logger logger = Logger.getLogger(SimpleProducerService.class.toString());

	@Autowired
	private SimpleMessagePublisher simpleMessagePublisher;

	public void publish(String message) {
		logger.info("PUBLISHING MESSAGE: " + message);
		simpleMessagePublisher.publish(message);  
	}

}