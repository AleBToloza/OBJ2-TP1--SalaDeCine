package TestSalaCine;

import ar.edu.unahur.salaDeCine.salaDeCine;

public class SalaCineTest {

	public static void main(String[] args) {
		
		salaDeCine sala4 = new salaDeCine();
		sala4.crearSalaDeMPorN(3, 3);
		
		//sala4.mostrarSala(sala4.getCantdButacas(), sala4.getCantdFilas(), sala4.getSala());
		//sala4.ocuparButaca(1, 2);
		//sala4.ocuparButaca(1, 1);
		sala4.ocuparButaca(0, 0);
		sala4.ocuparButaca(0, 1);
		sala4.ocuparButaca(2,2);
		System.out.println("No se puede ocupar Butaca? "+(sala4.ocuparButaca(2,2)==false));
		System.out.println("Esta Butaca Ocupada? " + sala4.estaButacaOcupada(0,1));
		//sala4.ocuparButaca(2, 1);
		//sala4.ocuparButaca(1, 0);
		//sala4.mostrarSala(sala4.getCantdButacas(), sala4.getCantdFilas(), sala4.getSala());
		System.out.println("Esta sala Vacía? " + sala4.salaEstaVacia());
		//sala4.ocuparButaca(1, 2);
		System.out.println("Cantid Total Butacas Ocupadas: " + sala4.cantdTotalButacasOcupadas());
		
		//public void mostrarSala(Integer Butacas, Integer Filas, Boolean[][] Sala) {
		//	for (Integer f=0; f<Filas; f++) {
		//		System.out.println ("");
		//		for (Integer b=0; b<Butacas; b++) {
		//			System.out.println("Butaca: " + b + "/" + "Fila: " + f + " - " + "Ocupada: " + Sala[Butacas][Filas]);
		//			}
		//		}
		//	}
	}
}