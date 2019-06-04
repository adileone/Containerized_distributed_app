package asw.progetto.componentA.serviceC;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;



@FeignClient("${feign.client}")
public interface CClient {

	@PostMapping(value = "/")
	public String callC(@RequestParam("sightings") String sightings);

	@GetMapping(value = "/")
	public String callCGet();

}
