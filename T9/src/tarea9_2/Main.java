package tarea9_2;

public class Main {

	public static void main(String[] args) {
		Serie[] vSeries=new Serie[5];
		Videojuegos[] vVideojuegos=new Videojuegos[5];
		int contSeries=0, contVideojuegos=0;
		Serie serieMasTemporadas = null;
		Videojuegos videojuegoMasHoras = null;
		
		//Serie object declaration and saving them in vSeries array
		Serie serie1=new Serie();
		vSeries[0]=serie1;
		Serie serie2=new Serie("Mr. Robot","Sam Esmail");
		vSeries[1]=serie2;
		Serie serie3=new Serie("SerieRandom","AlguienRandom","random",4);
		vSeries[2]=serie3;
		Serie serie4=new Serie("Juego de tronos","niIdea","fantasia",8);
		vSeries[3]=serie4;
		Serie serie5=new Serie("MiVida","misPadresSupongo","aburridoLMAOLMAO",19);
		vSeries[4]=serie5;
		
		//Videojuegos object declaration and saving them in vVideojuegos array
		Videojuegos videojuego1=new Videojuegos();
		vVideojuegos[0]=videojuego1;
		Videojuegos videojuego2=new Videojuegos("Monster Hunter World",40);
		vVideojuegos[1]=videojuego2;
		Videojuegos videojuego3=new Videojuegos("Monster Hunter Freedom","fantasia","Capcom",90);
		vVideojuegos[2]=videojuego3;
		Videojuegos videojuego4=new Videojuegos("Monster Hunter 3 Ultimate","fantasia","Capcom",50);
		vVideojuegos[3]=videojuego4;
		Videojuegos videojuego5=new Videojuegos("League of Legends", "MOVA","RitoJuegos",999999999);
		vVideojuegos[4]=videojuego5;
		
		//using entregar method in random vSeries and vVideojuegos objects
		vSeries[0].entregar();
		vSeries[1].entregar();
		vSeries[4].entregar();
		
		vVideojuegos[0].entregar();
		vVideojuegos[3].entregar();
		vVideojuegos[4].entregar();
		
		
		for (int i=0; i<vSeries.length; i++) {
			if (vSeries[i].entregado) { //checking if the object in i position have entregado atribute in true, if is the case then we plus one in the respective counter variable
				contSeries++;
			}
			if (!(i+1>vSeries.length)) { //we compare all the objects of vSeries array to corroborate which of them have more number of episodes
				serieMasTemporadas=(Serie) vSeries[i].compareTo(vSeries[i]);
			}
				
		}
		
		//same as the other for but with vVideojuegos instead
		for (int i=0; i<vVideojuegos.length; i++) {
			if (vVideojuegos[i].entregado) {
				contVideojuegos++;
			}
			if (!(i+1>vVideojuegos.length)) {
				videojuegoMasHoras=(Videojuegos) vVideojuegos[i].compareTo(vVideojuegos[i]);
			}
		}
		
		//showing the results
		System.out.println("Número de series entregadas: "+contSeries+"\nNúmero de videojuegos entregados: "+contVideojuegos);
		System.out.println("La serie con más numero de temporadas es: "+serieMasTemporadas.toString()+"\n\nEl videojuego con más horas es: "+videojuegoMasHoras.toString());
	}

}
