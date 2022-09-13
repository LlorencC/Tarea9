package tarea9_1;

public class Main {

	public static void main(String[] args) {
		Electrodomestico[] vElectro=new Electrodomestico[10];
		double precioLava=0, precioTele=0, precioElectro=0;
		//declaration of Electrodomestico, television and lavadora objects
		Electrodomestico tele1=new Television();
		vElectro[0]=tele1;
		Electrodomestico lavadora1=new Lavadora(40,302,120,"negro",'A');
		vElectro[1]=lavadora1;
		Electrodomestico tele2=new Television(28,true,300,32,"negro",'F');
		vElectro[2]=tele2;
		Electrodomestico lavadora2=new Lavadora(6,551,29,"blanco",'B');
		vElectro[3]=lavadora2;
		Electrodomestico lavadora3=new Lavadora(13,123,321,"rojo",'C');
		vElectro[4]=lavadora3;
		Electrodomestico lavadora4=new Lavadora(34,432,345,"gris",'D');
		vElectro[5]=lavadora4;
		Electrodomestico lavadora5=new Lavadora();
		vElectro[6]=lavadora5;
		Electrodomestico tele3=new Television(32,false,232,19,"azul",'A');
		vElectro[7]=tele3;
		Electrodomestico tele4=new Television(52,true,231,49,"gris",'B');
		vElectro[8]=tele4;
		Electrodomestico tele5=new Television(12,false,921,39,"rojo",'F');
		vElectro[9]=tele5;
		
		//calculating the final price of lavadoras and televisiones
		for (int i=0;i<vElectro.length;i++) {
			vElectro[i].precioFinal();
			if (vElectro[i] instanceof Lavadora) {
				precioLava=precioLava+vElectro[i].precio;
			}
			else if (vElectro[i] instanceof Television) {
				precioTele=precioTele+vElectro[i].precio;
			}
			else {
				precioElectro=precioElectro+vElectro[i].precio;
			}
		}
		//showing the results
		System.out.print("Lavadora= "+precioLava+"\nTelevision= "+precioTele+"\nElectrodomestico= "+precioElectro+"\nTotal= "+(precioLava+precioTele+precioElectro));
	}

}
