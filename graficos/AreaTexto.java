package graficos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class AreaTexto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoArea mimarco=new MarcoArea();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoArea extends JFrame {
	public MarcoArea() {
		setBounds(500, 300, 500, 350);
		LaminaArea milamina=new LaminaArea();
		add(milamina);
		setVisible(true);
		
	}
}

class LaminaArea extends JPanel{
	
	private JTextArea miarea;	//Propiedad
	
	public LaminaArea() {	//Constructor
		
		miarea=new JTextArea(8,20);// JtextAare(filas,columnas)
		
			//Creacion de la segunda lamina con el scroll
			JScrollPane	laminaConScroll=new JScrollPane(miarea);	//(ELEMENTO que quiero que quiero que tenga el Scroll)	++ en ADD(le envio este nuevo Objeto "Lamina con el scroll")
		
		miarea.setLineWrap(true);		//Para evitar que se ensanche y salte de linea esto no Controla a lo alto
		
		//add(miarea);	//No se usa si quiero tener un Scroll
		add(laminaConScroll);
		
		JButton miBoton=new JButton("Ver texto");
		
		miBoton.addActionListener(new GestionaArea());//Podemos crear una objeto de la clase ActionListener(Puede ser una CLASE INTERNA DENTRO DE LA LAMINA) o instanciarlo dentro de los parametro	
		
		add(miBoton);
		
	}
	
	private class GestionaArea implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {	//Metodo cuando se hace click imprimara el texto del Text area
			System.out.println(miarea.getText());
			
		}
		
	}
	
	
	
	
}