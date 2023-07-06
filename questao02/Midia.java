package questao02;
import java.time.LocalDateTime;
public class Midia {
	private LocalDateTime dataHoraUpload;
	private String arquivo;
	private int faixaEtariaMinima;
	private String categoria;
	private Produtor produtor;
	
	
	public Midia(LocalDateTime dataHoraUpload, String arquivo, int faixaEtariaMinima, String categoria,
			Produtor produtor) {
		super();
		this.dataHoraUpload = dataHoraUpload;
		this.arquivo = arquivo;
		this.faixaEtariaMinima = faixaEtariaMinima;
		this.categoria = categoria;
		this.produtor = produtor;
	}
	public LocalDateTime getDataHoraUpload() {
		return dataHoraUpload;
	}
	public void setDataHoraUpload(LocalDateTime dataHoraUpload) {
		this.dataHoraUpload = dataHoraUpload;
	}
	public String getArquivo() {
		return arquivo;
	}
	public void setArquivo(String arquivo) {
		this.arquivo = arquivo;
	}
	public int getFaixaEtariaMinima() {
		return faixaEtariaMinima;
	}
	public void setFaixaEtariaMinima(int faixaEtariaMinima) {
		this.faixaEtariaMinima = faixaEtariaMinima;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public Produtor getProdutor() {
		return produtor;
	}
	public void setProdutor(Produtor produtor) {
		this.produtor = produtor;
	}
	@Override
	public String toString() {
		return "Midia [dataHoraUpload=" + dataHoraUpload + ", arquivo=" + arquivo + ", faixaEtariaMinima="
				+ faixaEtariaMinima + ", categoria=" + categoria + ", produtor=" + produtor + "]";
	}
}
