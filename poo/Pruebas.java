package poo;

public class Pruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Empleados trabajador1=new Empleados("Paco");
		Empleados trabajador2=new Empleados("Ana");*/
		//Opcion con array
		Empleados[] trabajadores= new Empleados[4];//Si uso un Array no necesito cuando creo el objeto, llamar a su constructor
		
		trabajadores[0]=new Empleados("Paco");		//	Ahora si uso el
		trabajadores[1]=new Empleados("Ana");			//Constructor
		trabajadores[2]=new Empleados("Antonio");
		trabajadores[3]=new Empleados("Maria");
		
		trabajadores[0].setSeccion("RRHH");
		trabajadores[0].setCambiaNombre("Romina");
		
		for(Empleados x:trabajadores) {
			String r=x.getSeccion_y_Nombre();
			System.out.println(r + "Tu Id Siguiente es: "+ x.siguienteId());
			
		}
		Empleados.siguienteId();
		Empleados x=new Empleados("Ezequiel");
		Empleados.siguienteId();
		x.siguienteId();
		
	}

}



//Creacion de clase Empleados

class Empleados{
	private final String nombre;  //Propiedades
	private String seccion;	  		//
	private  int Id;
	private static int Idsiguiente=1;
	
	
	public Empleados(String nom) {			//
			this.nombre=nom;					//Constructores
			this.seccion="Administracion";			//
			this.Id=Idsiguiente;						//
			this.Idsiguiente++;								//
	}															//
	
	
										//
	public void setSeccion(String cam) {	//Setters
		this.seccion=cam;						//
	}
	
	public void setCambiaNombre(String nom) {//
		//this.nombre=nom;						//Setters cambia Nombre
	}												//
														//
	
	
	public String getSeccion_y_Nombre() {													//Getters
		return "El nombre es: "+this.nombre+" y la seccion "+this.seccion + " Su ID: "+this.Id;	//
	}																							   //
	
	
	
	public static String siguienteId() {		//Metodos Estaticos
		return "El id siguiente es: " + Idsiguiente;//
	}														//
	
	
	
}