import javax.swing.*;

public class Acceso_aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String usuario="";
		String pass="";
		
		
		
		
		while(usuario.equalsIgnoreCase("ezequiel")==false) {
			usuario=JOptionPane.showInputDialog("Ingrese su usuario");
			if(usuario.equals("ezequiel")==false) {
				System.out.println("Usuario Incorrecto\nSugerencias.. Su nombre");
			}
		}
		System.out.print("Usuario correcto");
		
		//pass
		while(usuario.equals(pass)==false) {			
			pass=JOptionPane.showInputDialog("Introduce la contraseña");
			if(usuario.equals(pass)==false) {
				System.out.println("Contraseña incorrecta");				
			}
			
			
		}
		
		System.out.println("Contraseña Correcta");
		
		
	
		
		
	}

}
