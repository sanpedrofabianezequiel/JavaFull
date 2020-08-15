package graficos;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class RadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoRadio mimarco=new MarcoRadio();
		mimarco.setVisible(true);
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
class MarcoRadio extends JFrame{
	public MarcoRadio() {
		setBounds(550,300,500,300);
		laminaRadio milamina=new laminaRadio();
		add(milamina);
	}
}

class laminaRadio extends JPanel{
	public laminaRadio() {
		//1 crear un grupo con la clase ButtonGroup
		//agrupa componentes
		ButtonGroup migrupo1=new ButtonGroup();
		ButtonGroup migrupo2=new ButtonGroup();
		
		//2 crear botones de radio de la clase JradioButton
		//new JradioButton (string,boolean)// si queremos un radio con texto y select o no
		JRadioButton boton1=new JRadioButton("Azul",false);
		JRadioButton boton2=new JRadioButton("Rojo",true);
		JRadioButton boton3=new JRadioButton("Verde",false);
		JRadioButton boton4=new JRadioButton("Mujer",false);
		JRadioButton boton5=new JRadioButton("Hombre",false);
		
		//3 Agrego a mi ButtonGroup los radio button
		migrupo1.add(boton1);
		migrupo1.add(boton2);
		migrupo1.add(boton3);
		
		migrupo2.add(boton4);
		migrupo2.add(boton5);
		
		//4 El grupo NUNCA se puede agregar a la lamina se agregan si los RADIObutton
		//5agrego a la lamina principal los botones
		add(boton1);
		add(boton2);
		add(boton3);
		
		add(boton4);
		add(boton5);
		
	}
}










