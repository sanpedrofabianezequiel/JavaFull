import java.util.*;



import java.lang.*;
public class Entrada_Ejemplo {

	public static void main(String[] args) {
		
		Scanner x= new Scanner(System.in);
		System.out.println("Ingrese Palabras");	
		String palabras=x.nextLine();
		
		
		
		//creacion de objeto
		prueba ejemplPrueba=new prueba();
		
		//llammar al metodo
		ejemplPrueba.InsertarDatos(palabras);
	
		
		
	}
	

}

class prueba{
	
	boolean condiciones=false;
	
	int cantidad=0;
	String resultado;
	String[] Lista= new String[10];
	
	
	public  void	InsertarDatos(String palabras) {	//METODO	
			for(int i=0;i<palabras.length();i++) {
				
				if(palabras.charAt(i) == ' ') {
					cantidad += 1;
					condiciones=true;
				}else {
					condiciones=false;
				}
				
				
				if(condiciones== true) {
					for (int j = 0; j < cantidad; j++) {
						Lista[i]= resultado;
					}
					
				}
				
			
				System.out.print(palabras.charAt(i));
				resultado += palabras.charAt(i);
				
			}	
			
			System.out.println("\nCantidad de repeticiones: "+ cantidad);
	
			
		}
	
	
	
	
	
}



