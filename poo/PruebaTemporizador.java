package poo;
import javax.swing.JOptionPane;
import javax.swing.Timer;

import java.awt.Toolkit;
import java.awt.event.*;
import java.util.*;
public class PruebaTemporizador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Poner un temporizador, para saber la hora cada 5 segundos
		//paso 1
		fechaTmp x=new fechaTmp();
		
		
		Timer tiempo=new Timer(30,x);//Temporizador //Necesito implentar la variable que quiero mostrar
		
		tiempo.start();
		JOptionPane.showMessageDialog(null, "Pulsa aceptar para detener");//lo necesito si o si para poner a funcionar el proyecto
		System.exit(0);//Para salir de la app
		
	}

}
											
class  fechaTmp implements ActionListener{
	
	
	
	public void actionPerformed(ActionEvent e) {
		
		Date t=new Date();
		System.out.println("La hora es: "+ t);
		
		//acceder al sonido o pantalla de sistemas
		Toolkit.getDefaultToolkit().beep();
	}
	
}






