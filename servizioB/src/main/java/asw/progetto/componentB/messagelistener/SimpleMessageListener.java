package asw.progetto.componentB.messagelistener;

import java.util.logging.Logger;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import asw.progetto.componentB.domain.ConsumerService;

@Component 
public class SimpleMessageListener {

	private Logger logger = Logger.getLogger(SimpleMessageListener.class.toString());

	@Autowired
	private ConsumerService consumerService;

	@Value("${asw.progetto.channel.in}")
	private String channel;

	@Value("${asw.progetto.groupid}")
	private String groupId;

	@KafkaListener(topics = "${asw.progetto.channel.in}", groupId="${asw.progetto.groupid}")
	public void listen(ConsumerRecord<String, String> record) throws Exception {
		logger.info("MESSAGE LISTENER: " + record.toString());
		String message = record.value();
		consumerService.filter(message); 
	}

}
