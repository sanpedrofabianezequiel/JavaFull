package graficos;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.awt.geom.Ellipse2D.Double;

public class TrabajandoColores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoConColor mimarco=new MarcoConColor();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mimarco.setVisible(true);
		
	}

}


//////////////////////////////////////

class MarcoConColor extends JFrame{
	
	public MarcoConColor() { //Constructor
					
		setTitle("Prueba con coores");
		setSize(400,400);
		
		LaminaConColor milamina=new LaminaConColor();//Lamina
		add(milamina);
		/////////////////////////////////////////////BackGROUND DE LA LAMINA
		
		milamina.setBackground(new Color(142,10,15));	//Background
		//milamina.setBackground(SystemColor.window);	//Si queres aplicar el color por defecto del Sistema operativo
		
	}
		
}

///////////////////////////////////////
class LaminaConColor extends JPanel{
	
	public LaminaConColor() {		//Constructor
		super();
	}
	
	public void paintComponent(Graphics g) {	//Override Metodo paintComponent
		super.paintComponent(g);					//LLamo al metodo de la Clase Padre
		
		Graphics2D g2= (Graphics2D) g;			//Casteo
		
		Rectangle2D rectangulo= new Rectangle2D.Double(100,100,200,150);	//Shape
		
		g2.setPaint(Color.red);				//Elegir el color con la variable DE TIPO CLASE GRAPHIGS2D
		
		
		g2.fill(rectangulo);			//Dibujo Rectangulo
		
		////////////////////////////////////////////////////////////
		
		Ellipse2D elipse= new Ellipse2D.Double();
		elipse.setFrame(rectangulo);			//Marco Imaginario, la elipse debe estar dentro de este rectangulo
		g2.setPaint(new Color(125,45,2).brighter());			//Elegir el color RGB mediante el CONSTRUCTOR DE LA CLASE COLOR
														//Brigther() o darker() se le puede aplicar los colores
		g2.fill(elipse);							//Dibujo la elipse
			
		
		//////////////////////////////////////////////////////////
		Color micolorcito=new Color(125,189,200);  // y se lo puedo enviar
													//como parametro en el SETPAINT
		
	}
	
	
}









