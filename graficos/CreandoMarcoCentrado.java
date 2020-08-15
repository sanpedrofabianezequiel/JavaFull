package graficos;

import java.awt.Toolkit;
import java.awt.*;

import javax.swing.*;

public class CreandoMarcoCentrado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoCentrado mimarco=new MarcoCentrado();
		mimarco.setVisible(true);
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}


class MarcoCentrado extends JFrame{
	
	public MarcoCentrado() {	//Constructor
		
		Toolkit mipantalla=	Toolkit.getDefaultToolkit();	//Obtener datos de
																//Pantalla
		Dimension tamanoPantalla= mipantalla.getScreenSize();
		
		int anchoPantalla=tamanoPantalla.width;
		int alturaPantalla=tamanoPantalla.height;
		////////////////////////////////////////////////
		
		
		
		setSize(anchoPantalla/2,alturaPantalla/2);	
		setLocation(anchoPantalla/4,alturaPantalla/4);
		
		
		///////////////////////////////////////////////
		setTitle("Marco Centrado");
		
									//Cambiar el icono de
		Image miIcono=mipantalla.getImage("src/graficos/icono.jpg");	//marco
		
										//Establecer este icono
		setIconImage(miIcono);				//
		
		
	}
	
}