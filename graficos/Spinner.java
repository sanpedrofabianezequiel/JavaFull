package graficos;

import java.awt.Dimension;
import java.awt.GraphicsEnvironment;
import java.time.Year;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import javax.swing.SpinnerListModel;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;



public class Spinner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FrameSpinner miMarco=new FrameSpinner();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		miMarco.setVisible(true);
	}

}

class FrameSpinner extends JFrame{
	public FrameSpinner() {
		setBounds(550, 350, 550, 350);
		add(new LaminaSpinner());
	}
}

class LaminaSpinner extends JPanel{
	
	
	public LaminaSpinner() {	//Constructor
		//1 creamos el Spinner con el contructor basico
		//JSpinner control=new JSpinner();
		//Si usamos un contructor tenemos varios
		//los principales new JSPINNER(new SpinnerDateModel())
		//los principales new JSPINNER(new SpinnerListModel())
		//los principales new JSPINNER(new SpinnerNumberModel())
		//En la Api as u ves, SpinnerNOMBREModel() tiene mas metodos por que es
		//una clase
		
		//para crear un Spinner Date MOdel
		JSpinner control= new JSpinner(new SpinnerDateModel());
		
		//para crear un Spinner List MOdel
		// 1*Creamos primero el array de String
		String []lista= {"Enero","Febrero","Marzo"};
		JSpinner control2= new JSpinner(new SpinnerListModel(lista));
		
		
		//Para cambiar los tamaños de Spinner
		//Spinner Hereda de Jcomponent
		//Usar el Metodo setPreferredSize(Dimension dimension)
		
		//1**Creamos el objeto del tipo Dimension
		//Dimension(Anchor,alto)
		Dimension d=new Dimension(200,20);
		//2*** se lo setiamos al spinner el tamaño, ose ael objeto de tipo Dimension
		control2.setPreferredSize(d);
		//////////////////////////////////////////////////////////////////////
		//Listado con todas las fuentes
		//del sistemas
		//GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		String[] lista2=GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		JSpinner control3= new JSpinner(new SpinnerListModel(lista2));
		
		
		/////////para cambiar los Topes maximo,menor y de cuanto en cuanto queres ir
		//SpinnerNumberModerl
		// (inicio,valorminimo,valormaixmo,de 1 en 1)
		JSpinner control4=new JSpinner(new SpinnerNumberModel(5,0,10,2));
		
		add(control4);
		add(control3);
		add(control2);
		add(control);
		
		JSpinner controlmodificado=new JSpinner(new MiModeloJspinner());
		add(controlmodificado);
		//Para  cambiar el comportamienta  los botones
		////////////////////////////////////////////////////////////////
		
		
		//////////////////////////////////////////////////////////
		//CLASES INTERNAS ANONIMAS
		//1 igual que siempre, le damos los valores al contructor y luego del contructor
		//Nos evitamos usar el SUPER
			JSpinner controlClaseInternaAnonima=new JSpinner(new SpinnerNumberModel(5,0,10,1) {
				
					public Object  getNextValue() {
						return super.getPreviousValue();
					}
					
					public Object getPreviousValue() {
						return super.getNextValue();
					}
			
			});
			
			add(controlClaseInternaAnonima);
		
	}
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	//para modificar nuestro spinner
	//CREAMOS UNA CLASE INTERNA QUE HEREDE DE LA CLASE EN CUESTION
	//Y PARA USAR el CONTRUCTOR DE LA CLASE PADRE
	//USAMOS LA FUNCION SUPER();
	private class MiModeloJspinner extends SpinnerNumberModel{
		public MiModeloJspinner() {
			//1 usar el constructor super
			super(5,0,10,1);//Constructo de la clase Padre
		}
		
		////////////////////////////////////////////////////// 
			//2 SOBREESCIBRIMOS LOS METODOS de la clase padre
					public Object  getNextValue() {
						return super.getPreviousValue();
					}
					
					public Object getPreviousValue() {
						return super.getNextValue();
					}
			
			//////////////////////////////////////////////
			//3 Instanciamos la clase creada como arggumento del Spinner
					//de la lamina o spinner que queremos modificar
					
					
		
	}
	
}




