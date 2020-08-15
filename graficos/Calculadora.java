package graficos;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;



public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoCalculadora mimarco=new MarcoCalculadora();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mimarco.setVisible(true);
	}

}


class MarcoCalculadora extends JFrame{
	
	public MarcoCalculadora() {
		setTitle("Calculadora");
		setBounds(500, 300, 450, 300);// se puede establercer una medida por defecto con PACK()para darle el tamaño al que se ajusta
		
		LaminaCalculadora milamina= new LaminaCalculadora();
		add(milamina);
		
		//pack(); //se tiene que adaptar al tamaño por defecto que tienen adentro
					//Pertenece a la clase Windows
	}
	
}

class LaminaCalculadora extends JPanel{
	
	private JPanel milamina2;	//Propiedad
	private JButton pantalla;	//Propiedad
	private boolean principio;	//Propiedad para determinar un valor inicial al display y que este vacio si es true
	private double resultado;	//De la calculadora
	private String ultimaOperacionString ="";
	
	
	public LaminaCalculadora() {//Constructor
		setLayout(new BorderLayout());
		
		
		
		principio=true;//Para que arranque dentro del construcctor cuando se inicia el programa
						//Conseguimos que el programa,haga la condicion IF
		
		
		
		//add(new JButton("Pantalla"),BorderLayout.NORTH);Otra forma de hacerlo
		pantalla= new JButton("0");//Construimos una nueva lamina//Inicializarla
		pantalla.setEnabled(false);//Lo uso a modo de pantalla, lo Deshabilito en False
		add(pantalla,BorderLayout.NORTH);
		
				//Segunda Lamina con GRID LAYOUT dentro del constructor
				milamina2=new JPanel();	//Construimos una nueva lamina//Inicializarla
				milamina2.setLayout(new GridLayout(4, 4));	//Creando una matriz o regilla
				
						//Forma Manual de insertar botones en la grilla //Es mejor crear un metodo
						//Agregar botones al GridLayout	de la segunda lamina
						/*JButton boton1=new JButton("1");
						milamina2.add(boton1);*/
						
						//Agrego la segunda lamina  a la lamina Principal LaminaCalculadora
						add(milamina2,BorderLayout.CENTER);
				/*int numero=10;
				for(int i=0;i<numero;i++) {
					String letra=  String.valueOf(i+1);
					InsertarBoton(letra);
				}*/
						
						
						
				ActionListener insertar= new InsertaNumero();	//Creo una instancia para ponerlos a la escucha
																	//Uso Principios de Herencia, y Customs, por eso uso InsertarNumero()
																		//Que implementa ActionListener
						//InsertaNumero insertar= new InsertaNumero(); //ESTO ES LO MISMO
				
						//Los puse a la escucha y se ejecuta la actionPerformed
						//Es decir, lo pongo a la ESCUCHA, para el ESCUCHADOR insertarNumero
				AccionOrden insertar2= new AccionOrden();
				
				
				//4 filas 3 columnas
						InsertarBoton("7",insertar);InsertarBoton("8",insertar);InsertarBoton("9",insertar);InsertarBoton("/",insertar2);	
						InsertarBoton("4",insertar);InsertarBoton("5",insertar);InsertarBoton("6",insertar);InsertarBoton("*",insertar2);
						InsertarBoton("1",insertar);InsertarBoton("2",insertar);InsertarBoton("3",insertar);InsertarBoton("-",insertar2);
						InsertarBoton("0",insertar);InsertarBoton(".",insertar);InsertarBoton("=",insertar2);InsertarBoton("+",insertar2);
						
	}
	
	private void InsertarBoton(String NombreDeLosBotones,ActionListener oyente) {	//Metodo privado para insertar botones en la calcladora
		//No solamente para agregar botones sino tambien para ponerlos a la escucha cuando los voy agregando

		
		JButton boton= new JButton(NombreDeLosBotones);//Creamos el boton
		
			boton.addActionListener(oyente);//Para ponerlo a la escucha cada boton
												//Con lo cual estamos ejecutando el ActionPerformed
						
		
		
		milamina2.add(boton);	//En mi nueva la lamina GRIDLAYOUT agrego el boton con escuchador en la LAMINA
	
		
		
	}
	//Clases internas
	private class InsertaNumero implements ActionListener {//Clase para escuchar Customed con el metodo Action Performed

		@Override
		public void actionPerformed(ActionEvent e) {//Clase para escuchar todo
			//Metodo paraescuchar todo y ponerlo en el Diisplay
			
			
						//Utilizo el Objeto disparador del evento
			String entrada=e.getActionCommand();//para caputar la el TEXTO del boton Pulsado tocada por el usuario
			
			
			//Nuestro Display se llamaba "pantalla"		
			//pantalla.setText(entrada); Solo para ver la pantalla
			
			if(principio) {			//Variable booleana para 
				pantalla.setText("");	//Si es verdadera el Display esta vacio
				principio=false;
			}
			
			
			
			pantalla.setText(pantalla.getText()+entrada);//A lo que ya hay en pantalla se le agrega el nuevo boton presionado
			
			
		}	
	}
	
	private class AccionOrden implements ActionListener{	//Para los que NO son numeros
								//Para cada vez que presiono +-/*
		@Override
		public void actionPerformed(ActionEvent e) {//Para cada vez que presiono +-/*
			
				//Utilizo el Objeto  "e" PARA ver que presiono,"texto"
			
			String operacion= e.getActionCommand();	//Almacenar un String, al texto del boton
			//System.out.println(operacion);
				
			
			
			resultado=Double.parseDouble(pantalla.getText());
			
			
			calcular(resultado);
			
			
			/*calcular(Double.parseDouble(		//El valor en Display
							pantalla.getText()	//El valor en Display
							));	//Metodo Double.parseDouble para convertirlo en Double		
			*/
			ultimaOperacionString =operacion;	//Consigo que almacene las operaciones que haga el usuario la ULTIMA
			
			
			principio =true;
			
		}
		
		public void calcular(double x) {	//Metodo El cerebro de la operacion
			if(ultimaOperacionString.equals("+")) {
				resultado += x;
				
			}else if (ultimaOperacionString.equals("=")){
				resultado=x;
				System.out.println(resultado);
			}else if(ultimaOperacionString.equals("-")) {
				resultado -=x;
			}else if(ultimaOperacionString.equals("*")) {
				resultado *=x;
			}else if(ultimaOperacionString.equals("/")) {
				resultado /=x;
			}
			
			
			
			pantalla.setText(
						
					String.valueOf(resultado)	 );	//Para verlo en  pantalla
		}
		
	}
}











