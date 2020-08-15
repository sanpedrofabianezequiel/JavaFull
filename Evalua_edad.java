import java.util.*;
public class Evalua_edad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner s= new Scanner(System.in);
		
		System.out.println("Introduce tu edad por favor");
		
		int edad= s.nextInt();
		
		if(edad>=18) {
			
			System.out.println("Usted es mayor de 18 años");
			
		}else {
			System.out.println("Usted es menor de 18 años");
		}
		
		
		
	}

}
