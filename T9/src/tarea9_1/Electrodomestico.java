package tarea9_1;

public class Electrodomestico {
	final double precioBase=100, pesoDefault=5;
	final String colorDefault="blanco";
	final String[] vColoresPermitidos={"blanco","negro","azul","gris"}; //we declare this array to check if the color that is given by the user is correct
	final char consumoElectricoDefault='F';
	final char[] vConsumoPermitido={'A','B','C','D','E','F'}; //we declare this array by the same reason of the String array
	double precio, peso, precioFinal;
	String color;
	char consumoElectrico;
	
	//Default Electrodomestico builder
	public Electrodomestico() {
		precio=precioBase;
		peso=pesoDefault;
		color=colorDefault;
		consumoElectrico=consumoElectricoDefault;
	}
	
	//Electrodomestico builder with price and weight given by the user
	public Electrodomestico(double precio, double peso) {
		this.precio=precio;
		this.peso=peso;
	}
	
	//Electrodomestico builder with all the attributes given by the user
	public Electrodomestico(double precio, double peso, String color, char consumoElectrico) {
		comprobarConsumoEnergetico(consumoElectrico);
		comprobarColor(color);	
		this.precio=precio;
		this.peso=peso;	
		precioFinal();
	}
	
	//testing method to print the attributes
	public void mostrarElectrodomestico() {
		System.out.println(this.precio);
		System.out.println(this.peso);
		System.out.println(this.color);
		System.out.println(this.consumoElectrico);
	}
	
	//gets method
	public double getPrecio() {
		return precio;
	}
	
	public double getPeso() {
		return peso;
	}
	
	public String getColor() {
		return color;
	}
	
	public char getConsumoElectrico() {
		return consumoElectrico;
	}
	
	//cheking if the consume is in the valid values
	public void comprobarConsumoEnergetico(char letra) {
		boolean consumoCorrecto=false;
		for (int i=0;i<vConsumoPermitido.length && !consumoCorrecto;i++) { //we get sure that the consume given by the user is correct
			if (vConsumoPermitido[i]==letra) {
				this.consumoElectrico=letra;
				consumoCorrecto=true;
			}
		}
	}
	
	//cheking if the color is valid
	public void comprobarColor(String color) {
		boolean colorCorrecto=false;
		for (int i=0;i<vColoresPermitidos.length && !colorCorrecto;i++) { //we get sure that the color given by the user is correct
			if (vColoresPermitidos[i].equalsIgnoreCase(color)) {
				this.color=color;
				colorCorrecto=true;
			}
		}
	}
	
	//depending of the consume or the weight the final price will grow
	public double precioFinal() {
		switch (consumoElectrico) {
			case 'A':
				precioFinal=precio+100;
				break;
			case 'B':
				precioFinal=precio+80;
				break;
			case 'C':
				precioFinal=precio+60;
				break;
			case 'D':
				precioFinal=precio+50;
				break;
			case 'E':
				precioFinal=precio+30;
				break;
			case 'F':
				precioFinal=precio+10;
				break;
		}
		
		if (peso>=0 && peso<=19) {
			precioFinal=precio+10;
		}
		else if (peso>=20 && peso<=49) {
			precioFinal=precio+50;
		}
		else if (peso>=50 && peso<=79) {
			precioFinal=precio+80;
		}
		else if (peso>=80) {
			precioFinal=precio+100;
		}
		return precioFinal;
	}
}
