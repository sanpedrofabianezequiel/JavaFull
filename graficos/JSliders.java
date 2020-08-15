package graficos;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Font;

import javax.swing.*;

public class JSliders {	//Controles deslizantes

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoSliders miMarco=new MarcoSliders();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		miMarco.setVisible(true);
	}

}

class MarcoSliders  extends JFrame{
	public  MarcoSliders() {
		setBounds(550, 400, 550, 350);
		setTitle("MarcoSliders");
		add(new LaminaSliders());
	}
}

class LaminaSliders extends JPanel{
	public LaminaSliders() {
		//1 creamos el Sliders
		//JSlider control=new  JSlider();//Controles deslizantes
		//JSlider(valor inicial)
		//JSlider control=new  JSlider(20,100,25);//Controles deslizantes
		
		
		//2 setOrientation(int orientation) hay que usar dentro del construro
		//Jslider o usar el metro SwingConstants.vertical
		//JSlider control=new  JSlider(SwingConstants.VERTICAL,20,100,25);//Controles deslizantes
		JSlider control=new  JSlider(0,100,25);//Controles deslizantes
		//control.setOrientation(SwingConstants.VERTICAL);
		
		//3Para realizar las marcas  . Van a ir de 25 en 25
		control.setMajorTickSpacing(50);
		//4 Para realizar las marcas menores
		control.setMinorTickSpacing(25);
		//5 tenemos que imprimir las marcas cn el siguiente metodo
		control.setPaintTicks(true);
		
		//6para ver los labels /etiquetas
		control.setPaintLabels(true);
		
		//7setiamos la fuente
		control.setFont(new Font("Serif",Font.ITALIC,12));
		
		//8 Iman para acercar el valor del slider ala MARCA MAS SIGUIENTE
		//que queremos antes de agrgar el elemento ala lamina
		control.setSnapToTicks(true);
		
		// agregmos el sliders a la lamina
		add(control);
		
	}
}