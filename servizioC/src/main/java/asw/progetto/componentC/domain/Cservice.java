package asw.progetto.componentC.domain;

import java.util.LinkedList;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class Cservice {

	@Value("${uname}") 
	/* il nome associato al profilo */ 
	private String name;

	private LinkedList<String> avvistamenti = new LinkedList<String>();

	public LinkedList<String> register(String sightings) {

		String nome = name;
		avvistamenti.add(nome +":"+ sightings);
		return avvistamenti; 
	}
	
	public LinkedList<String> getList() {
		return avvistamenti; 
	}
}
