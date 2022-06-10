package fr.boucles;

public class ExerciceTableauEntier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] tableau = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		System.out.println("le premier élément du tableau est " + tableau[0]);

		System.out.println("-------------------------");

		System.out.println("la longueur du tableau est " + tableau.length);

		System.out.println("-------------------------");
		
		System.out.println("le dernier élément du tableau est " + tableau[tableau.length-1]);
		
		System.out.println("-------------------------");
		
		tableau[4] = 8; //je modifie la valeur de l’élément d’index 4 et donnez lui la valeur 8
		
		System.out.println("la nouvelle valeur de l'element de l'index 4 est " + tableau[4]);
		
	}

}
