package tarea9_2;

public class Videojuegos {
	String titulo="", genero="", companyia="";
	int horasEstimadas;
	boolean entregado;
	final int defaultHoras=10;
	final boolean defaultEntregado=false;
	
	//default Videojuegos builder
	public Videojuegos() {
		horasEstimadas=defaultHoras;
		entregado=defaultEntregado;
	}
	
	//Videojuegos builder with the attributes titulo and horasEstimadas 
	public Videojuegos(String titulo, int horasEstimadas) {
		entregado=defaultEntregado;
		this.titulo=titulo;
		this.horasEstimadas=horasEstimadas;
	}
	
	//Videojuegos builder
	public Videojuegos(String titulo, String genero, String companyia, int horasEstimadas) {
		entregado=defaultEntregado;
		this.titulo=titulo;
		this.genero=genero;
		this.companyia=companyia;
		this.horasEstimadas=horasEstimadas;
	}
	
	//set methods
	public void setTitulo(String titulo) {
		this.titulo=titulo;
	}
	
	public void setGenero(String genero) {
		this.genero=genero;
	}

	public void setCompanyia(String companyia) {
		this.companyia=companyia;
	}
	
	public void setHorasEstimadas(int horasEstimadas) {
		this.horasEstimadas=horasEstimadas;
	}
	
	
	//toString method
	@Override
	public String toString() {
		return "Videojuegos[titulo= "+titulo+", genero= "+genero+", companyia= "+companyia+", horasEstimadas= "+horasEstimadas+", entregado= "+entregado+"]";
	}
	
	//entregar method, change a boolean to true
	public void entregar() {
		entregado=true;
	}
	
	//devolver method, change a boolean to false
	public void devolver() {
		entregado=false;
	}
	
	//compareTo method, compares the atribute horasEstimadas between 2 objects
	public Object compareTo(Videojuegos a) {
		Videojuegos objeto;
		
		if (this.horasEstimadas>a.horasEstimadas) {
			objeto=this;
		}
		else {
			objeto=a;
		}
		
		return objeto;
	}
	
	//method isEntregado returns the value of a boolean
	public boolean isEntregado(boolean var) {
		return var;
	}
}
