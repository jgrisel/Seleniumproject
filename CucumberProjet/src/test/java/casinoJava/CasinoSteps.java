package casinoJava;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CasinoSteps {
	
	private List<Map<String, String>> liste_personne;
	List<Client> liste_client;
	int i = 1;
	
	@Given("the following persons")
	public void the_following_persons(List<Map<String, String>> liste_personne) {
		this.liste_personne=liste_personne;
		liste_client = new ArrayList<Client>();
		for (Map<String, String> m : liste_personne) {
			int age = Integer.parseInt(m.get("age"));
			boolean gambler = Boolean.parseBoolean(m.get("gambler"));
			Client client = new Client(age, gambler);
			liste_client.add(client);
			System.out.println("client " +i+ " age = " +client.age+ " gambler = " +client.gambler);
			i++;
		} 
		
	}

	@When("they ask if they could go in a casino")
	public void they_ask_if_they_could_go_in_a_casino() {
		
		}


	@Then("the bouncer should say {string}")
	public void the_bouncer_should_say(String string) {
		for(Client client : liste_client ) {
			Casino casino = new Casino();
			String message = casino.autorisation(client);
			System.out.println(message);
			assertEquals("l'assertion a ?chou? veuillez corriger le code",string,message);
			}
	}
	
}
