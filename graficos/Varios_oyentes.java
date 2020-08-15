package graficos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Varios_oyentes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Marco_Principal mimarco=new Marco_Principal();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mimarco.setVisible(true);
	}

}
class Marco_Principal extends JFrame{
	public Marco_Principal() {
		setTitle("Prueba Varios");
		setBounds(1300, 100, 300, 200);
		Lamina_Principal lamina=new Lamina_Principal();
		add(lamina);
	}
	
}

class Lamina_Principal extends JPanel{
	
	JButton boton_cerrar; 	//Propiedad e instancio

	public Lamina_Principal() {
		
	
		//add(new JButton("Nuevo")); formas de instanciar si no vas a ponerle
		//escuchador
		JButton botonNuevo=new JButton("Nuevo");
		add(botonNuevo);
		boton_cerrar=new JButton("Cerrar todo");
		add(boton_cerrar);
		
		oyente nuevo=new oyente();	//lo pongo a la escucha y que haga algo		
		botonNuevo.addActionListener(nuevo);
		
		
		
	}
	
	
	private class oyente implements ActionListener{		///la clase oyente
														//clase interna
		@Override
		public void actionPerformed(ActionEvent e) {
			//Lo pongo  a la escucha, y cuando llamo  al constructor, quiero que me
			//cree un marco, creado previamente creada la CLASE
			Marco_Emergente marco= new Marco_Emergente(boton_cerrar);
			marco.setVisible(true);
		}
		
	}
	
	
	
}









class Marco_Emergente extends JFrame{
	
	private static int contador=0;			//Propiedades
	
	
	public Marco_Emergente(JButton ReferenciaBoton) {		//constructor
		setTitle("Ventana: " + contador);
		contador++;
		setBounds(40*contador, 40*contador, 300, 150);
		
		
		
		/////////////////////////////////////ESCUCHADOR
		
		cierraTodos cerrador=new cierraTodos(); //Instanciacion
		ReferenciaBoton.addActionListener(cerrador);//lo pongo a la escucha
												// llamo al metodo  cuando e spresionado
											 	//
	}
	
	
	
	//clase interna//clase interna//clase interna//clase interna
	private class cierraTodos implements ActionListener{//clase oyente

		@Override
		public void actionPerformed(ActionEvent e) {
			dispose(); //pertenece a Jframe y cierra o pone invisible todo
			
		}
		
		
	}
	
	
}
















