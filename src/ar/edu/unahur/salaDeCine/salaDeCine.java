package ar.edu.unahur.salaDeCine;

public class salaDeCine {
	private final Integer cantdMaximaButacasACrear = 240;
	private Integer cantdButacas;
	private Integer cantdFilas;
	private Boolean sala [][];
	
	public Integer getCantdButacas() {
		return this.cantdButacas;
	}
	
	public Integer getCantdFilas() {
		return this.cantdFilas;
	}
	
	public Boolean crearSalaDeBPorF(Integer Butacas, Integer Filas) {
		Boolean cantdButacasCorrecta = false;
		this.cantdButacas = Butacas;
		this.cantdFilas = Filas;
		if (Filas * Butacas <= this.cantdMaximaButacasACrear) {
			cantdButacasCorrecta = true;
			this.sala = new Boolean [Butacas][Filas];
			for (Integer fila=0; fila<Filas; fila++) {
				for (Integer butaca=0; butaca<Butacas; butaca++) {
					this.sala [butaca][fila] = false;
				}
			}
		}
		return cantdButacasCorrecta;
	}
	
	public Boolean estaSalaVacia() {
		Boolean salaVacia = true;
		Integer cantdAsientosVacios = 0;
		for (Integer fila=0; fila<this.cantdFilas; fila++) {
			for (Integer butaca=0; butaca<this.cantdButacas; butaca++) {
				if (!this.sala[butaca][fila]) {
					cantdAsientosVacios++;
				}
			}
		}
		if (cantdAsientosVacios != this.cantdButacas * this.cantdFilas) {
			salaVacia = false;
		}
		return salaVacia;
		
	}
	
	public Boolean ocuparButaca(Integer Butaca, Integer Fila) {
		Boolean butacaFueOcupada = false;
		if (!this.estaButacaOcupada(Butaca, Fila)) {
			this.sala[Butaca-1][Fila-1] = true;
			butacaFueOcupada = true;
		}
		return butacaFueOcupada;
	}
	
	public Boolean estaButacaOcupada(Integer Butaca, Integer Fila) {
		Boolean butacaVacia = false;
		if (this.sala[Butaca-1][Fila-1]) {
			butacaVacia = true;
		}
		return butacaVacia;
	}
	
	public Integer cantdTotalButacasOcupadas() {
		Integer cantdAsientosOcupados = 0;
		if (!this.estaSalaVacia()) {
			for (Integer fila=0; fila<this.cantdFilas; fila++) {
				for (Integer butaca=0; butaca<this.cantdButacas; butaca++) {
					if (this.sala[butaca][fila]) {
						cantdAsientosOcupados++;
						}
					}
				}
			}
		return cantdAsientosOcupados;
	}
	
	public void mostrarSala() {
		Integer Filas = this.cantdFilas;
		Integer Butacas = this.cantdButacas;
		for (Integer fila=0; fila<Filas; fila++) {
			System.out.println ("");
			for (Integer butaca=0; butaca<Butacas; butaca++) {
				System.out.println("Butaca: " + (butaca+1) + "/" + "Fila: " + (fila+1) + " - " + "Ocupada: " + this.sala[butaca][fila]);
				}
			}
		}
	
	public Boolean hayEspacioPara(Integer cantdPersonas) {
		Integer asientosLibres = 0;
		Boolean hayAsientosContiguos = true;
		if (!this.estaSalaVacia()) {
			for (Integer fila=0; fila<this.cantdFilas; fila++) {
				asientosLibres = 0;
				for (Integer butaca=0; butaca<this.cantdButacas; butaca++) {
					if (!this.sala[butaca][fila]) { asientosLibres++; }
				}
				if (asientosLibres >= cantdPersonas) { break; }
			}
			if (asientosLibres < cantdPersonas) { hayAsientosContiguos = false; }
		}
		return hayAsientosContiguos;
	}
}
