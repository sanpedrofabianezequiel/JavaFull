package graficos;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ComboBox {

	public static void main(String[] args) {
		MarcoBox mimarco=new MarcoBox();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mimarco.setVisible(true);
	}

}

class MarcoBox extends JFrame{
	public MarcoBox() {
		setBounds(550, 300, 550, 400);
		LaminaCombo milamina=new LaminaCombo();
		add(milamina);
	}
	
}

class LaminaCombo extends JPanel{
	//1 creamos las variables
	private JLabel	texto;
	private JComboBox miComboBox;
	
	
	
	public LaminaCombo() {	//Constructor
		setLayout(new BorderLayout());
		
		//2 Iniciar el texto
		texto=new JLabel("El DSMIV enumera todas las patalogias dentro de la Psicologia");
	
		//3 Establecer las caracateristicas del texto
		texto.setFont(new Font("Serif",Font.PLAIN,18));
		
		//4 Agregar el texto a ala lamina principal
		add(texto,BorderLayout.CENTER);
		
		/////////////////////////
		//5 Agregar el combo en una lamina secundaria
		//creamos la segunda lamina
		JPanel laminaNorte=new JPanel();
		
		//6creamos el combobox con el constructor por defecto//va instanciamos 
		//por que ya lo habiamos declaraod
		miComboBox=new JComboBox();
		
		//6* si queremos que el combo se editable tenemos que usar el metodo
		//setEditable(boolean);
		miComboBox.setEditable(true);
		
		//7para agregar item al comboBox usamos un metodo del mismo llamado
		//variable.addItem("nombre")
		miComboBox.addItem("Serif");
		miComboBox.addItem("SansSerif");
		miComboBox.addItem("Monospaced");
		miComboBox.addItem("Dialog");
		
		//14 poner a la escucha el combobox segun el item
		// con esto TODO EL MENU esta a la ESCUCHA
		miComboBox.addActionListener(new eventoComboBox());
		
		
		
		//8 agregamos a la lamina secundaria los combox
		laminaNorte.add(miComboBox);
		
		//9 agregamos la lamina secuandaria a la principal
		add(laminaNorte,BorderLayout.NORTH);
		//10 creamos el evento actionlistener
		
	}
	
	private class eventoComboBox implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			//11 le damos una funcionalidad ela texto
			//12 FONT(STRING tipo de letra,font.plain,tamaño);
			//13 en variable.getSelectedItem() devuelve un Object
			
			String tipo= (String) miComboBox.getSelectedItem();
			
			//Si quisiera podria evitarme crear la variable TIPO y hacerlo dentro del Font()
			texto.setFont(new Font(tipo,Font.PLAIN,18));
			//14 poner a la escucha el combobox segun el item// justo antes de
			//insertar EL COMBO A LA LAMINA
			
		}
		
	}
}






