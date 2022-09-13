package tarea9_3;

public class Libro {
	String ISBN, titulo, autor;
	int numPaginas;
	
	//set methods
	public void setISBN(String ISBN) {
		this.ISBN=ISBN;
	}
	
	public void setTitulo(String titulo) {
		this.titulo=titulo;
	}
	
	public void setAutor(String autor) {
		this.autor=autor;
	}
	
	public void setNumPaginas(int numPaginas) {
		this.numPaginas=numPaginas;
	}
	
	//toString method
	public String toString() {
		return "El libro con ISBN "+ISBN+" creado por el autor "+autor+" tiene "+numPaginas+" páginas\n";
	}
}
