package graficos;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;

public class Eventos_Raton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoRaton mimarco=new MarcoRaton();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoRaton extends JFrame{
	public MarcoRaton() {
		setTitle("Eventos de raton");
		setBounds(700, 300, 600, 450);
		setVisible(true);
		eventosadapter ratonsito=new eventosadapter();
		//addMouseListener(ratonsito);
		addMouseMotionListener(ratonsito);
	}
	
}


/*class eventosadapter extends MouseAdapter{
	/*public void mouseClicked(MouseEvent e) {
		//System.out.println("coordenada x: "+e.getX()+" coordenada y: "+e.getY());
	
		System.out.println("La cantidad de click fue: "+e.getClickCount());
		
	}*/
	
	/*public void mousePressed(MouseEvent e) {
		//System.out.println(e.getModifiersEx());
		if (e.getModifiersEx()==MouseEvent.BUTTON1_DOWN_MASK) {
			System.out.println("Haz pulzado el boton izquierdo");
		}else if (e.getModifiersEx()==MouseEvent.BUTTON2_DOWN_MASK) {
			System.out.println("Haz pulsado la rueda del raton");
		}else {
			System.out.println("Haz pulsado el boton derecho");
		}
	}
	

	
}*/
class eventosadapter implements MouseMotionListener{

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("estas arrastando el mouse");
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("estas moviendo el raton");
	}
	
}





/*class EventosDeRaton implements MouseListener{

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Haz hecho click");
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("acabas de presionar");
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("acabas de levantar");
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("acabas de entrar");
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("acabas de salir");
	}
	
}*/

