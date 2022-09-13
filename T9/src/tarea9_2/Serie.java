package tarea9_2;

public class Serie {
	String titulo="", genero="", creador="";
	int numeroTemporadas=3;
	boolean entregado=false;
	
	//default Serie builder
	public Serie() {
		
	}
	
	//Serie builder with title and creator given by the user
	public Serie(String titulo, String creador) {
		this.titulo=titulo;
		this.creador=creador;
	}
	
	//Serie builder with all the atributes except committed given by the user except entregado
	public Serie(String titulo, String creador, String genero, int numeroTemporadas) {
		this.titulo=titulo;
		this.creador=creador;
		this.genero=genero;
		this.numeroTemporadas=numeroTemporadas;
	}
	
	//set methods
	public void setTitulo(String titulo) {
		this.titulo=titulo;
	}
	
	public void setGenero(String genero) {
		this.genero=genero;
	}

	public void setCreador(String creador) {
		this.creador=creador;
	}
	
	public void setNumeroTemporadas(int numeroTemporadas) {
		this.numeroTemporadas=numeroTemporadas;
	}
	
	//get methods
	public String getTitulo() {
		return titulo;
	}
	
	public String getGenero() {
		return titulo;
	}
	
	public String getCreador() {
		return titulo;
	}
	
	public int getNumeroTemporadas() {
		return numeroTemporadas;
	}
	
	//toString method
	@Override
	public String toString() {
		return "Serie[titulo= "+titulo+", creador= "+creador+", genero= "+genero+", numeroTemporadas= "+numeroTemporadas+"]";
	}
	
	//entregar method, change a boolean to true
	public void entregar() {
		entregado=true;
	}
	
	//devolver method, change a boolean to false
	public void devolver() {
		entregado=false;
	}
	
	//compareTo method, compares the atribute numeroTemporadas between 2 objects
	public Object compareTo(Serie a) {
		Serie objeto;
		
		if (this.numeroTemporadas>a.numeroTemporadas) {
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
