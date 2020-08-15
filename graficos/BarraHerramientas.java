package graficos;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JToolBar;

public class BarraHerramientas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoAcciones miMarco=new MarcoAcciones();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		miMarco.setVisible(true);
	}

}
class MarcoAcciones extends JFrame{
	JPanel lamina;	//	propiedad
	
	public MarcoAcciones() {
		setBounds(500, 300, 600, 450);
		setTitle("Marco con Barra");
		lamina=new JPanel();
		add(lamina);
		
			//"Instancias"
			AccionColor azul=new AccionColor("Azul", new ImageIcon(""), Color.BLUE);
			AccionColor rojo=new AccionColor("Rojo", new ImageIcon(""), Color.RED);
			AccionColor amarillo=new AccionColor("Amarillo", new ImageIcon(""),Color.yellow);
			
				AbstractAction accionSalir=new AbstractAction("Salir",new ImageIcon("")) {
					@Override
					public void actionPerformed(ActionEvent e) {
						//Para salir
						System.exit(0);
					}
				};
			
		JMenuBar barraMenu=new JMenuBar();	
			JMenu menu=new JMenu("Color");
				//Agregar las instancias al Menu
				menu.add(azul);
				menu.add(rojo);
				menu.add(amarillo);
				
					barraMenu.add(menu);
					//Como no le estoy dando el Layout utilizo el metodo de Jframe
					//para setiar la barra en el MARCO
					setJMenuBar(barraMenu);
					//---------------------------BARRA DE HERRAMIENTAS
						JToolBar barraHerramientas=new JToolBar();
							//Agregar funcionalidad del tipo ABSTRACTACTION/ ACTION a 
							//los elemntos de la barra
							barraHerramientas.add(azul);
							barraHerramientas.add(amarillo);
							barraHerramientas.add(rojo);
								barraHerramientas.addSeparator();
									barraHerramientas.add(accionSalir);
									
									
								add(barraHerramientas,BorderLayout.NORTH);
	}
	
		//Clases internas
		private class AccionColor extends AbstractAction{
			
			//Utilizo el constructor como un creador de Diccionario con Key y values
			//Por ende uso el Putvalue (KEY,value)
		    public AccionColor(String nombre,Icon icono,Color c) {	//Constructor
		    	putValue(Action.NAME, nombre);
		    	putValue(Action.SMALL_ICON, icono);
		    	putValue(Action.SHORT_DESCRIPTION, "Color de fondo.."+ nombre);
		    	putValue("Color", c);
		    }
			
			
			@Override
			public void actionPerformed(ActionEvent e) {
					//Casteo:
						//Utilizo un Diccionario con la Key
				
					Color colorRecibido=(Color) getValue("Color");
						//Agrego el color a la lamina segun el ingresado
						lamina.setBackground(colorRecibido);
					
			}
			
		}
	
}

