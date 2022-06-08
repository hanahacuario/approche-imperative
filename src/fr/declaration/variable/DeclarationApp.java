package fr.declaration.variable;

public class DeclarationApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte a = 127; //stock des entier entre -128 et 127
		short b = 32767; //stock des nombres 
		int c = 452369; // stock des grans entiers entre -2.1 milliards et 2.1 milliards
		long d = 6546546565654L; //stock des grands entiers jusqu'a bp 10 ^38
		float f = 3.1415f;
		double valeur = 15.2398;
		char monChar = 'G';
		String adresse = "43 avenue du languedoc";
		
		boolean test = false;
		
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(f); //syso +CTRIL +SPACE
		System.out.println(valeur);
		System.out.println(monChar);
		System.out.println(adresse);
		System.out.println(test);
		
		String randomString= "Voici le resultat d'un calcul :\n1+5=6";
		System.out.println(randomString);
		
		
		
		
		
		
	}

}
