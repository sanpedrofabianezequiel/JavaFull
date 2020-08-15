package graficos;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class AreaTexto2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoPruebaArea mimarco=new MarcoPruebaArea();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mimarco.setVisible(true);
	}

}

class MarcoPruebaArea extends JFrame{
	
	private JPanel laminaBotones;	//Propiedades
	private JButton insertarTexto,saltoLinea;//Propiedades
	private JTextArea areaTexto;		//			
	private JScrollPane laminaConBarras;		//Scroll
	
	public MarcoPruebaArea() {					//Constructores
		setTitle("Probando Area de textos");
		setBounds(500, 300, 500, 350);
		setLayout(new BorderLayout());	//Disposicion de tipo BorderLayout
		
					laminaBotones=new JPanel();		//Lamina inferior
									//////////////
									insertarTexto=new JButton("Insertar");
																				
											insertarTexto.addActionListener(new ActionListener() {	//De esta forma No necesitamos Instanciarla clase ActionListener, es simili a Function Anonima en Javascrip					
												@Override
												public void actionPerformed(ActionEvent e) {
													//EL METODO APPEND, CONSERVA LA INFORMACION SETIADA, MAS LAS QUE SE VAYA AGREGANDO CADA VEZ QUE ESCRIBIR ES SIMIL  A +=
														areaTexto.append("En un lugar de la mancha de cuyo nombr eno quiero acordarme");	//Esto se va agrear cada vez que presiono
													
												}
											});
											
									laminaBotones.add(insertarTexto);	//Ingreso el Boton a la lamina Inferior
									//////////////		
									saltoLinea=new JButton("Salto Linea");
											
											saltoLinea.addActionListener(new ActionListener() {//De esta forma No necesitamos Instanciarla clase ActionListener, es simili a Function Anonima en Javascrip									
												@Override
												public void actionPerformed(ActionEvent e) {
																		//Este metodo ON o Off permite o no el salto de linea
																		// (!) =Operador negado, lo que va  a continuacion lo invierte
														boolean saltar=!areaTexto.getLineWrap(); //Determina si hay o no hay Saltos de linea; //En esta ocacion alamacenamos lo que hay en la linea de texto
																									//Por defecto las areas de texto no tienen salto de linea
														areaTexto.setLineWrap(saltar);
														
														/*if(saltar) {	//Setiemos el boton
															saltoLinea.setText("Quitar Salto");	
														}else {
															saltoLinea.setText("Salto Linea");
														}*/
														

														saltoLinea.setText(saltar ? "Quitar salto" : "Salto Linea");			//O se puede Usar el operador ternario
												}
											});
									
									laminaBotones.add(saltoLinea);	//Ingresamos el Boton a  la lamina Inferior
									////////////
									
		
		add(laminaBotones,BorderLayout.SOUTH);	//Agregamos la laminaBotones a la lamina principal
													//Recordamos que Add puede recibir 2 parametros, (elemento, ubicacion)
		//////////
		
					areaTexto=new JTextArea(8,20);	//Creamos el area de texto
									laminaConBarras= new JScrollPane(areaTexto);	//Le damos el Comportamiento de ScrollBarra
									
		/////////
		add(laminaConBarras,BorderLayout.CENTER);//Agregamos la laminaBotones a la lamina principal
													//Recordamos que Add puede recibir 2 parametros, (elemento, ubicacion)
		
	}
	
	

	
	
}