package poo;

public class Coche {
	private int ruedas;
	private int largo;
	private int ancho;
	private int motor;
	private int peso_plataforma;
	
	private String color;
	int peso_total;
	private boolean asientos_cueros,climatizador;
	
	
	public Coche() {
		this.ruedas=4;
		this.largo=2000;
		this.ancho=300;
		this.motor=1600;
		this.peso_plataforma=500;
	}

	
	public String dime_datos_generales() {
		return "La plataforma del vehiculo tiene "+ ruedas+" ruedas"+
				" mide "+largo/1000+" metros con un ancho de "+ ancho +
				" cm y un peso de plataforma de "+peso_plataforma+" kg";
	}

	public void setColor(String colorcito) {
		
		this.color=colorcito;
		
	}
	public String getColor() {
		
		return "El color del coche es "+color;
		
	}
	public void configurar_asientos(String asientos_cuero) {
		if(asientos_cuero.equalsIgnoreCase("si")) {
			this.asientos_cueros=true;
		}else {
			this.asientos_cueros=false;
		}
		
	}
	
	public String dime_asientos() {
		if(this.asientos_cueros=true) {
			return "El coche tiene asientos de cuero";
		}else {
			return "El coche tiene asientos de serie";
		}
	}
	
	public void configurar_climatizador(String climatizador) {
		if(climatizador.equalsIgnoreCase("si")) {
			this.climatizador=true;
		}else {
			this.climatizador=false;
		}
	}
	
	public String dime_climatizador() {
		if(this.climatizador=true) {
			return "El coche incorpora climatizador";
		}else {
			return "El coche lleva aire acondicionado";
		}
	}
	
	
	//getter y setter no recomendado
	public String dime_peso_coche() {
		int peso_carroceria=500;
		peso_total=peso_plataforma+peso_carroceria;
		if(asientos_cueros==true) {
			peso_total=peso_total+50;
		}
		if(climatizador==true) {
			peso_total=peso_total+20;
		}
		return "El peso del coche es "+ peso_total;
	}
	
	
}
