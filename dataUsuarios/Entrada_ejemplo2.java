import javax.swing.*;
import java.lang.Integer;


public class Entrada_ejemplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String nombre=JOptionPane.showInputDialog("Introduce nombre por favor");
		
		int edad=  Integer.parseInt(JOptionPane.showInputDialog("Introduce edad "));
		
		edad++;
		
		System.out.println("Hola "+nombre+" tu edad es " + (edad));
		

	}

}
