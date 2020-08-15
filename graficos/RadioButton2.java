package graficos;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class RadioButton2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoRadios mimarco=new MarcoRadios();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mimarco.setVisible(true);
		
	}

}

class MarcoRadios extends JFrame{
	public MarcoRadios() {
		setBounds(550, 300, 500, 350);
		LaminaRadios milamina=new LaminaRadios();
		add(milamina);
		
	}
}
class LaminaRadios extends JPanel{
	
	private JLabel texto;
	private JRadioButton boton1,boton2,boton3,boton4;
	
	private ButtonGroup miGrupo;//Propiedades Bis
	private JPanel laminaSecundaria;//Propiedades Bis
	
	
	public LaminaRadios() {	//Constructor
		//1 Especifico la ubicacion de la lamina
		setLayout(new BorderLayout());
		
		//2 Intanciamos el texto
		texto=new JLabel("En el DSM IV se analizan los diferentes trastornos");
		//2* Darle al texto  un default
		texto.setFont(new Font("Serif",Font.PLAIN,12));
		//2** instanciamos la lamina bis y el BUttonGroup
		laminaSecundaria=new JPanel();
		miGrupo=new ButtonGroup();
		
		
		
		
		//3*Metodo para insertar Botones(Declarado fuera del constructor)
			//Creo la propiedad ButonGroup en Global
		
		//11 * llamar al metodo en el constructor de la lamina principal
		//este metodo nos a construido los botones, y los agregado a la lamina secundaria
		// y los a agrupados, faltaria agregar esa laminasecundaria a la lamina princpal
		colocarBotones("Pequeño", false, 10);
		colocarBotones("Mediano", true, 12);
		colocarBotones("Grande", false, 18);
		colocarBotones("Muy Grande", false, 24);
		
		
		//12* Agregar la laminaSecundaria a la lamina principal
		add(laminaSecundaria,BorderLayout.SOUTH);
		
		
		
		
		
		
		
		
		//3Agrego el texto a la lamina principal en la ubicacion especifica
		add(texto,BorderLayout.CENTER);
		
		
		///////////////////METODO LARGO
		/*//4 Instanciacion Radiobutoony agrupacion de los RadioButton
		ButtonGroup migrupo=new ButtonGroup();
		//5 instanciacion de los radioButton(string,boolean)
		boton1=new JRadioButton("Pequeño",false);
		boton2=new JRadioButton("Mediano",true);
		boton3=new JRadioButton("Grande",false);
		boton4=new JRadioButton("Muy Grande",false);
		
		//6 Agregar estos botonoes a una segunda lamina, que la segunda lamina
		// estara incluida en la lamina principal
		JPanel laminaRadio=new JPanel();
		
		
		//9 Poner los botones a la escucha
		boton1.addActionListener(new EventoRadio());
		boton2.addActionListener(new EventoRadio());
		boton3.addActionListener(new EventoRadio());
		boton4.addActionListener(new EventoRadio());
		//7Le envio a la lamina los radioButton ya agrupados
			//Agrupacion
				
		migrupo.add(boton1);
		migrupo.add(boton2);
		migrupo.add(boton3);
		migrupo.add(boton4);
		laminaRadio.add(boton1);
		laminaRadio.add(boton2);
		laminaRadio.add(boton3);
		laminaRadio.add(boton4);
		
		
		
		//8 Agregar la segunda lamina a la lamina principal
		add(laminaRadio,BorderLayout.SOUTH);*/
		///////////////////////////////////////////////
		
		//Metodo Corto
	}
	
	/*private class EventoRadio implements ActionListener{	//Metodo largo
		@Override
		public void actionPerformed(ActionEvent e) {
			//1Getsource() => determina el boton que desencadeno el evento (El objeto desecadenante)
			/*if (e.getSource()==boton1) {
				//System.out.print("Presionaste el boton 1");
				
				//2 Setiamo el texto new font("Tipo",font."Name",tamaño)
				texto.setFont(new Font("Serif",Font.PLAIN,10));
			}else if(e.getSource()==boton2) {
				texto.setFont(new Font("Serif",Font.PLAIN,12));
			}else if(e.getSource()==boton3) {
				texto.setFont(new Font("Serif",Font.PLAIN,18));
			}else if(e.getSource()==boton4){
				texto.setFont(new Font("Serif",Font.PLAIN,24));
			}
		}				
	}*/
	
	
	
	
	////3*Metodo para insertar Botones
	public void colocarBotones(String nombre,boolean seleccionado,final int tamaño) {
		//4* intancio un boton JradioButton con los parametros
		JRadioButton boton= new JRadioButton(nombre,seleccionado);
		
		//5*Agrupo mi boton con la propiedad ButtonGroup previamente
		//creado
		miGrupo.add(boton);
		
		//6* Agregarlos a la lamina secundaria los botones
		//por ende debo declarar una lamina en 
		//propiedades globales
		laminaSecundaria.add(boton);
		//7* Boton tiene que estar a la escucha
		//Directamente podria instancia un ActionListener
						ActionListener miEvento= new ActionListener() {
							@Override
							public void actionPerformed(ActionEvent e) {
								//8 * le envio por parametros el tamaño
								//9 *El parametro tamaño tiene que ser FINAL
								texto.setFont(new Font("Serif",Font.PLAIN,tamaño));
								
							}
						};
		
		//10* Poner este boton ala escucha
		boton.addActionListener(miEvento);
		
		//11 * llamar al metodo en el constructor de la lamina principal
		
	}
	
}
















