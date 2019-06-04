package asw.progetto.componentA.messagepublisher;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import asw.progetto.componentA.domain.SimpleMessagePublisher;

@Component 
public class SimpleMessagePublisherImpl implements SimpleMessagePublisher {

	private Logger logger = Logger.getLogger(SimpleMessagePublisherImpl.class.toString());

	@Value("${asw.progetto.channel.out}")
	private String channel;

	@Autowired
	private KafkaTemplate<String, String> template;

	@Override
	public void publish(String message) {
		logger.info("PUBLISHING MESSAGE: " + message + " ON CHANNEL: " + channel);
		template.send(channel, message);
		// template.flush();
	}

}
