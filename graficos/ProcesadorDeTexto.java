package graficos;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.text.StyledEditorKit;
import javax.swing.text.StyledEditorKit.FontFamilyAction;

public class ProcesadorDeTexto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoEditor miMarco=new MarcoEditor();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
class MarcoEditor extends JFrame{
	public MarcoEditor() {
		setTitle("Marco Procesador");
		setBounds(500, 300, 550, 400);
		add(new LaminaEditor());
		setVisible(true);
	}
	
}

class LaminaEditor extends JPanel{
	
	private JTextPane miArea;	//Propiedades
	private JMenu fuente,estilo,tamaño;//Propiedades
	private Font letras;					//Propiedades para determinar el tipo demletra que hay en nuestra AREA
	
	public LaminaEditor() {	//Constructor
		setLayout(new BorderLayout());//Distribucion de la lamina PRINCIPAL
		
		//1 segunda lamina
		JPanel laminaMenu=new JPanel();
		//2 Agregar la Barra Menu
		JMenuBar miBarra=new JMenuBar();
		//3 Elementos de la barra de menu/
		 fuente=new JMenu("Fuente");
		 estilo=new JMenu("Estilo");
		 tamaño=new JMenu("Tamaño");
		 
		 
		 
		 //-----------Para las menu fuentes
		 		//(Rotulo que va en el menu,Elemento Detonante,tipo letra,estilo letra,tamaño)
		 configuraMenu("Arial", "fuente", "Arial", 9, 10);
		 configuraMenu("Courier", "fuente", "Courier", 9, 10);
		 configuraMenu("Verdana", "fuente", "Verdana", 9, 10);
		 //-------------Para los menu estilos
	 		//(Rotulo que va en el menu,Elemento Detonante,NO QUIERO CAMBIAR EL TIPO LETRA,estilo letra,tamaño)
		 configuraMenu("Negrita", "estilo", "", Font.BOLD, 10);
		 configuraMenu("Cursiva", "estilo", "", Font.ITALIC, 10);
		 //-------------Para los menu tamaños
		 configuraMenu("12", "tamaño", "", 9, 12);
		 configuraMenu("16", "tamaño", "", 9, 16);
		 configuraMenu("20", "tamaño", "", 9, 20);
		 configuraMenu("24", "tamaño", "", 9, 24);
		 
		
		//*Itemns----------------------------------------------
/*		JMenuItem arial=new JMenuItem("Arial");
					//Escuchadores internos
					arial.addActionListener(new ActionListener() {				
						@Override
						public void actionPerformed(ActionEvent e) {
							miArea.setFont(new Font("Arial",Font.PLAIN,12));
							
						}
					});
		JMenuItem courier=new JMenuItem("Courier");
					//Escuchadores
					courier.addActionListener(new ActionListener() {				
						@Override
						public void actionPerformed(ActionEvent e) {
							miArea.setFont(new Font("Courier",Font.PLAIN,12));
							
						}
					});
				
		JMenuItem verdana=new JMenuItem("Verdana");
					//Escuchadores internos
					verdana.addActionListener(new ActionListener() {				
						@Override
						public void actionPerformed(ActionEvent e) {
							miArea.setFont(new Font("Verdana",Font.PLAIN,12));
							
						}
					});
				
					fuente.add(arial);fuente.add(courier);fuente.add(verdana);
		JMenuItem negrita=new JMenuItem("Negrita");
		JMenuItem cursiva=new JMenuItem("Cursiva");
				estilo.add(negrita);estilo.add(cursiva);
		JMenuItem tam12=new JMenuItem("12");
		JMenuItem tam16=new JMenuItem("16");
		JMenuItem tam20=new JMenuItem("20");
		JMenuItem tam26=new JMenuItem("26");
				tamaño.add(tam12);tamaño.add(tam16);tamaño.add(tam20);tamaño.add(tam26);					
		//*Itemns----------------------------------------------
		//4 Agregar los elementos de menu a la barra menu*/
		miBarra.add(fuente); miBarra.add(estilo);miBarra.add(tamaño);
		
		
		
		//------------------------------------Comento todo para usar un metodo
		//5Agrego la barra a la lamina secundaria*/
			laminaMenu.add(miBarra);
		//6 agrego la lamina a la lamina principal en el North
				add(laminaMenu,BorderLayout.NORTH);
		
		//7 Contruir un jtextpanel y agregarlo ala zona central
		miArea=new JTextPane();
		add(miArea,BorderLayout.CENTER);
		
		
		
		
	}
	
	//Metodo para ahorrar codigo, que ponga a la escucha y que sea capaz de contruir elementos
	
	public void configuraMenu(String rotulo,String menu,String tipoLetra,int estilosRecibido,int tamañoRecibido) {
		
		// Este metodo Primero construye los elementos y dsp los pone a la escucha
		
		
			//StyleEditorkit.nombreCorrecto Esta clase permite ademas de las operaciones
			//Basicas de un editor de texto, que cuando se presione nuevamente ejemplo
			//Cursiva o negrita en este ejemplo, se saque o se ponga
		
			///Menues Item
		JMenuItem elemento_menu=new JMenuItem(rotulo);	//Texto del menu
				
				//Especificar a que lugar de la barra le voy agregar el ELEMENTO		
			if (menu=="fuente") {	//Menu que recibo por parametros
									//El menu donde debe ser colocado
				fuente.add(elemento_menu);	//agregar el elemento_menu al Menu especifico

				// VOY A USAR EL StyleEditorKit.FontFamilyAction(Strin text cualquiera,tipo de letra "arial","Courier"etc)
				//solo usamos el parametro tipoLetra ya que en rotulo recibimos datos como numeros, negrita y otra informacion incompatible
				
				if(tipoLetra=="Arial") {
						elemento_menu.addActionListener(new StyledEditorKit.FontFamilyAction("Cambia Letra", "Arial"));
				}else if(tipoLetra=="Courier") {
						elemento_menu.addActionListener(new StyledEditorKit.FontFamilyAction("CambiaLetra","Courier"));
				}else if (tipoLetra=="Verdana") {
						elemento_menu.addActionListener(new StyledEditorKit.FontFamilyAction("Cambia Letra","Verdana"));
				}
				
			
			
			}else if(menu=="estilo") {
				estilo.add(elemento_menu);
				// VOY A USAR EL StyleEditorKit.BoldAction() //Para ponerlo en cursiva
				if(estilosRecibido == Font.BOLD) {	//Si lo queremos en negrita
					elemento_menu.addActionListener(new StyledEditorKit.BoldAction());
				}else if(estilosRecibido== Font.ITALIC) {
					elemento_menu.addActionListener(new StyledEditorKit.ItalicAction());
				}
				
			
				
			}else if(menu=="tamaño") {
				tamaño.add(elemento_menu);
				// VOY A USAR EL StyleEditorKit.FontSizeAction
				//(String no importa que diga aca,tamaño)
				//Con esta linea podemos selecciona una parte del texto y  cambiamos el tamaño
				elemento_menu.addActionListener(new StyledEditorKit.FontSizeAction("Cambia tamaño", tamañoRecibido));
			}
			
			
			
			
			
			
			
			
			//COMENTO TODO YA QUE VOY A USAR EL StyleEditorKit
				//Incluso el constructor de la clas escuchadora
			///---Ponerlos  la escucha
			//	elemento_menu.addActionListener(new gestionaEventos(rotulo, tipoLetra, estilosRecibido, tamañoRecibido));
			
		
	}
		
	
	
	
	
	
	
	
				/*
				//COMENTO TODO YA QUE VOY A USAR EL StyleEditorKit
	
				private class gestionaEventos   implements ActionListener {	//Escuchador cambiador de letras
					String tipoTexto,menu;	//Tipo de letra//que menu se a pulsado
					int estiloLetra,tamañoLetra;
					
					
													
					//Constructor de la clase para poder recibir parametro
					 gestionaEventos(String elemento,String texto2,int estilo2,int tamLetra) {
						tipoTexto=texto2;
						estiloLetra=estilo2;
						tamañoLetra=tamLetra;
						menu=elemento;
					}
					
					@Override
					public void actionPerformed(ActionEvent e) {
						//Antes de establecer el Font->Obtenemos el tipo de letra utilizado y sus datos totales
					
						letras=miArea.getFont();//Capturamos tamaño,estilo,letra,etc
						
						
						//En estos condicionales se conserva los determinados en los
						//Condicionales
						if(menu=="Arial" || menu=="Courier" || menu=="Verdana") {
								//Estos datos los obtenemos de AREA.GETFONT()				
							estiloLetra=letras.getStyle();
							tamañoLetra=letras.getSize();
						}else if(menu== "Cursiva" || menu=="Negrita") {
							
								//para ver si es cursiva y negrita es decir= 1+2=3
								//En este IF se determina, si entramos a este IF  es por que el menu es cursiva o negrita
								// y ademas si entramos en este IF es por que le queremos aplicar
								// un estilo mas que da como resultado=3
								if(letras.getStyle()==1 || letras.getStyle()==2) {
									estiloLetra=3;
								}
							
							tipoTexto=letras.getFontName();	//Dejame el tipo de letra que tanga en el momento
							tamañoLetra=letras.getSize();	//Conservar el tamaño que viene
						}else if(menu=="12" || menu=="16" || menu=="20" || menu=="24") {
							estiloLetra=letras.getStyle();	//conservamos el tipo de letra
							tipoTexto=letras.getFontName();	//conservamos el tipo de texto
								//Solo se ccambiara el tamaño de letra
						}
						
						miArea.setFont(new Font(tipoTexto,estiloLetra,tamañoLetra));
						
						System.out.println("Tipo: "+ tipoTexto +" Estilo: "+estiloLetra+" Tamaño: "+tamañoLetra);
					}
					
				}*/
				
				
}




