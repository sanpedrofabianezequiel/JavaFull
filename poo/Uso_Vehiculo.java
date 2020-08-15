package poo;

public class Uso_Vehiculo {

	public static void main(String[] args) {//clase main es la principal, es por donde comienza la ejecucion del programa
		// TODO Auto-generated method stub

		
		Coche miCoche1=new Coche();
		miCoche1.setColor("Rojo");
		
		Furgoneta miFurgoneta1= new Furgoneta(7,580);
		
		miFurgoneta1.setColor("azul");
		miFurgoneta1.configurar_asientos("si");
		miFurgoneta1.configurar_climatizador("si");
		
		System.out.println(miCoche1.dime_datos_generales()+" "+ miCoche1.getColor());
		
		System.out.println(miFurgoneta1.dime_datos_generales()+" "+miFurgoneta1.getColor()+" "+miFurgoneta1.dimeDatosFurgoneta());
		
		
	}

}
