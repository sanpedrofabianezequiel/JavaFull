package graficos;

import java.awt.*;
import javax.swing.*;

public class TrabajandoConFuentes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoConFuentes mimarco=new MarcoConFuentes();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mimarco.setVisible(true);
		
	}

}

///////////////////////////////////////////////
class MarcoConFuentes extends JFrame{
	public MarcoConFuentes() {
								//Constructor
		setTitle("Prueba con fuentes");
		setSize(400,400);
		
		LaminaConFuentes milamina=new LaminaConFuentes();
		add(milamina);
		milamina.setForeground(Color.blue);// escribe 
	}
	
}

///////////////////////////////////////////////////
class LaminaConFuentes extends JPanel{
	
	public void paintComponent(Graphics g) {//override
		super.paintComponent(g);			//Metodos Heredados
	
		
		//CREAMOS LA FONT
		//SETIAMOS
		//DIBUJAMOS
	
		Graphics2D g2=(Graphics2D) g;
		
		Font mifuente=new Font("Courier",Font.BOLD,26);//Creamos la FONT
		
		g2.setFont(mifuente);		//Setiamos
		g2.setColor(Color.blue);	//Setiamos
		g2.drawString("ezequiel", 100, 100);//Dibujar
		
		
		
		//Otra opcion
		g2.setFont(new Font("Arial",Font.ITALIC,12));	//Seteo
		g2.setColor(new Color(128,90,50).darker());			//Seteo
		g2.drawString("Curso de Java", 100, 200);				//dibujo
		
		
	}
}




