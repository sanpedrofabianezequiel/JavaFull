package graficos;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class EventosTeclado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoConTeclas mimarco= new MarcoConTeclas();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}

class MarcoConTeclas extends JFrame{
	
	public MarcoConTeclas() {
							//Contructor
		setTitle("Marco de teclado");
		setBounds(700, 300, 600, 450);
		setVisible(true);
		EventoDeTeclado tc=new EventoDeTeclado();
		//addKeyListener(tc);
		addKeyListener(new EventoDeTeclado());
	}
	
}


class EventoDeTeclado implements KeyListener{

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		char r=e.getKeyChar();
		System.out.println(r);
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		/*int codigo=e.getKeyCode();
		System.out.println(codigo);*/
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
