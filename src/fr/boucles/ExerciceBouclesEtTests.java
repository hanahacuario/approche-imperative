package fr.boucles;

public class ExerciceBouclesEtTests {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 }; // Declarer le tableau

		// Afficher l’ensemble des éléments du tableau grâce à une boucle
		System.out.println("les éléments du tableau sont: ");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i] + " ");
		}
		System.out.println("-------------------------");

		// Afficher l’ensemble des éléments dans l’ordre inverse du tableau

		System.out.println("les éléments dans l’ordre inverse du tableau sont: ");
		for (int i = array.length - 1; i >= 0; i--) {
			System.out.println(array[i]);

		}
		System.out.println("-------------------------");

		// Combiner une boucle et un test de manière à n’afficher que les entiers
		// supérieurs à 3
		
		System.out.println("les éléments entiers supérieurs à 3 sont:"); 

		for (int i = 0; i < array.length; i++) {
			if (array[i] >= 3) {
				System.out.println(array[i]);
			}
		}
		System.out.println("-------------------------");
		//Combiner une boucle et un test de manière à n’afficher que les entiers pairs
		System.out.println("les éléments entiers pairs sont:"); 
		
		
		
		
	}

}
