package calculetteJava;

import java.util.List;

public class Calculette {


	public int Somme(List<Integer> liste_nombre) {
		int sum = 0;
		for (int i = 0; i<liste_nombre.size(); i++)
		    sum += liste_nombre.get(i);
		return sum;
	}
}
