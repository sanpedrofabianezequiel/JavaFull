package graficos;

import java.awt.Color;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ActionMap;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.KeyStroke;

public class PruebaAcciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoAccion miMarco=new MarcoAccion();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		miMarco.setVisible(true);
	}

}


class MarcoAccion extends JFrame{
	public MarcoAccion() {
							//Constructor
		setTitle("Prueba acciones");
		setBounds(600, 350, 600, 300);
		
		panelAccion lamina=new panelAccion();
		add(lamina);
	}
	
	
	
}

class panelAccion extends JPanel{	//Lamina
	
	public panelAccion () {	//Constructor
		
		
		accionColor amarilloB= new accionColor("amarillo",/*new ImageIcon("src/graficos/amarillo.jpg")*/ Color.yellow);
		accionColor azulB= new accionColor("azul",/*new ImageIcon("src/graficos/azul.gif")*/ Color.blue);
		accionColor rojoB= new accionColor("rojo",/*new ImageIcon("src/graficos/rojo.jpg")*/Color.red);

		
		
		/// button con action primera forma
		//JButton botonAmarillo=new JButton(amarillo);
		//add(botonAmarillo); //una forma de agregarlo a la lamina
		
		//button con action segunda forma
		add(new JButton(amarilloB));
		add(new JButton(azulB));
		add(new JButton(rojoB));

	/////////////////////////////////////////////////////////////////////////////////	//Pasos para combinacion de teclas
		
/*1*/		InputMap mapaEntrada=getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);	//mapa de entrada		
/*2*/		KeyStroke teclaAmarillo=KeyStroke.getKeyStroke("ctrl A");			//combinacion de teclas	
			
/*2 bis*/	//dentro del punto 3
			//KeyStroke.getKeyStroke("ctrl A");

/*3*/		mapaEntrada.put(teclaAmarillo, "fondo_amarillo");		//asignar la combinacion de teclas a un OBJETO
					//el objeto creado con PUT es FONDO AMARILLO
					//Vinculo de la COMBINACION con el OBJETO NUEVO
/*4*/		ActionMap mapaAccion=getActionMap(); 
/*5*/		mapaAccion.put("fondo_amarillo", amarilloB);		//asignara el objeto a la ACCION	
					//Vinculo del OBJETO con la ACCION 
		
		
		mapaEntrada.put(KeyStroke.getKeyStroke("ctrl B"),"fondo_azul");
		mapaAccion.put("fondo_azul", azulB);
		
		mapaEntrada.put(KeyStroke.getKeyStroke("ctrl R"), "fondo_rojo");
		mapaAccion.put("fondo_rojo", rojoB);
		

		
		/*JButton botonAmarillo=new JButton("Amarillo");	//Instansiacion
		JButton botonAzul=new JButton("Azul");
		JButton botonRojo=new JButton("Rojo");
		
								//Los agrego a la lamina
		
		
		add(botonAmarillo);
		add(botonAzul);
		add(botonRojo);*/
	
	}
							
	private class accionColor extends AbstractAction{
		
		public accionColor(String nombre, /*Icon icono*/Color color_boton) {
			
			putValue(Action.NAME, nombre);
			/*putValue(Action.SMALL_ICON, icono);*/
			putValue(Action.SHORT_DESCRIPTION,"Poner la lamina de color "+ nombre);// Descripcion

			putValue("color_de_fondo", color_boton);	//Accion
		}
		

		@Override
		public void actionPerformed(ActionEvent e) {
			
			Color c=(Color) getValue("color_de_fondo");// Se podria hacer de esta manera
			
			setBackground(c);
		
			System.out.println("nombre: "+getValue(Action.NAME));	
			
			
		}
		
	}
	
	
}








