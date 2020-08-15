package graficos;

import java.awt.*;
import javax.swing.*;

public class EscribiendoEnMarco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoConTexto mimarco=new MarcoConTexto();	//Instanciacion
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Que hace cuando termina
		
		
	}

}


class MarcoConTexto extends JFrame{
	
	public MarcoConTexto() {			//Constructor
		setVisible(true);
		setSize(600,450);
		setLocation(400,200);
		setTitle("Primer Texto");
		Lamina milamina= new Lamina();		//Instanciacion del tipo lamina
		add(milamina);						//Para agregarla
	}	
}



////////////////////////////////////////
class Lamina extends JPanel{
	
	public Lamina() {					//Constructor
						
	}
	
	public void paintComponent(Graphics g) {	//Override
		
		super.paintComponent(g);					//uso los metodos Padre
														//Jcomponen que extends
															//JPanel
		g.drawString("Estamos aprendiendo Swing", 100, 100);//string+x+y
	}															//X + Y dentro del Marco ubicacion
	
}





