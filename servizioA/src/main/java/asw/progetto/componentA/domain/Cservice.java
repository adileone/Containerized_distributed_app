package asw.progetto.componentA.domain;

import org.springframework.web.bind.annotation.RequestParam;

public interface Cservice {

	public String callC(@RequestParam("sightings") String avvistamento);

	public String callCGet();
}
