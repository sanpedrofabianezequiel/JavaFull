import javax.swing.*;

public class Peso_ideal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String genero="";
		
		do {
			
			genero=JOptionPane.showInputDialog("Indica tu genero(H/M)");
			
		}while(genero.equalsIgnoreCase("H")==false && genero.equalsIgnoreCase("M")==false);
		
		
		int altura=Integer.parseInt(JOptionPane.showInputDialog("Indique altura"));
		
		
		
		if(genero.equalsIgnoreCase("M")) {
			System.out.println("Peso ideal M: "+ (altura-120));
		}else if(genero.equalsIgnoreCase("H")) {
			System.out.println("Peso ideal H: "+ (altura-110));
		}
		
	}

}
