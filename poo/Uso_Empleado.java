package poo;
import java.util.*;
import java.lang.*;

public class Uso_Empleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Utilizacion de la class Empleado
		/*Empleado empleado1=new Empleado("Paco Gomez",85000,1990,12,17);
		Empleado empleado2=new Empleado("Ana Lopez",95000,1995,6,02);
		Empleado empleado3=new Empleado("Maria Martin",105000,2002,03,15);

		
		empleado1.setSueldo(5);
		empleado2.setSueldo(5);
		empleado3.setSueldo(5);

		System.out.println("Nombre: "+empleado1.getNombre()+" Sueldo: "+empleado1.getSueldo()+" Fecha de Alta: "+empleado1.getAltaContrato());
		System.out.println("Nombre: "+empleado2.getNombre()+" Sueldo: "+empleado2.getSueldo()+" Fecha de Alta: "+empleado2.getAltaContrato());
		System.out.println("Nombre: "+empleado3.getNombre()+" Sueldo: "+empleado3.getSueldo()+" Fecha de Alta: "+empleado3.getAltaContrato());
		 */
		//Opcion con array
		
		
		Empleado[] misEmpleados=new Empleado[6];//Creando Array de tipo Empleado
		
		misEmpleados[0]=new Empleado("Paco Gomez",85000,1990,12,17);	//
		misEmpleados[1]=new Empleado("Ana Lopez",95000,1995,6,02);			//Guardar Los datos en el array
		misEmpleados[2]=new Empleado("Maria Martin",105000,2002,03,15);			//
		misEmpleados[3]=new Empleado("Antonio Fernandez");
		
		Jefatura jefe_RRHH=new Jefatura("Juan",55000,2006,9,25);
		jefe_RRHH.estableceIncentivo(2570);
		
		misEmpleados[4]=jefe_RRHH;//POLIMORFISMOS/PRINCIPIO DE SUSTITUCION
		//un Jefe es un Empleado, por eso podemos almacenar en la posicon 4
		//aun cuando, se esperaba un new Empleado....
		//ya que es jefe es hijo de Empleado
		//un JEFE ES UN EMPLEADO
		//es PODEMOS ALMACENAR OBJETOS DE LA SUBCLASE
		
		misEmpleados[5]=new Jefatura("Maria",95000,1999,5,26);
		
		Jefatura jefa_Finanzas=(Jefatura) misEmpleados[5];//para usar los metodos de la subclase necesito
		jefa_Finanzas.estableceIncentivo(50000);			//castiarlo a la clase correspondiente
																//ES UN (Jefe es un Empleado)
		
		//Jefatura x=(Jefatura) misEmpleados[1]; //NO SE PUEDE HACER YA QUE UN EMPLEADO NO ES SIEMPRE UN JEFE
		
		
		/*Empleado director_comercial=new Jefatura("Sandra",85000,2012,05,05);
		
		Comparable ejemplo=new Empleado("Elisabeth",95000,2011,06,07);
		
		if(director_comercial instanceof Empleado) {
			System.out.println("Es de timpo jefatura");
		}
		
		if(ejemplo instanceof Comparable) {
			System.out.println("Implementa la interfaz comparable");
		}
		*/
		//For tradicional
		/*System.out.println("For Tradicional");

		for(int i=0;i<misEmpleados.length;i++) {		//
															//Subir sueldo
				misEmpleados[i].setSueldo(5);					//Imprimir todo
				System.out.println("Nombre: "+misEmpleados[i].getNombre()+" Sueldo: "+misEmpleados[i].getSueldo()+" Fecha Alta: "+ misEmpleados[i].getAltaContrato());
		}
		*/
		
		///Inteferface
		double x= jefa_Finanzas.establece_bonus(500);
		System.out.println("el jefe "+jefa_Finanzas.getNombre()+" Tiene un incentivo de "+ x);
		
		System.out.println("el empleado "+misEmpleados[3].getNombre()+" Tiene un incentivo de "+ misEmpleados[3].establece_bonus(200));


		System.out.println(jefa_Finanzas.tomarDecisiones("Dar mas dias de vaciones a los empleados"));
		
		
		
		
		Arrays.sort(misEmpleados);
		
		System.out.println("For Mejorado");
		
		//En el Foreach va el tipo de dato utilizado
		//En este caso va el tipo de dato Empleado
		for(Empleado visor: misEmpleados) {
				
				visor.setSueldo(5);						//Utilizo la variable creada como si fuera la variable misEmpleados
				System.out.println("Nombre: "+visor.getNombre()+" id: "+visor.getId()+" Sueldo: "+visor.getSueldo()+" Fecha Alta: "+ visor.getAltaContrato());
		}
		
		
		
		
	}

}





class Empleado implements Comparable,Trabajadores{
	
	private String nombre;				//
	private double sueldo;					//Propiedades
	private Date altaContrato;					//
	private int Id;
	private static int IdSiguiente=0;
	
	
	public Empleado(String _nombre,double _sueldo,int año,int mes,int dia){ //Constructor
																				//
		this.nombre=_nombre;														//
		this.sueldo=_sueldo;															//
		//Para construir una fecha															//
		GregorianCalendar calendario=new GregorianCalendar(año,mes-1,dia);//Asignacion de valor	//
		this.altaContrato=calendario.getTime();														//																									
		IdSiguiente++;
		Id=IdSiguiente;
	}
	
									//
	public Empleado(String _nombre) {	//Constructor
		this(_nombre,30000,2000,01,01);		//
	}
	
	
	
	
	
	
								//
	public String getNombre() {		//
		return nombre;					//Getter
	}										//
								//
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

	/*@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}*/

	public int compareTo(Object o) {
		Empleado z=(Empleado) o;//casteo
		if(this.Id<z.Id) {
			return -1;
		}
		if(this.Id>z.Id) {
			return 1;
		}
		return 0;
	}

	@Override
	public double establece_bonus(double gratificacion) {
		// TODO Auto-generated method stub
		
		return Trabajadores.bonus_base+gratificacion;//aca no hay prima es decir variable local
	}

	
		
}


	class Jefatura extends Empleado implements Jefes{
	private double incentivo;	//Propiedad
	
	//Creo mi constructor de esta clase que llame al constructor padre
	public Jefatura(String nom,double sue,int año,int mes,int dia) {		//
		super(nom,sue,año,mes,dia);//Constructor de la clase padre
	}
	
	public void estableceIncentivo(double b) {	//Metodos
		this.incentivo=b;							//
	}													//
	
/////////////////////////////////////////////////////////////////////Sobre escritura de metodos
	//Sobreescritura de metodos, ya que sueldos, necesita unasc clasusulas de incentivos
	
	public double getSueldo() { 	//heredo /o porno el mismo nombre del METODO PADRE /y declaro el mismo metodo con el mismo nombre
		double sueldoJefe=super.getSueldo();// por lo tanto sobre escribo el sueldo
		return sueldoJefe+incentivo; ///OOOO mas facil, escribo super.funcion y listo
	}

@Override
public String tomarDecisiones(String decision) {
	// TODO Auto-generated method stub
	
	return "Un miembro de la direccion ha tomado la decision de " + decision;
}

@Override
public double establece_bonus(double gratificacion) {
	// TODO Auto-generated method stub
	double prima=2000;
	return Trabajadores.bonus_base+gratificacion+prima;	//llamo a la constante de la interface

}

}


class Director extends Jefatura{
	public Director(String nom,double sue,int año,int mes,int dia) {
		super(nom,sue,año,mes,dia);
	}
}

