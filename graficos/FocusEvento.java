package graficos;

import java.awt.Graphics;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.text.StyledEditorKit.BoldAction;

public class FocusEvento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoFoco mimarco=new MarcoFoco();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoFoco extends JFrame{
	public MarcoFoco() {	//Constructor
		setTitle("Marco con foco");
		setBounds(300, 300, 600, 450);
		setVisible(true);
		add(new LaminaFoco());
		
	}
	
}

class LaminaFoco extends JPanel{
	
	JTextField cuadro1;//variables

	JTextField cuadro2;	//variables
	
	
	public void paintComponent(Graphics g) {	//Metodo de la clase
		super.paintComponent(g);					//Metodo de la clase padre
		
		setLayout(null); //para evitar el default de Layout
		//aca agregar a la lamina los buton o leyauot
		
		cuadro1=new JTextField();
		cuadro2=new JTextField();
		
		cuadro1.setBounds(120, 10, 150, 20);	//ubicacion 
		cuadro2.setBounds(120, 50, 150, 20);
													
		add(cuadro1);				//Agregar a la lamina
		add(cuadro2);				//Agregar a la lamina
		
											
		//captaFocos elfoco1=new captaFocos();		//creo una instancia el escuchador
		//cuadro1.addFocusListener(elfoco1);			//Le pongo los escuchadores a los elemtnos que quiero
		cuadro1.addFocusListener(new captaFocos());
	}
	
	
	//////clase interna
	private class captaFocos implements FocusListener{

		@Override
		public void focusGained(FocusEvent e) {
			// TODO Auto-generated method stub
			System.out.println("esta focuseado");
		}

		@Override
		public void focusLost(FocusEvent e) {
			// TODO Auto-generated method stub
			//System.out.println("no esta focusead");
			String email=cuadro1.getText(); 
			boolean comprobacion=false;
			
			for (int i = 0; i < email.length(); i++) {
				if(email.charAt(i)  =='@') {
					comprobacion=true;
				}
			}
			if(comprobacion) {
				System.out.println("Email correcto");
			}else {
				System.out.println("Email incorrecto");
			}

		}
		
	}
	
	
	
}













