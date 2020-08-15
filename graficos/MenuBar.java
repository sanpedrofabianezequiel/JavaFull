package graficos;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;

public class MenuBar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoBar miMarco=new MarcoBar();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		miMarco.setVisible(true);
	}

}
class MarcoBar extends JFrame{
	public MarcoBar() {
		setBounds(500, 300, 550, 400);
		add(new LaminaBar());
	}
}


class LaminaBar extends JPanel{
	public LaminaBar() {//Constructor
		setLayout(new BorderLayout());
		//1 isntanciamos JMenuBar
		//con esto creamos el soporte "la barra del menu"
		JMenuBar miBarra=new JMenuBar();
		JTextPane miArea=new JTextPane();
		
		//2 Jmenu
		JMenu archivo=new JMenu("Archivo");
		JMenu edicion=new JMenu("Edicion");
		JMenu herramientas=new JMenu("Herramientas");
		
		//**Jmenu submenu
		JMenu opciones=new JMenu("Menu");
		
		//3Antes de agregarlos a al barra
		JMenuItem guardarItem= new JMenuItem("Guardar");
		JMenuItem guardarComoItem=new JMenuItem("Guardar Como");
		
		//Con imagenes
		//Instanciar de la clase new ImageIcon() Ya que implenta la interfaz
		//ICON
		JMenuItem cortarItem=new JMenuItem("Cortar",new ImageIcon("src/graficos/cortar.gif"));
			
			//Para mover de lugar la imagen, ya que por defecto aparece a la izquierda
		JMenuItem copiarItem=new JMenuItem("Copiar",new ImageIcon("src/graficos/copiar.gif"));
				//Esto pone por defecto el TEXTO a la izquierda	
						copiarItem.setHorizontalTextPosition(SwingConstants.LEFT);
					
			
		
		JMenuItem pegarItem=new JMenuItem("Pegar",new ImageIcon("src/graficos/pegar.gif"));
		
		JMenuItem generalesItem=new JMenuItem("General");
		
		//***Submenues
		JMenuItem opcion1=new JMenuItem("Opciones2");
		JMenuItem opcion2=new JMenuItem("Opciones2");
		opciones.add(opcion1);
		opciones.add(opcion2);
		
		
		////
		//4 Determinar que itemes van a que menu.
		archivo.add(guardarItem);
		archivo.add(guardarComoItem);
		edicion.add(cortarItem);
		edicion.add(copiarItem);
		edicion.add(pegarItem);
		
		//PARA PONER SEPARADORES, usamos el metodo de Jmenu
		edicion.addSeparator();
		
		edicion.add(opciones);//Aca le decimos que en vez de un item, queremos MENU
		
		herramientas.add(generalesItem);
		
		//5 Agregar un subMenu al Menu
		
		
		// agregar los JMenu a la barra
		miBarra.add(archivo);
		miBarra.add(edicion);
		miBarra.add(herramientas);
			//Agregamos la barra a la lamina
		JPanel laminaNorte=new JPanel();
		laminaNorte.add(miBarra);
		add(laminaNorte,BorderLayout.NORTH);
		add(miArea,BorderLayout.CENTER);
		
		
	}
}