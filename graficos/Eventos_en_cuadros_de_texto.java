package graficos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;


public class Eventos_en_cuadros_de_texto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoPrueba mimarco=new MarcoPrueba();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
	}

}

class MarcoPrueba extends JFrame{
	
	public  MarcoPrueba() {
		setBounds(500, 300, 500, 350);
		//Agrego la lamina al Marco
		LaminaPrueba milamina=new LaminaPrueba();
		add(milamina);
		setVisible(true);
	
	}

}

class LaminaPrueba extends JPanel{
	
	
	public LaminaPrueba() {
		JTextField texto=new JTextField("",20);
		
		Document midoc= texto.getDocument();	//Perteneciente a la clase JtextField
													//Poner ese document a la escucha
		EscuchaTexto el_evento=new EscuchaTexto();
		
		midoc.addDocumentListener(el_evento);	//Lo pongo a la escucha, es el que produce el SONIDO
		
	
		add(texto);
	}
	
	private class EscuchaTexto implements DocumentListener{//Clase privada ESCUCHADORA

		@Override
		public void insertUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub
			System.out.println("Se ingreso texto en TextField");
		}

		@Override
		public void removeUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub
			System.out.println("Se a borrado texto en TextField");
		}

		@Override
		public void changedUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub
			System.out.println("Se modifico el texto en TextField");
		}	
		
	}
	
	
}

