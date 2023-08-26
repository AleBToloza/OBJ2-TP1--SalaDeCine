package TestSalaCine;

import ar.edu.unahur.salaDeCine.salaDeCine;

public class SalaCineTest {
	
	public static void main(String[] args) {
		
		salaDeCine sala4 = new salaDeCine();
		System.out.println("Sala Creada Correctamente: " + sala4.crearSalaDeBPorF(7, 10));
		sala4.ocuparButaca(2, 3);
		sala4.ocuparButaca(2, 2);
		sala4.ocuparButaca(1, 1);
		sala4.ocuparButaca(1, 2);
		sala4.ocuparButaca(3, 3);
		sala4.ocuparButaca(2, 3);
		sala4.ocuparButaca(3, 2);
		sala4.ocuparButaca(2, 1);
		sala4.ocuparButaca(2, 4);
		sala4.ocuparButaca(2, 5);
		sala4.ocuparButaca(1, 6);
		sala4.ocuparButaca(1, 7);
		sala4.ocuparButaca(3, 8);
		sala4.ocuparButaca(2, 9);
		//sala4.ocuparButaca(3, 10);
		System.out.println("Butaca Ocupada Correctamente: " + sala4.ocuparButaca(3,8));
		System.out.println("Butaca Disponible: " + !sala4.estaButacaOcupada(3,9));
		System.out.println("¿Está sala Vacía?: " + sala4.estaSalaVacia());
		System.out.println("Cantidad Total De Butacas Ocupadas: " + sala4.cantdTotalButacasOcupadas());
		System.out.println("¿Hay Butacas Contiguas Disponibles?: " + sala4.hayEspacioPara(7));
		sala4.mostrarSala();
	}
}