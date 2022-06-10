package fr.algorithmie;

public class AffichageSuite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		System.out.println("-------------------------");
		
		for (int i = 0; i <= 10; i = i + 2) {
			System.out.println(i);
		}
		
		System.out.println("-------------------------");
		
		for (int i = 1; i < 10; i = i + 2) {
			System.out.println(i);
		}
		
		int i = 1;
		while (i < 10) {
			int nombre = i+1;
			System.out.println(nombre);
			
		}
	}
		

}
