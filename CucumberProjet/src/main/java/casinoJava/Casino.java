package casinoJava;

public class Casino {
	String message;

	public String autorisation(Client client) {
		if (client.age>17 && client.gambler == false) {
			message = "of course, come in" ;
	}
		else {
			message = "no way, get out my face !" ;
		
	}
		return message;
	}
}
