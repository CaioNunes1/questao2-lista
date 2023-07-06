package questao02;
import java.time.LocalDate;

public abstract class Usuario {
	private String email;
	private String nomeCompleto;
	private LocalDate idade;
	
	public Usuario(String email, String nomeCompleto, LocalDate idade) {
		super();
		this.email = email;
		this.nomeCompleto = nomeCompleto;
		this.idade = idade;
	}
	public Usuario() {
		
	}
	public String getEmail() {
		return email;
	}
	@Override
	public String toString() {
		return "Usuario [email=" + email + ", nomeCompleto=" + nomeCompleto + ", idade=" + idade + "]";
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNomeCompleto() {
		return nomeCompleto;
	}
	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}
	public LocalDate getIdade() {
		return idade;
	}
	public void setIdade(LocalDate idade) {
		this.idade = idade;
	} 
}
