import java.util.*;
import javax.swing.*;


public class Areas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner x=new Scanner(System.in);
		System.out.println("Elige una opcion: \n1:Cuadrado. \n2:Rectangulo. \n3:Triangulo. \n4:Circulo ");
		
		int valor= x.nextInt();
		
		switch(valor) {
		
			case 1:
				int ladoCuadrado= Integer.parseInt( JOptionPane.showInputDialog("Introduce el lado"));
				System.out.println("El are del cuadrado es : "+ Math.pow(ladoCuadrado, 2));
				break;
			case 2:
				int base=Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
				int altura=Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));
				System.out.println("El are del Rectangulo es : "+ (base*altura));			
				break;
			case 3:
				base=Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
				altura=Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));
				System.out.println("El are del Triangulo es : "+ (base*altura)/2);			
				break;
			case 4:
				int radio=Integer.parseInt(JOptionPane.showInputDialog("Introduce el radio"));
				
				System.out.print("El are del ciruclo es: ");
				
				System.out.printf("%1.2f", Math.PI*(Math.pow(radio,2)) );
				break;
			default :
				System.out.print("Numero incorrecto");
		
		}
		
		
	}

}
