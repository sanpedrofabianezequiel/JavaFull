package poo;

import java.util.Date;
import java.util.GregorianCalendar;

public class Uso_Persona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Persona [] lasPersonas=new Persona[2];
		
		lasPersonas[0]=new Empleado2("Luis Conde",5000,2009,02,25);
		lasPersonas[1]=new Alumno("Ana lopez","Programcacion");
		
		for(Persona x:lasPersonas) {
			System.out.println(x.dameNombre()+", "+ x.dameDescripcion());
		}
		

	}

}
/////////////////////////////////////////////////Clase Abstract Persona

abstract class Persona{
	private String nombre;	//propiedades
	public Persona(String _nombre) {	//
		this.nombre=_nombre;				//Constructor
	}											//
	
	
	public String dameNombre(){	//	
		return nombre;				//getter
	}									//
	public abstract String dameDescripcion();//Declarion de Metodo Abstract, sin el parentesis
	
}

//////////////////////////////////////////////////
class Empleado2 extends Persona {
	
	
	private double sueldo;					//Propiedades
	private Date altaContrato;					//
	private int Id;
	private static int IdSiguiente=0;
	
	
	public Empleado2(String _nombre,double _sueldo,int año,int mes,int dia){ //Constructor
		super(_nombre);															//
		//
		this.sueldo=_sueldo;															//
		//Para construir una fecha															//
		GregorianCalendar calendario=new GregorianCalendar(año,mes-1,dia);//Asignacion de valor	//
		this.altaContrato=calendario.getTime();														//																									
		IdSiguiente++;
		Id=IdSiguiente;
	}
	
	public String dameDescripcion() {
		return "Este empleado tiene un ID= "+ Id+" con un sueldo "+ sueldo;
	}
	
	public double getSueldo() {		//Getter
		return sueldo;					//
	}										//
									
	public Date getAltaContrato() {	//
		return this.altaContrato;		//Getter
	}										//
	
	public int getId() {	//
		return this.Id;		//Getter
	}										//
	
	
	
	public void setSueldo(double porcentaje) {	//
		double aumento= (this.sueldo*porcentaje)/100;	//Setter
		this.sueldo=sueldo+aumento;					//
	}		
		
}
////////////////////////////////////////////////////
class Alumno extends Persona{
	private String carrera;	//propiedades
										//
	public Alumno(String nom,String car) {//Constructor de Alumnod
		super(nom);							//Constructor de la clase Padre	
		this.carrera=car;					 // 
	}										  //

	
	
	public String dameDescripcion() {
		return "El nombre es: "+ dameNombre()+" y la carrera es: "+this.carrera;
	}
}												


