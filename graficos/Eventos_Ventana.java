package graficos;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;

public class Eventos_Ventana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoVentana miMarco= new MarcoVentana();
		miMarco.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		MarcoVentana miMarco2=new MarcoVentana();
		miMarco2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		miMarco.setTitle("ventana 1");
		miMarco2.setTitle("Ventana 2");
		miMarco.setBounds(300, 300, 500, 350);
		miMarco2.setBounds(900, 300, 500, 350);
	}

}

class MarcoVentana extends JFrame{
	
	public MarcoVentana() {
		/*setTitle("Respondiendo");
		setBounds(300, 300, 500, 350);*/
		setVisible(true);
		
		M_Ventana oyente_ventana=new M_Ventana();
		addWindowListener(oyente_ventana);//a la escucha
	}
	
}

 class M_Ventana extends WindowAdapter {

	
	@Override
	public void windowIconified(WindowEvent e) {
	
		//Mimizacion de ventana
		System.out.println("Ventana minimizada");
	}

	


	 
 }