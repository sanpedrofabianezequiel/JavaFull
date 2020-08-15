package graficos;
import javax.swing.*;
import java.awt.*;
import javax.imageio.*;
import java.io.*;


public class PruebaImagenes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoImagen mimarco=new MarcoImagen();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}

}
///////////////////////////////////////////
class MarcoImagen extends JFrame{
	
	public MarcoImagen() {
		setTitle("Marco con Imagen");
		setBounds(750,300,700,700);	
		
		LaminaConImagen milamina=new LaminaConImagen();
		add(milamina);
		setVisible(true);
	}
}

//////////////////////////////////////////
class LaminaConImagen extends JPanel {
	
	private Image imagen;			//1 crear  una variable de tipo Imagen
	
	
	public LaminaConImagen() {
								//Constructor
		try {															//5 Try y Cach
			//imagen=ImageIO.read(miimagen);	
			//Otra forma seria instanciar dentro del metodo
			//imagen=ImageIO.read(new File("src/graficos/FotoConAnteojos.png"));
			imagen=ImageIO.read(new File("src/graficos/pelota.png"));
		}catch(IOException e){
			System.out.println("La imagen no se encuentra");
		}
	}
	
	//////////////////////////////////////////////////////////////metodos
	
	public void paintComponent(Graphics g) {	//Override
		super.paintComponent(g);					//Override Metodo
															//2 import Java.Io; =FIle
		//File miimagen=new File("src/graficos/FotoConAnteojos.png");	//3 Buscar el archivo// capturar la imagen
																	//4 Import Javax.ImageIO;+Usar el metodo Read																	
		
			
		g.drawImage(imagen, 0, 0, null);					//6 Dibujar
		
		//Pasos 
		//Capturo la imagen
		//La guardo en una variable de tipo Imagen
		//La dibujo con el paintComponent
		////////////////////////////////////////////////////////////CopyArea
		//g.copyArea(0, 0, 15, 15,450 , 75);		
											//Los 2 primeros parametros son las coordenadas donde iniciamos
											//los siguientes 2 paramatros, son para determinar el ancho y alto de lo que queremos copiar
											// Los ultimos 2 parametros DX  DY Destino x y destino Y
		
		//para Realizar un mosaico
		/*for(int i=0;i<700;i++) {//Controla el eje Horizontal X
			
			for(int j=0;j<700;j++) {//Controla el eje Vertical Y
				g.copyArea(0, 0, 400, 400,i *400, j*400);//*el tamaño de la imagen
			}
			
		}*/
		
		///////////////////////////////////////////////obtener el tamaño automatico
		int anchuraImagen=/*uso la variable de tipo Imagen donde almacence la foto*/
				imagen.getWidth(this);/*this, el OBJETO ES LA LAMINACONIMAGEN*/
		
		
		int alturaImagen=
				imagen.getHeight(this);
		
		for(int i=0;i<700;i++) {//Controla el eje Horizontal X
			
			for(int j=0;j<700;j++) {//Controla el eje Vertical Y
				if(i+j>0) {//con este IF evitas super poner la primer copia.
				g.copyArea(0, 0, anchuraImagen, alturaImagen,
						i *anchuraImagen, j*alturaImagen);//*el tamaño de la imagen
				}
			}
		}

		///////
				
	}
												
}




//////////////////////////////////////////