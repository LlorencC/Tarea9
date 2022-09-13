package tarea9_3;

public class Main {

	public static void main(String[] args) {
		//declaration of Libro objects
		Libro libro1=new Libro();
		Libro libro2=new Libro();
		//we set the values of the attributes of libro1
		libro1.setAutor("Karl Marx & Friedrich Engels");
		libro1.setISBN("WD0GYBU8F2W389R732");
		libro1.setNumPaginas(120);
		libro1.setTitulo("Manifiesto Comunista");
		////we set the values of the attributes of libro2
		libro2.setAutor("La caída de las naciones");
		libro2.setISBN("ESU123HBJ4KJ454J");
		libro2.setNumPaginas(325);
		libro2.setTitulo("Xupin");
		//using toString method in twice objects
		System.out.println(libro1.toString());
		System.out.println(libro2.toString());
		//we compare the 2 books to know which of them have more pages
		if (libro1.numPaginas>libro2.numPaginas) {
			System.out.println("El libro 1 tiene más páginas");
		}
		else {
			System.out.println("El libro 2 tiene más páginas");
		}

	}

}
