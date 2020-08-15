package graficos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Prosegur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Ingrese Palabras");	
		String	texto=scan.nextLine();
	
		ExamenProsegur metodo=new ExamenProsegur();
		metodo.diccionario(texto);
		
		
		/*tring informacion=	JOptionPane.showInputDialog("Ingrese su texto");
		System.out.println(informacion);*/
		
	
	}
}

class  ExamenProsegur {
	ArrayList<String> palabras= new ArrayList<String>();	//Propiedad

	String textoCompleto="";
	String insertePalabras="";
	
	int repeticiones=1;

	public  void diccionario(String texto) {	//Metodo
	
		
		for(int i=0;i<texto.length();i++) {
			textoCompleto += texto.charAt(i);
			 insertePalabras += texto.charAt(i);
			 
				if(texto.charAt(i)==' ' ) {
					//Insertar palabras en el ArrayList
					palabras.add(insertePalabras);
					insertePalabras="";
				}
			
		}
		
		System.out.println("Las palabras dentro del ArrayList son: ");
		int orden=1;
		for (String i : palabras) {
			
			System.out.print("Numero: "+orden+"."+i);
			orden++;
		}
		System.out.println("");
		System.out.println("El texto completo es: "+ textoCompleto);
		
		
		System.out.println("Cantidad de repeticiones por palabras ordenadas");
		
		Collections.sort(palabras);
		
		
		for (int x = 0; x < palabras.size(); x++) {	//Cantidad de elementos del Array
		
			for (int j = 0; j < palabras.size(); j++) {
				
				if(palabras.get(x)==palabras.get(j)) {
					repeticiones +=1;
			
					
				}
			
			}
			System.out.println("Repeticiones: "+ repeticiones +" "+palabras.get(x));	
				repeticiones =0;	//Seteo las repeticiones
		}
		
		

	
	}
	
	
}




///Arrays
/*String[] cars = {"Volvo", "BMW", "Ford", "Mazda"}; //
for (String i : cars) {
  System.out.println(i);
}*/


///ArraysList
/*
ArrayList<String> cars = new ArrayList<String>();
cars.add("Volvo");
cars.add("BMW");
cars.add("Ford");
cars.add("Mazda");
System.out.println(cars);

Para acceder a un elemento en el ArrayList, utilice 
el get()método y consulte el número de índice:
cars.get(0);
//Para ingresar/setiar la informacion de list
cars.set(0, "Opel");
//Para borrar un elemento
cars.remove(0);
//Para eliminar todos los elementos en el ArrayList, use el clear()método:
 cars.clear();
//cuántos elementos tiene una ArrayList, use el sizemétodo:
 cars.size();
//Forech
 * for (String i : cars) {
      System.out.println(i);
    }
///ORDENAR UNA LISTA DE MATRIZ
 Otra clase útil en el java.utilpaquete es la Collectionsclase, que incluye el sort()
 método para ordenar listas alfabéticamente o numéricamente:
 
 Collections.sort(cars);  // Sort cars
 
 for (String i : cars) {
      System.out.println(i);
    }
 */

