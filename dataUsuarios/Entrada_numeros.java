import javax.swing.*;
import java.lang.*;
import java.util.*;
public class Entrada_numeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double x=10000.0;
		
		//System.out.printf("%1.2f",x/3);
		
		
		/////////////////////////
		Scanner s= new Scanner(System.in);
		
		//int num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad"));
		
		String num1 = JOptionPane.showInputDialog("Ingrese la edad");

		Double num2=Double.parseDouble(num1);
		System.out.printf("%1.2f"  ,Math.sqrt(num2));
		
	}

}
