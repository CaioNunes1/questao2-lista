package questao02;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Produtor extends Usuario {
	private String nomeCanal;
	private List<String> categorias=new ArrayList<String>();
	
	
	
	public Produtor(String email, String nomeCompleto, LocalDate idade, String nomeCanal, List<String> categorias) {
		super(email, nomeCompleto, idade);
		this.nomeCanal = nomeCanal;
		this.categorias = categorias;
	}
	public String getNomeCanal() {
		return nomeCanal;
	}
	public void setNomeCanal(String nomeCanal) {
		this.nomeCanal = nomeCanal;
	}
	public List<String> getCategorias() {
		return categorias;
	}
	public void setCategorias(List<String> categorias) {
		this.categorias = categorias;
	}

	@Override
	public String toString() {
		return "Produtor [nomeCanal=" + nomeCanal + ", categorias=" + categorias + ", getEmail()=" + getEmail()
				+ ", getNomeCompleto()=" + getNomeCompleto() + ", getIdade()=" + getIdade() + "]\n";
	}
	
	
}
