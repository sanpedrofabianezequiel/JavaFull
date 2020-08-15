import javax.swing.*;
import java.util.*;
import java.lang.*;

public class Adivina_numero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		int aleatorio=(int)(Math.random()*100);
		

		
		Scanner entrada= new Scanner(System.in);
		
		int numero=0;
		int intentos=0;
		
		while(numero!= aleatorio) {
			intentos++;
		
			numero= Integer.parseInt(JOptionPane.showInputDialog("Ingrese su numero y tentemos la suertes"));
			//numero=entrada.nextInt();
			
			
				if(numero<aleatorio) {
					System.out.println("Su numero es mas bajo");
				}else if (numero>aleatorio) {
					System.out.println("Su numero es mas alto");
				}else {
					//Si es correcto
					System.out.println("Sucesfull, You Win!. \nGanaste en "+intentos+" intentos");
				}
				
			
				switch(intentos) {
				
				case 1:
				System.out.println("Te quedan 5 intentos");
				break;
				case 2:
					System.out.println("Te quedan 4 intentos");
					break;
				case 3:
					System.out.println("Te quedan 3 intentos");
					break;
				case 4:
					System.out.println("Te quedan 2 intentos");
					break;
				case 5:
					System.out.println("Te quedan 1 intento");
					break;		
				}
				
				if(intentos>6) {
					System.out.print("Sorry perdiste");
					break;
				}
			
			
		}
		
		
	
		
		
		entrada.close();
		
	}

}
