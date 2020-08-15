package graficos;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Textos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoTexto mimarco=new MarcoTexto();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoTexto extends JFrame{
	public MarcoTexto() {
		setBounds(600, 300, 600, 350);
		LaminaTexto milamina=new LaminaTexto();
		add(milamina);
		setVisible(true);
		
	}
}

class LaminaTexto extends JPanel{
	
	private JTextField campo1;	//Propiedad
	private JLabel resultado;	//Propiedad
	
	
	public LaminaTexto() {	//Constructor de la lamina principal
		
			///Lo que estoy haciendo  en este constructor es, agarrar como lamina principal en BorderLayout
			// la lamina 2(que es Floylayout), le agrego los elementos correspondientes con LAMINA2.ADD(elemento)
			//es Lamina 2 la agrego a la lamina principal con la ubicacion add(lamina2,borderlayout.North)
			//luego como estoy trabajando con BorderLayout en la laminaPricipal. el Resultado
			// lo agrego a la laminaPrincipal con add(resultado,borderlayout.Center)	+ Debo setear
			//el JLabel (string,Jlabel.ubicacion) //para centrarlo dentro del BORDERCENTER
		
		setLayout(new BorderLayout());
		
		resultado= new JLabel("",JLabel.CENTER);	//Para agregar texto label Para una Linea
									//(String,Ubicacion)
		////////////////////////////////////////////////////
		
		//Lamina secundaria
		JPanel lamina2=new JPanel();
		lamina2.setLayout(new FlowLayout());
		////////////////////////////////////////////////////
		
		JLabel texto1=new JLabel("Email: ");		//Etiqueta
		lamina2.add(texto1);
		
		campo1=new JTextField(20);	//Para agregar texto JTEXT FIELD Para una Linea
														//(String, Columnas)
		lamina2.add(campo1);
		
		add(resultado,BorderLayout.CENTER);
		
		JButton boton= new JButton("Comprobar");
		DameTexto evento= new DameTexto();	//Que va hacer cuando presione el boton
		
		
		boton.addActionListener(evento); //(Custom Escuchador) lO PONEMOS a la escucha con el EVENTO CORRESPONDIENTE
		lamina2.add(boton);						//Evento: Lo que va hacer Evento customizado
										//AddactionListener: Ponerlo a la escucha con el EVENTO.
	
		
		/////
		//Agrego la lamina 2 al la lamina Principal en la ubicacion con add , mas la ubicacion
				// BoderLayout por que la principal esta setada en Border
		add(lamina2, BorderLayout.NORTH);
		
		
	}									
	
	private class DameTexto implements ActionListener{	//Class Customer EVENTO

		@Override
		public void actionPerformed(ActionEvent e) {//Que va hacer cuando presione el boton
			
			//Para corrobar el email
			int correcto=0;
			String email=campo1.getText().trim();
			for (int i=0;i<email.length();i++) {
				if(email.charAt(i)=='@') {
					correcto +=1;
				}
			}
		
			if(correcto != 1) {
				resultado.setText("Incorrecto");
			}else {
				resultado.setText("Correcto");
			}		
			
		}
		
	}

	
	
}




