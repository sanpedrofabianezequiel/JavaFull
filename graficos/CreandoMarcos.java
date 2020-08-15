package graficos;
import java.awt.Frame;

import javax.swing.*;//La importe para utilizar el JFrame

public class CreandoMarcos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		miMarco marco1=new miMarco();//Instanciacion
		
		
		marco1.setVisible(true);
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Cerrar mi ventana//Es static tambien
		//marco1.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
	}

}

class miMarco extends JFrame{
	
	public miMarco() {	//Constructor
							//
		
		//setSize(500,300);
	
		
		//setLocation(600,400);
		
		
		setBounds(600,400,550,250); //cambiar tamaño y ubicacion
		setTitle("Mi ventana");	//titulo
		
		//setResizable(false);//si quiero impedir que el usuario cambie o no el tamaño
		
		//setExtendedState(Frame.MAXIMIZED_BOTH);//Maximizar al maximo la pantalla
		//	setExtendedState(6);//Maximizar al maximo la pantalla usando lAS CONSTANTES DE LA API

		
	}									//
	
}