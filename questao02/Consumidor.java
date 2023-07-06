package questao02;
import java.time.temporal.ChronoUnit;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Consumidor extends Usuario {
	
	private List<String> categoriasInteresse=new ArrayList<String>();
	
	
	public Consumidor(String email, String nomeCompleto, LocalDate idade, List<String> categoriasInteresse) {
		super(email, nomeCompleto, idade);
		this.categoriasInteresse = categoriasInteresse;
	}

	public Consumidor() {
		
	}

	public List<String> getCategoriasInteresse() {
		return categoriasInteresse;
	}

	public void setCategoriasInteresse(List<String> categoriasInteresse) {
		this.categoriasInteresse = categoriasInteresse;
	}

	
	@Override
	public String toString() {
		return "\nConsumidor [categoriasInteresse=" + categoriasInteresse + ", getEmail()=" + getEmail()
				+ ", getNomeCompleto()=" + getNomeCompleto() + ", getIdade()=" + getIdade() + "]";
	}
	public long calcularIdade() {
		
		if(getIdade()!=null) {
			long resultado=getIdade().until(LocalDate.now(), ChronoUnit.YEARS);
			
			return resultado;
		}
		else {
			System.out.println("Usuario nulo");
		}
		
				return 1;
	}
}
