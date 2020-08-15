package graficos;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JTextPane;
import javax.swing.JToolBar;
import javax.swing.KeyStroke;
import javax.swing.text.StyledEditorKit;
import javax.swing.text.StyledEditorKit.AlignmentAction;
import javax.swing.text.StyledEditorKit.FontFamilyAction;
import javax.swing.text.StyledEditorKit.ItalicAction;



public class ProcesadorDeTextosOptimizado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoProcesador miMarco=new MarcoProcesador();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		miMarco.setVisible(true);
	}

}

class MarcoProcesador extends JFrame{
	public MarcoProcesador() {	//Constructor
		setTitle("Procesador de Textos San Pedro Ezequiel");
		setBounds(500, 300, 550, 400);
		add(new LaminaProcesador());
	
	}
}
class LaminaProcesador extends JPanel{ //Constructor
	
		private JTextPane areaDeTexto;	//Propiedades: Texto de escritura
		private JMenu fuentes,estilos,tamaños; //barra Principal con sub-menus
		private Font  letras;					//Objeto letra que vamos a obtener en un momento Determinado!!					
	

	public LaminaProcesador() {	//Constructor
			//1 Determinamos la distribucion de la Lamina Principal
			setLayout(new BorderLayout());
			//2 Agregamos una lamina secundaria en la Parte norte de la lamina Principal
			JPanel laminaNorte=new JPanel();
			//3 Agregamos un MenuBar  a la lamina secundaria + los JMenu
			fuentes=new JMenu("Fuente");
				estilos=new JMenu("Estilo");
					tamaños=new JMenu("Tamaño");
			JMenuBar barraMenuBar=new JMenuBar();
					
			
			//------------------------------
			//Metodo Creador de subMenues+escuchadores+editores
			//Fuentes:
					MenusDinamicos("Arial", "Fuente", "Arial", Font.PLAIN, 10,"");
						MenusDinamicos("Courier", "Fuente", "Courier", Font.PLAIN, 10,"");
							MenusDinamicos("Verdana", "Fuente", "Verdana", Font.PLAIN, 10,"");
			//Estilos:
					MenusDinamicos("Negrita", "Estilo", "", Font.BOLD, 10,"N");
						MenusDinamicos("Cursiva", "Estilo", "", Font.ITALIC, 10,"C");
				
						/*//TEXTBOX...---------------------	
								//(rotulo,new ImageIcon" URL")
						JCheckBoxMenuItem	negrita=new JCheckBoxMenuItem("Negrita");
						JCheckBoxMenuItem   cursiva=new JCheckBoxMenuItem("Cursiva");
						
						//Eventos
							negrita.addActionListener(new StyledEditorKit.BoldAction());
							cursiva.addActionListener(new StyledEditorKit.ItalicAction());
							estilos.add(negrita);
								estilos.add(cursiva);*/
						
			//Tamaño:
					/*MenusDinamicos("12", "Tamaño", "", Font.PLAIN, 12,"");
						MenusDinamicos("16", "Tamaño", "", Font.PLAIN, 16,"");
							MenusDinamicos("20", "Tamaño", "", Font.PLAIN, 20,"");
								MenusDinamicos("24", "Tamaño", "", Font.PLAIN, 24,"");*/
								
								//---
								//1 // Construir un  grupo 
								ButtonGroup grupo=new ButtonGroup();
									//2 Crear las intancias
									// JRadioButtonMenuItem
									JRadioButtonMenuItem doce= new JRadioButtonMenuItem("12");
									JRadioButtonMenuItem dieciseis=new JRadioButtonMenuItem("16");
									JRadioButtonMenuItem veinte=new JRadioButtonMenuItem("20");
									JRadioButtonMenuItem veinticuatro=new JRadioButtonMenuItem("24");
									
										// 3 Agregar los item al grupo
										grupo.add(doce);
											grupo.add(dieciseis);
												grupo.add(veinte);
													grupo.add(veinticuatro);
										//4 ponerlos a la escucha
											doce.addActionListener(new StyledEditorKit.FontSizeAction("tamaño", 12));
												dieciseis.addActionListener(new StyledEditorKit.FontSizeAction("tamaño", 16));
													veinte.addActionListener(new StyledEditorKit.FontSizeAction("tamaño", 20));
													    veinticuatro.addActionListener(new StyledEditorKit.FontSizeAction("tamaño", 24));
													    
													    //ATAJOS DE TECLADO PARA PONER EL TAMAÑO 24
													    	//setAccelerator(KeyStroke.getKeyStroke(N letra,N atajo))
													    	//Con la letra D se pone en 24
													    veinticuatro.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D, InputEvent.CTRL_DOWN_MASK));
													    
										//5 Agregarlos a al tamaño
													    
											tamaños.add(doce);
											tamaños.add(dieciseis);
											tamaños.add(veinte);
											tamaños.add(veinticuatro);
													    
													    
		  	//------------------------------
			barraMenuBar.add(fuentes);
				barraMenuBar.add(estilos);
					barraMenuBar.add(tamaños);
				laminaNorte.add(barraMenuBar);
					add(laminaNorte,BorderLayout.NORTH);
			//------------------------------Agregamos una zona de textArea o are para escribir
			areaDeTexto=new JTextPane();
			add(areaDeTexto,BorderLayout.CENTER);
			
			//------------------------------------------------------------------------
			//Menues Emergentes
			//1 JPopupmenu la instanciamos
			JPopupMenu emergente=new JPopupMenu();
				//2 Agregar elementos/items al Jpopmenu
				JMenuItem opcion1=new JMenuItem("Negrita");
				JMenuItem opcion2=new JMenuItem("Cursiva");
				  opcion1.addActionListener(new StyledEditorKit.BoldAction());
				  opcion2.addActionListener(new StyledEditorKit.ItalicAction());
					//3 lo agregamos al menu emergente
					emergente.add(opcion1);
					emergente.add(opcion2);
					
						//4 (componente) esto permite en la lamina se con click derecho salga las opciones
						//Si queremos que se ejecute en la lamina donde estamos
						//setComponentPopupMenu(emergente);//Es como el ADD para agregar
						// el .setComponentPopupMenu(Objeto q hace la accion) en el OBJETO donde queremos que lo escuche
						areaDeTexto.setComponentPopupMenu(emergente);
						
						
						//---------------------------------BARRA DE HERRAMIENTAS
						JToolBar barra=new JToolBar();
							//Agregamos botones a la barra
							JButton negritaBarra=new JButton(new ImageIcon(""));
							JButton cursivaBarra=new JButton(new ImageIcon(""));
							JButton subrayadoBarra=new JButton(new ImageIcon(""));
							JButton azulBarra= new JButton(new ImageIcon(""));
							JButton amarilloBarra= new JButton(new ImageIcon(""));
							/////////------------------------Alineaciones
							JButton a_izquierda=new JButton(new ImageIcon(""));
							JButton a_derecha=new JButton(new ImageIcon(""));
									//Ponerlos a la escucha
									negritaBarra.addActionListener(new StyledEditorKit.BoldAction());
									cursivaBarra.addActionListener(new StyledEditorKit.ItalicAction());
									subrayadoBarra.addActionListener(new StyledEditorKit.UnderlineAction());
									azulBarra.addActionListener(new StyledEditorKit.ForegroundAction("Azul Barra", Color.BLUE));
									amarilloBarra.addActionListener(new StyledEditorKit.ForegroundAction("Amarillo", Color.YELLOW));
									
									a_izquierda.addActionListener(new StyledEditorKit.AlignmentAction("A la izquieda", 0));
									a_derecha.addActionListener(new StyledEditorKit.AlignmentAction("A la derecha",1));
									
										barra.add(negritaBarra);
										barra.add(cursivaBarra);
										barra.add(subrayadoBarra);
										barra.add(azulBarra);
										barra.add(amarilloBarra);
										barra.add(a_izquierda);
										barra.add(a_derecha);
										//Creamos una ubicacion de la barra para que incie los item con vertical
										  //1 Vertical
										  //0 horizontal
										  barra.setOrientation(1);
											//Setiamos la ubicacion de la barraDeHerramientas dentro la lamina
											add(barra,BorderLayout.WEST);
									
	}
	
	//--------------------------------
	//Metodo Creador de subMenues+escuchadores+editores
	public void MenusDinamicos(String rotuloAInsertar,String rotuloDisparador,String letraRecibida,int estiloRecibido,int tamañoRecibido,String rutaIcono) {
		//Declaramos un JMenuItem para crearlo en base a los parametros recibidos
			//Parametros del Nuevo Item va el Nombre o el ROTULO que quiero ver
		JMenuItem  nuevoItem=new JMenuItem(rotuloAInsertar,new ImageIcon(rutaIcono));
		
			if (rotuloDisparador=="Fuente") {
				fuentes.add(nuevoItem);	//Al rotuloDisparador le asignamos un nuevo ITEM
						//Setiamos la funcionalidad de este Nuevo Item
						// el segundo paramatro DEBE COINCIDIR CON LA letraRecibida que puede o no coincidir
						//con el Rotulo
						if (letraRecibida=="Arial") {
							nuevoItem.addActionListener(new StyledEditorKit.FontFamilyAction("Cambiar Fuente","Arial"));
						}else if(letraRecibida=="Courier") {
							nuevoItem.addActionListener(new StyledEditorKit.FontFamilyAction("Cambiar Fuente","Courier"));
						}else if(letraRecibida=="Verdana"){
							nuevoItem.addActionListener(new StyledEditorKit.FontFamilyAction("Cambiar Fuente","Verdana"));
						}				 
			}else if (rotuloDisparador=="Estilo") {
				estilos.add(nuevoItem);
						if (estiloRecibido==Font.BOLD) {
							
								//Atajos de teclados
								nuevoItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_DOWN_MASK));
							
							nuevoItem.addActionListener(new StyledEditorKit.BoldAction());
						}else if(estiloRecibido==Font.ITALIC){
								//Atajos de teclado
								nuevoItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_K, InputEvent.CTRL_DOWN_MASK));
							nuevoItem.addActionListener(new StyledEditorKit.ItalicAction());
						}
			}else if (rotuloDisparador=="Tamaño") {
				tamaños.add(nuevoItem);
						//Directamente setiamos el tamaño recibido en el Area de texto
						nuevoItem.addActionListener(new StyledEditorKit.FontSizeAction("Cambiar Tamaño", tamañoRecibido));
			}
			
			
			
	}
	
}