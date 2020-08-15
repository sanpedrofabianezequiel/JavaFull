package graficos;

import java.awt.GraphicsEnvironment;

import javax.swing.*;


public class pruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		String fuente=JOptionPane.showInputDialog("Introduce fuente");
		
		boolean estalafuente=false;
		
		
		//Todas las fuentes que tengo en mi PC
		String [] nombresDeFuentes =  GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		
		
		
		for(String nombredelafuente: nombresDeFuentes) {
			//System.out.println(nombredelafuente);
			if(nombredelafuente.equals(fuente)) {
				estalafuente=true;
			}
			
		}
		if(estalafuente) {
			System.out.println("Fuente Instalada");
		}else {
			System.out.println("No esta instalada la fuente");
		}
		
		
		
	}

}
