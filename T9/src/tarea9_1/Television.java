package tarea9_1;

public class Television extends Electrodomestico {
	boolean sintonizadorTDT;
	double resolucion;
	final double defaultResolucion=20;
	final boolean defaultSintonizador=false;
	
	//Television builders
	public Television() {
		super();
		this.sintonizadorTDT=defaultSintonizador;
		this.resolucion=defaultResolucion;
	}
	
	public Television(double precio, double peso) {
		super(precio, peso);
		this.sintonizadorTDT=defaultSintonizador;
		this.resolucion=defaultResolucion;
	}
	
	public Television(double resolucion, boolean sintonizadorTDT, double precio, double peso, String color, char consumoElectrico) {
		super(precio, peso, color, consumoElectrico);
		this.resolucion=resolucion;
		this.sintonizadorTDT=sintonizadorTDT;
	}
	
	//get methods
	public double getResolucion() {
		return resolucion;
	}
	
	public boolean getSintonizadorTDT() {
		return sintonizadorTDT;
	}
	
	//depending of the resolution or the tuner the final price will grow
	@Override
	public double precioFinal() {
		precioFinal=precioFinal+super.precioFinal();
		if (resolucion>40) {
			this.precio=this.precio+this.precio*0.3;
		}
		if (sintonizadorTDT) {
			this.precio=this.precio+50;
		}
		return precioFinal;
	}
}
