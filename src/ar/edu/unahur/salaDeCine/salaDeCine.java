package ar.edu.unahur.salaDeCine;

public class salaDeCine {
	private Integer cantdMaximaButacasACrear = 250;
	private Integer cantdButacas;
	private Integer cantdFilas;
	private Boolean sala [][];
	private Boolean salaVacia;
	
	public Boolean[][] getSala() {
		return this.sala;
	}
	
	public Integer getCantdButacas() {
		return this.cantdButacas;
	}
	
	public Integer getCantdFilas() {
		return this.cantdFilas;
	}
	//modificar para ingresar los nros desde la consola
	public Boolean crearSalaDeMPorN(Integer Butacas, Integer Filas) {
		Boolean cantdButacasExcedida = true;
		this.cantdButacas = Butacas;
		this.cantdFilas = Filas;
		if (Filas * Butacas <= this.cantdMaximaButacasACrear) {
			cantdButacasExcedida = false;
			this.sala = new Boolean [Butacas][Filas];
			for (Integer f=0; f<Filas; f++) {
				for (Integer b=0; b<Butacas; b++) {
					this.sala [b][f] = false;
				}
			}
		}
		return cantdButacasExcedida;
	}
	
	public Boolean salaEstaVacia() {
		this.salaVacia = true;
		Integer cantdAsientosVacios = 0;
		for (Integer f=0; f<this.cantdFilas; f++) {
			for (Integer b=0; b<this.cantdButacas; b++) {
				if (this.sala[b][f] == false) {
					cantdAsientosVacios++;
				}
			}
		}
		if (cantdAsientosVacios != this.cantdButacas * this.cantdFilas) {
			this.salaVacia = false;
		}
		return this.salaVacia; //comparar con false, si sala esta vacia, en el test.
		
	}
	
	public Boolean ocuparButaca(Integer Butaca, Integer Fila) {
		Boolean butacaFueOcupada = false;
		if (this.sala[Butaca][Fila] == false) {
			this.sala[Butaca][Fila] = true;
			butacaFueOcupada = true;
		}
		return butacaFueOcupada; //en el test comparar con false si la butaca fue ocupada para imprimir cualquier msj
	}
	
	public Boolean estaButacaOcupada(Integer Butaca, Integer Fila) {
		Boolean butacaVacia = false;
		if (this.sala[Butaca][Fila] != false) {
			butacaVacia = true;
		}
		return butacaVacia;
	}
	
	public Integer cantdTotalButacasOcupadas() {
		Integer cantdAsientosOcupados = 0;
		if (this.salaVacia==false) {
			for (Integer f=0; f<this.cantdFilas; f++) {
				for (Integer b=0; b<this.cantdButacas; b++) {
					if (this.sala[b][f] == true) {
						cantdAsientosOcupados++;
						}
					}
				}
			}
		return cantdAsientosOcupados;
	}
	
	//public Boolean hayEspacioPara(Integer cantdadPersonas) {}
}
