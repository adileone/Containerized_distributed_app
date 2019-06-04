package asw.progetto.componentB.domain;

import org.springframework.web.bind.annotation.RequestParam;

public interface Cservice {

	public String callC(@RequestParam("sightings") String sighting);
}
