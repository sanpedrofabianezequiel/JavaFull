import javax.swing.*;
public class Comprueba_mail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean confirmacion=false;
		
		String email=JOptionPane.showInputDialog("Ingrese su email");
		
		for(int i=0;i<email.length();i++) {
			
			if(email.charAt(i)=='@') {
				confirmacion=true;
			}
			
		}
		
		if(confirmacion==true) {
			System.out.print("This is correct");
		}else {
			System.out.print("This is not correct");
		}
		
		
		
		
		
	}

}
