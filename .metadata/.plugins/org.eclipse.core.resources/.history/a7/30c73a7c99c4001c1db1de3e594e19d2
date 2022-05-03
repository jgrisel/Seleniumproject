package achatJava;

import static org.junit.Assert.assertEquals;

import java.util.Map;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class achatSteps {
	private Map<String, Integer> listePrix;
	private int totalSum;

@Given("Le prix des produits de cette liste")
	public void le_prix_de_produit_de_cette_liste(Map<String, Integer> listePrix) {
	 this.listePrix = listePrix;
}

@When("Je commande {int} {string}")
public void je_commande(int nombreDeProduit, String produit) {
	int firstPrice = listePrix.get(produit);
    totalSum += firstPrice * nombreDeProduit;
}

@Then("Je dois payer {int} euros")
public void je_dois_payer_euros(int prixAttendu) {
	assertEquals(prixAttendu, totalSum);
}
}
