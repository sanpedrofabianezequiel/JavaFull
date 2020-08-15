package graficos;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Leyouts {//Alineacion en Java con Leyaout

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Marco_Layout marco= new Marco_Layout();
		marco.setVisible(true);
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class Marco_Layout extends JFrame{
	
	public Marco_Layout() {
		setTitle("Prueba Acciones");
		setBounds(600, 350, 600, 300);
		
		
		Panel_Layout lamina = new Panel_Layout();//instancio la lamina
		
		FlowLayout disposicion=new FlowLayout(FlowLayout.LEFT);//Determino e instancion la ubicacion del Layout y se lo SET al la lamina
			
		//lamina.setLayout(disposicion);//le seteo la ubicacion forma tradicional
		//lamina.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		//(ubicacionn,separacion horizontal, sepracion vertical)
		//lamina.setLayout(new FlowLayout(FlowLayout.CENTER,75,100));
		
		
		//para que no se pisenlas laminas determino dentro de mi MARCO que es mi contenedor, con el segundo paramatro BORDERLAYOUT
		add(lamina,BorderLayout.NORTH);
		
		
		Panel_Layout2 lamina2=new Panel_Layout2();
		//para que no se pisenlas laminas determino dentro de mi MARCO que es mi contenedor, con el segundo paramatro BORDERLAYOUT
		add(lamina2,BorderLayout.SOUTH);
		
	}
	
}

class Panel_Layout extends JPanel{ //ESTA LAMINA ES COMO UN CONTENEDOR, 1 CONTENEDOR/LAMINA PUEDE TENER SOLO UNA DISPOSICION DETERMINADA, SINO TENGO QUE CREAR MAS LAMINAS
	public Panel_Layout() {
		//setLayout(new FlowLayout(FlowLayout.CENTER,75,100));//Disposicion
		
		//BorderLayout por defecto sin espacios
		//setLayout(new BorderLayout());	//Creo la instancia del BorderLayout
		
		
		//borderlayout Personificado
		//setLayout(new BorderLayout(10, 10));
		
								//Add de la clase Panel, que herda de container,
								//permite que el add, acepte 2 parametros ,(elemento,ubicacion)
		//add(new JButton("Amarillo"),BorderLayout.NORTH);
		//add(new JButton("Rojo"),BorderLayout.SOUTH);
		
		
		
		
		
		setLayout(new FlowLayout(FlowLayout.LEFT));	
		add(new JButton("Amarillo"));//FlowLayout no necesita 2 parametros
				add(new JButton("Rojo"));
	
	}
	
}


class Panel_Layout2 extends JPanel{

	public Panel_Layout2() {
		
		setLayout(new BorderLayout());
		add(new JButton("Azul"),BorderLayout.WEST);
		add(new JButton("Verde"),BorderLayout.EAST);
		add(new JButton("Negro"),BorderLayout.CENTER);
	}
	
	
}

