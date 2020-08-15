package graficos;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.plaf.SliderUI;

public class JSliders2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoSlider mimarco=new MarcoSlider();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mimarco.setVisible(true);
	}

}
class MarcoSlider extends JFrame{
	public MarcoSlider() {
		setBounds(550, 400, 500, 350);
		add(new LaminaSlider());
	}
}

class LaminaSlider extends JPanel{
	private JLabel rotulo;
	private JSlider control;
	private static int contador;
	
	public LaminaSlider() {
		//1 creamos la distribucion de la lamina
		setLayout(new BorderLayout());
		
		//2 iniciamos las variables declaradas
		//parametros el string nombre de la etiqueta
		rotulo= new JLabel("El DSMIV es un Libro sobre las patalogias del ser humano, a nivel mental");
		
		//3iniciamos el Slider
		// parametros(minimo,maximo,valor inicial)
		control=new JSlider(8,50,12);
		
		//4 agregamos las marcas
		control.setMajorTickSpacing(20);
		control.setMinorTickSpacing(5);
		//5 dibuje las marcas
		control.setPaintTicks(true);
		//6 dibujamos las labeles
		control.setPaintLabels(true);
		//7 cambiar el fonton de las labeles
		control.setFont(new Font("Serif",Font.ITALIC,10));
		
		
		//10 poner el control a la esucha con CHANGELISTENER
		//ponerlo a la escucha antes de agregarlo a la lamina y despues de 
		//modificarla como queremos
		control.addChangeListener(new SliderEvento());
		
		
		//8 agregar el Slider a la segunda lamina, ayq eu lo voy a poner  en la parata
		//superior
		JPanel laminaNorte=new JPanel();
		laminaNorte.add(control);
		//9 agregamos la nueva lamina a la parte norte de la Lamina principal
		add(laminaNorte,BorderLayout.NORTH);
		
		
		
		
		// agregar el rotulo a la lamina
		add(rotulo,BorderLayout.CENTER);
	}
	
	//Clase interna dentro de la lamina que maneje los eventos
	private class SliderEvento implements ChangeListener{
		@Override
		
		public void stateChanged(ChangeEvent e) {
			//contador++;
			//para campturar el valor que tiene el Slider en un momento en concreto
			//el CONTROL fue declarado como variable
			
			//int valor=control.getValue();
			//System.out.println("Esta moviendo el Slider"+ valor/*control.getValue()*/);
			
			///11 para setiar el tamaño de la letra
			//que en este caso se llama ROTULO  y es el que vamos a modificar 
			//con el OBJETO en un momento determinado
			
			rotulo.setFont(new Font("Serif",Font.PLAIN,control.getValue()));
			
			
		}
		
	}
	
}