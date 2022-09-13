package tarea9_1;

public class Lavadora extends Electrodomestico {
	double carga;
	final double defaultCarga=5;
	
	//default Lavadora builder
	public Lavadora() {
		this.carga=defaultCarga;
	}
	
	//Lavadora builder with the cost and weight given by the user
	public Lavadora(double precio, double peso) {
		super(precio, peso);
		this.carga=defaultCarga;
	}
	
	//Lavadora builder with all the atributes are given by the user
	public Lavadora(double carga, double precio, double peso, String color, char consumoElectrico) {
		super(precio, peso, color, consumoElectrico);
		this.carga=carga;
	}
	
	//get method for carga
	public double getCarga() {
		return carga;
	}
	
	//depending of the charge the final price will grow
	@Override
	public double precioFinal() {
		precioFinal=precioFinal+super.precioFinal();
		if (carga>30)  {
			precio=precio+50;
		}
		return precioFinal;
	}
}
