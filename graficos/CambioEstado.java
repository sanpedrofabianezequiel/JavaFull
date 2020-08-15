package graficos;
import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;

import javax.swing.*;

public class CambioEstado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoEstado mimarco=new MarcoEstado();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}

class MarcoEstado extends JFrame{
	
	public MarcoEstado() {		//Constructores
							
		setTitle("Cambio estado");
		setBounds(300, 300, 500, 350);
		setVisible(true);
		
		CambiaEstado estado= new CambiaEstado();
		addWindowStateListener(estado);
	}
}

class CambiaEstado implements WindowStateListener{

	@Override
	public void windowStateChanged(WindowEvent e) {
		// TODO Auto-generated method stub
		//System.out.println("La ventana ha cambiado de estado");
		if(e.getNewState()==Frame.MAXIMIZED_BOTH) {
			System.out.println("es pantalla completa");
		}else if(e.getNewState()==Frame.NORMAL) {
			System.out.println("Esta normal");
		}else {
			System.out.println("es un estado diferente no descripto");
		}
	}
	
}