package graficos;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.awt.geom.Ellipse2D.Double;

public class PruebaDibujo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		MarcoConDibujos mimarco=new MarcoConDibujos();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}


class MarcoConDibujos extends JFrame{
	public MarcoConDibujos() {
		setTitle("Prueba de dibujo");
		setSize(400,400);
		setVisible(true);
		LaminaConFiguras milamina=new LaminaConFiguras();
		add(milamina);
		
	}
}


class LaminaConFiguras extends JPanel{
	
	public void	paintComponent(Graphics g) {		//Override
		super.paintComponent(g);				//Metodo Padre
		
		//g.drawRect(50, 50, 200, 200);
		//g.drawLine(100, 100, 300, 200);
		//g.drawArc(50, 100, 100, 200, 120, 150);    	Arcos
		
		
		
		Graphics2D g2=(Graphics2D) g;		//Parse
		
		///////////////////////////////////////////////RECANGULO
		Rectangle2D rectangulo=new Rectangle2D.Double(100,100,200,150);
		//Ellipse2D estos son objetos que  implentan la interfaz SHAPE
		//Line2D
		//Primeros 2 parametros ubicacion
		//ultimos 2 parametros el tamaño ancho y alto
		
		g2.draw(rectangulo);//Le envio la variable de tipo SHAPE
		
		////////////////////////////////////////////////ELIPSE
		Ellipse2D elipse= new Ellipse2D.Double();
		elipse.setFrame(rectangulo);	//Esto genera el Cuadro Imaginario //recibe por parametro el cuadradro/rectangulo
		
		g2.draw(elipse);		//Dibujo el elipse dentro del rectangulo
		
		//////////////////////////////////////////////LINEA
		g2.draw(new Line2D.Double(100,100, 300, 250)); //Dibujar una linia dentro del mismo metodo
														//LOS 2 PRIMEROS PARAMETROS SON LAS CORDENADAS INICIALES
															//LOS 2 ULTIMOS PARAMETROS CORRESPONDEN A LAS COORDENADAS FINALES
		
		////////////////////////////////////////////////CIRCULO
		
		double CentroenX = rectangulo.getCenterX();
		double CentroenY = rectangulo.getCenterY();
		//*Si el radio es igual al alto
		double radio=130;
		
		Ellipse2D circulo=new Ellipse2D.Double();
		circulo.setFrameFromCenter(CentroenX,CentroenY , CentroenX+radio, CentroenY+radio);
		
		g2.draw(circulo);
		
		
	}
	
	
	
}