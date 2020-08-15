import java.util.*;
public class Uso_Tallas {

	//enum Talla{MINI,MEDIANO,GRANDE,MUY_GRANDE};
	enum talla{
		MINI("S"),MEDIANO("M"),GRANDE("L"),MUY_GRANDE("XL");
		private String abreviatura;//pROPIEDADES
		private talla(String _abreviatura) {
			this.abreviatura=_abreviatura;
		}
		
										//Getter
		public String dameAbreviatura() {//
			return abreviatura;				//
		}
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		
		/*Talla s=Talla.MINI;
		Talla m=Talla.MEDIANO;
		Talla l=Talla.GRANDE;
		Talla xl=Talla.MUY_GRANDE;*/
		
		
		Scanner entrada= new Scanner(System.in);
		
		System.out.println("Esbri una talla: MINI,MEDIANO,GRANDE , MUY GRANDE");
		String valor=entrada.next().toUpperCase();
		talla x=Enum.valueOf(talla.class,valor );
		
		System.out.println("Talla "+ x);
		System.out.println("abreviatura= " +x.dameAbreviatura() );

		
		
	}

}
