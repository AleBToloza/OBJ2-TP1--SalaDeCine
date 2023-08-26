package ar.edu.unahur.salaDeCine;

public class salaDeCine {
	private final Integer cantdMaximaButacasACrear = 240;
	private Integer cantdButacas;
	private Integer cantdFilas;
	private Boolean sala [][];
	private Boolean salaVacia;
	
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
			for (Integer f=0; f<Filas; f++) {
				for (Integer b=0; b<Butacas; b++) {
					this.sala [b][f] = false;
				}
			}
		}
		return cantdButacasCorrecta;
	}
	
	public Boolean estaSalaVacia() {
		this.salaVacia = true;
		Integer cantdAsientosVacios = 0;
		for (Integer f=0; f<this.cantdFilas; f++) {
			for (Integer b=0; b<this.cantdButacas; b++) {
				if (!this.sala[b][f]) {
					cantdAsientosVacios++;
				}
			}
		}
		if (cantdAsientosVacios != this.cantdButacas * this.cantdFilas) {
			this.salaVacia = false;
		}
		return this.salaVacia;
		
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
		if (!this.salaVacia) {
			for (Integer f=0; f<this.cantdFilas; f++) {
				for (Integer b=0; b<this.cantdButacas; b++) {
					if (this.sala[b][f]) {
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
		for (Integer f=0; f<Filas; f++) {
			System.out.println ("");
			for (Integer b=0; b<Butacas; b++) {
				System.out.println("Butaca: " + (b+1) + "/" + "Fila: " + (f+1) + " - " + "Ocupada: " + this.sala[b][f]);
				}
			}
		}
	
	public Boolean hayEspacioPara(Integer cantdPersonas) {
		Integer asientosLibres = 0;
		Boolean hayAsientosContiguos = true;
		if (!this.salaVacia) {
			for (Integer f=0; f<this.cantdFilas; f++) {
				asientosLibres = 0;
				for (Integer b=0; b<this.cantdButacas; b++) {
					if (!this.sala[b][f]) { asientosLibres++; }
				}
				if (asientosLibres >= cantdPersonas) { break; }
			}
			if (asientosLibres < cantdPersonas) { hayAsientosContiguos = false; }
		}
		return hayAsientosContiguos;
	}
}
