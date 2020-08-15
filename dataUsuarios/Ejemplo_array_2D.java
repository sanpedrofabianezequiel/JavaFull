
public class Ejemplo_array_2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double acumulado;
		double interes=0.10;
		
		//Table de	//6anchox5alto
		
		double [][] saldo= new double[6][5];
		
		for(int i=0;i<6;i++) {
			//recorre todas las columnas de la PRIMER FILA fijada en 0 
			saldo[i][0]=10000;
			acumulado=10000;
			
			//C
			//arranco por J=1 por que la fila 0 
			//J=0 ya lo llene con 10000 [i] [j]
			for(int j=1;j<5;j++) {
			
				acumulado=acumulado+(acumulado*interes);
				saldo[i][j]=acumulado;
				
			}
			
			interes=interes+0.01;
		}
		
		
		//for 1 filas
				//for 2 columnas
		for(int z=0;z<6;z++) {
			
			for(int h=0;h<5;h++) {
				
				System.out.printf("%1.2f",saldo[z][h]);
				System.out.print(" ");//espacio
			}
			System.out.println();//salto
			
		}
		
		
		
		
	}

}
