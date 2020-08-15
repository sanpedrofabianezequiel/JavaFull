package graficos;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoCheck mimarco=new MarcoCheck();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mimarco.setVisible(true);
	}

}

class MarcoCheck extends JFrame{
	public MarcoCheck() {
		setBounds(500, 300, 550, 350);
		
		LaminaCheck miLamina=new LaminaCheck();
		add(miLamina);
	}
}

class  LaminaCheck extends JPanel{
	private JLabel texto;		//Propiedades
	private JCheckBox checkBox1,checkBox2;	//Propiedades
	

		public LaminaCheck() {	//Constructor de la lamina
			//1 distribucion de la lamina
			setLayout(new BorderLayout());
			
			//2 Font, instanciamos la clase FONT 
			//new Font(tipo de letra,tipo de texto,tamaño)
			Font miLetra=new Font("Serif",Font.PLAIN,24);	
			
			//3 iniciar el Jlabel "es una etiqueta"
			texto = new JLabel("En un lugar de la luna se encuentra la emocion");
			
			//4 setiamos la font,
			//setfont(objeto de tipo FONT)
			texto.setFont(miLetra);
			
			//5 Crear una lamina Jpanel
			JPanel laminaTexto=new JPanel();
			
			//6 Agrego el texto a la Lamina del punto 5*
			laminaTexto.add(texto);
			
			//7 la agrego a la lamina principal del punto 1*
			// add(lamina, ubicacion)
			add(laminaTexto,BorderLayout.CENTER);
			
			//8 instanciamos los checbox ya creados
			// Hay varios, el que usamos es el parametro (string)
			checkBox1=new JCheckBox("Negrita");	//esto genera el check con una etiqueta con el nombre negrita
			checkBox2=new JCheckBox("Cursiva");
			
			//9 Ponerlos a la escucha los Check box
			//con una clase interna  que se llama MANEJACHECKS
			//o lo pongo  a la escucha SIN crear una isntancia de la clase escuchadora
			checkBox1.addActionListener(new ManejaChecks());
			checkBox2.addActionListener(new ManejaChecks());
			
			//10 Creamos la lamina donde vamso a poner los check
			JPanel laminaCheck=new JPanel();
			laminaCheck.add(checkBox1);
			laminaCheck.add(checkBox2);
			
			//11 colocalmos en la lamina principal la lamina creada en el punto 10 +
			//ubicacion
			
			add(laminaCheck,BorderLayout.SOUTH);
			
			
			
		}
		
	
		private class ManejaChecks implements ActionListener{
			@Override
			public void actionPerformed(ActionEvent e) {
				int tipo=0;
				
				if(checkBox1.isSelected()) {
					tipo	+=Font.BOLD;	//Lo incrementa en 1
				}
				if (checkBox2.isSelected()) {
					tipo 	+=Font.ITALIC;	//Lo incrementa en 2
				}
				
				
				//////Establecer el tipo de letra
					//setfon(objeto de tipo font)
					//new Font(tipo de letra,tipo de texto,tamaño)
					//En este caso el tipo de texto es la varible, con un valor numerico
					//revisar constantes en la API
					//Puede ser una constante un FONT."Nombre"
				texto.setFont(new Font
								("Serif",tipo,24)	);
				
				
			}
			
		}
		
}



