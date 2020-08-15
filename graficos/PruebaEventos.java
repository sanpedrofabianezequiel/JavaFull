package graficos;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class PruebaEventos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoBotones boton=new MarcoBotones();
		boton.setVisible(true);
		boton.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}

}

class MarcoBotones extends JFrame{
	
	public MarcoBotones()		//Constructor
	{
		setTitle("Botones y Eventos");
		setBounds(700,300,500,300);
		//Lamina instanciacion
		LaminaBotones milamina=new LaminaBotones();
		//le agregamos la lamina al JFrame
		add(milamina);
	}
	
}

class LaminaBotones extends JPanel {
	

	JButton botonAzul=new JButton("Azul");//Instansiacion
	JButton botonAmarillo=new JButton("Amarillo");// Instansiacion
	JButton botonRojo=new JButton("Rojo");				

	public LaminaBotones() {		//Constructor
		add(botonAzul);			
		add(botonAmarillo);
		add(botonRojo);
		
		ColorFondo amarillo=new ColorFondo(Color.yellow);	//constructor
		ColorFondo rojo=new ColorFondo(Color.red);
		ColorFondo azul=new ColorFondo(Color.blue);
		
		botonAzul.addActionListener(azul);//referencia, a la propia lamina con this										 
		botonRojo.addActionListener(rojo);
		botonAmarillo.addActionListener(amarillo);
	}
	
	
	
	
	
	

	
	///////////////////////////Clase interna
	
	private class ColorFondo implements ActionListener{		//

		private Color colorDeFondo;		//Propiedades				//
																		//
		public ColorFondo(Color c) {//Parametro de tipo Color				//
			colorDeFondo=c;														//
		}																			//
																										
		
		@Override
		public void actionPerformed(ActionEvent e) {	//Override de ACTION  LISTENER
			// TODO Auto-generated method stub
			
			setBackground(colorDeFondo);
		}
	
	}
	
	
	
	
	
}








