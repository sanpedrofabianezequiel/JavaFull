package poo;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.Timer;
import java.awt.Toolkit;
public class PruebaTemporizador2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			Reloj miReloj=new Reloj(/*3000,true*/);
			
										//Poner en funcionamiento con el metodo enMARCHA
				miReloj.enMarcha(3000,true);
					
				JOptionPane.showMessageDialog(null, "Aceptar para salir");
					System.exit(0);
	}

}

class Reloj{
	

	
	/*public Reloj(int intervalo,boolean sonido) {//Constructor
													//
				this.intervalo=intervalo;				//
				this.sonido=sonido;							//
	}															//
	*/
	
	public void enMarcha(int intervalo,final boolean sonido) {			//Metodo
											//
		class dameLaHora2 implements ActionListener{//Clase interna LOCAL por eso en private
			//Puede acceder a los campos que la engloba
				public void actionPerformed(ActionEvent e) {			//
				Date ahora=new Date();										//
				System.out.println("EL horario es "+ ahora);					//
				if(sonido) {								
				Toolkit.getDefaultToolkit().beep();	}
				}																		
																							//
				}											//
		dameLaHora2 oyente=new dameLaHora2();//Escuchador     //
																//
		Timer miTemporizador=new Timer(intervalo,oyente);		  //Timer
																	//
		miTemporizador.start();										  //
		
	}
	
	
	/*private class dameLaHora2 implements ActionListener{//Clase interna EXTERNA por eso en private
															//Puede acceder a los campos que la engloba
		public void actionPerformed(ActionEvent e) {			//
				Date ahora=new Date();					//
				System.out.println("EL horario es "+ ahora);//
				if(sonido) {								
					Toolkit.getDefaultToolkit().beep();	}
		}																//
																			//
	}*/																			//
	
	
	
	
}