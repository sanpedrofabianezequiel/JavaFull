package graficos;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;


public class CampoPassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoPassword miMarcoPassword=new MarcoPassword();
		miMarcoPassword.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoPassword extends JFrame {
	public MarcoPassword() {	//Constructor
		setTitle("Marco Password");
		setBounds(400, 300, 550, 400);
		LaminaPassword milamina=new LaminaPassword();
		add(milamina);
		setVisible(true);
	}
	
}

class LaminaPassword extends JPanel{
	JPasswordField contraseņa;//Propiedad
	
	public LaminaPassword() {	//Constructor, Lamina Principal	
		setLayout(new BorderLayout());
		
		
		
		
		
		///Laminas internas
		JPanel lamina_superior=new JPanel();
		lamina_superior.setLayout(new GridLayout(2,2));
			//Ubicacion de la lamina interna dentro de la PRINCIPAL
			add(lamina_superior,BorderLayout.NORTH);
			
		JLabel etiqueta1=new JLabel("Usuario",JLabel.CENTER);	//Etiquetas
		JLabel etiqueta2=new JLabel("Contraseņa",JLabel.CENTER);	//etiquetas
		JTextField usuario=new JTextField(15);			//Textos con longitud
		
		
		
		
		contraseņa=new JPasswordField(15);	//Textos con longitud
		//Instancia el Custom Escuchador
				CompruebaPass comprueba=new CompruebaPass();			
		contraseņa.getDocument().addDocumentListener(comprueba);
			
				//A diferencia a los otros ADDACTIONLISTENER al objeto escuchador, se le agrega getDocument()
		
		
		lamina_superior.add(etiqueta1);	//Distribucion dentro de la lamina por que es 2,2
		lamina_superior.add(usuario);
		
		lamina_superior.add(etiqueta2);
		lamina_superior.add(contraseņa);
		
		//Lamina internas 2
		
		JPanel lamina_inferior=new JPanel();
		lamina_inferior.setLayout(new FlowLayout());
		
		Button boton= new Button("Enviar");
		lamina_inferior.add(boton);
		
		add(lamina_inferior,BorderLayout.SOUTH);
	
	}
	
	
	private class CompruebaPass implements DocumentListener{//Para comprobar
		
		@Override
		public void insertUpdate(DocumentEvent e) {
			//Comprueba la longitud del password
			char[] contraseņa_;
				//Neceito que contraseņa sea global en vez de dentro del constructor
			contraseņa_=contraseņa.getPassword();	//Con esto almaceno todos los caracteres que tiene la contraseņa
			
				if(contraseņa_.length<8 || contraseņa_.length>12) {	//Para resaltar el COLORES
					contraseņa.setBackground(Color.RED);
				}else {
					contraseņa.setBackground(Color.GREEN);
				}
			
		}

		@Override
		public void removeUpdate(DocumentEvent e) {
			char[] contraseņa_;
			//Neceito que contraseņa sea global en vez de dentro del constructor
			contraseņa_=contraseņa.getPassword();	//Con esto almaceno todos los caracteres que tiene la contraseņa
		
			if(contraseņa_.length<8 || contraseņa_.length>12) {	//Para resaltar el COLORES
				contraseņa.setBackground(Color.RED);
			}else {
				contraseņa.setBackground(Color.GREEN);
			}

			
		}

		@Override
		public void changedUpdate(DocumentEvent e) {

			
		}	
		
	}
	
}





