package fr.operateurs;

public class DeclarationOperateurs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b =20;
		boolean testEt = a>0 && b<10;
		boolean testOu = a>0 || b<10;
		
		
		
		
		
		System.out.println(b);
		System.out.println(testEt);
		System.out.println(testOu);
		
		//TESTEZ LES OPERATEURS COMBINES

		a = a+1;
		System.out.println(a);
		
		a++; //incremente a de 1
		System.out.println(a); 
		
		a += 1; // egale a a+1
		System.out.println(a); 
		
		
	}

}
