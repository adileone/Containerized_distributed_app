package asw.progetto.componentC;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient 
public class ServizioCApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServizioCApplication.class, args);
	}

}
