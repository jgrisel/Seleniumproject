package calculetteJava;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;

import casinoJava.Client;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CalculetteSteps {
	
	List<Integer> liste_nombre = new ArrayList<Integer>();

@Given("I have entered {int} into the calculator")
public void i_have_entered_into_the_calculator(Integer int1) {
	liste_nombre.add(int1);
	System.out.println("le nombre est : " +int1);
	System.out.println("la liste de nombre est : " +liste_nombre);
}

@When("I press add")
public void i_press_add() {
	System.out.println("J'appuie sur la touche enter pour afficher le r?sultat");  
}

@Then("the result should be {int} on the screen")
public void the_result_should_be_on_the_screen(Integer int1) {
	Calculette calculette = new Calculette();
	 int Somme_totale= calculette.Somme(liste_nombre);
	 System.out.println("La somme de la liste de nombres est : " +Somme_totale);
	 Assert.assertEquals((int)int1, Somme_totale);   
}
}