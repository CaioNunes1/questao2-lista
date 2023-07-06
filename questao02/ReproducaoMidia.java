package questao02;

import java.time.LocalDateTime;

public class ReproducaoMidia {
	private Midia midia;
	private Consumidor consumidor;
	private LocalDateTime dataHoraReproducao;
	
	public Midia getMidia() {
		return midia;
	}
	public void setMidia(Midia midia) {
		this.midia = midia;
	}
	public Consumidor getConsumidor() {
		return consumidor;
	}
	public void setConsumidor(Consumidor consumidor) {
		this.consumidor = consumidor;
	}
	public LocalDateTime getDataHoraReproducao() {
		return dataHoraReproducao;
	}
	public void setDataHoraReproducao(LocalDateTime dataHoraReproducao) {
		this.dataHoraReproducao = dataHoraReproducao;
	}
	@Override
	public String toString() {
		return "ReproducaoMidia [midia=" + midia + ", consumidor=" + consumidor + ", dataHoraReproducao="
				+ dataHoraReproducao + "]";
	}
}
