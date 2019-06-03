package asw.progetto.componentB.serviceC;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

import feign.Param;


@FeignClient("${feign.client}")
public interface CClient {

	@PostMapping(value = "/")
	public String callC(@Param(value="sightings") String sightings);
}
