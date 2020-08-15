package graficos;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JTextPane;

public class MenuEmergente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoEmergente miMarco=new MarcoEmergente();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
class MarcoEmergente extends JFrame{
	public MarcoEmergente() {
		setBounds(100, 100, 300, 250);
		add(new LaminaEmergente());
		setVisible(true);
	}
	
}

class LaminaEmergente extends JPanel{
	
	public LaminaEmergente() {
		
		//Otra interfaz
		setLayout(new BorderLayout());
			JPanel laminaMenu=new JPanel();
			JMenuBar barraMenu=new JMenuBar();
				JMenu fuente=new JMenu("Fuente");
				JMenu estilo=new JMenu("Estilo");
				JMenu tamaño=new JMenu("Tamaño");
					barraMenu.add(fuente);
					barraMenu.add(estilo);
					barraMenu.add(tamaño);
						laminaMenu.add(barraMenu);
							add(laminaMenu,BorderLayout.NORTH);
		//Con JTextPane Agregamos un area de texto/funciona como una lamina JPanel
		JTextPane miArea=new JTextPane();
			add(miArea,BorderLayout.CENTER);
						
		//1 JPopupmenu la instanciamos
		JPopupMenu emergente=new JPopupMenu();
			//2 Agregar elementos/items al Jpopmenu
			JMenuItem opcion1=new JMenuItem("Opcion 1");
			JMenuItem opcion2=new JMenuItem("Opcion 2");
			JMenuItem ocpion3=new JMenuItem("Opcion 3");
				//3 lo agregamos al menu emergente
				emergente.add(opcion1);
				emergente.add(opcion2);
				emergente.add(ocpion3);
					//4 (componente) esto permite en la lamina se con click derecho salga las opciones
					//Si queremos que se ejecute en la lamina donde estamos
					//setComponentPopupMenu(emergente);//Es como el ADD para agregar
					// el .setComponentPopupMenu(Objeto q hace la accion) en el OBJETO donde queremos que lo escuche
					miArea.setComponentPopupMenu(emergente);
		
		
	}
}