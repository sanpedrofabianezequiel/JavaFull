import javax.swing.*;
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long resultado=(long)1;
		int numero=Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero"));
		
		for(int i=numero;i>0;i--) {
			resultado=resultado*i;
		}
		
		System.out.println("El numero factriado es: "+resultado);
		
		
		
		
		
	}

}
