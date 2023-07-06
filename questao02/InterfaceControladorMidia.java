package questao02;

public interface InterfaceControladorMidia {
	
	public void cadastrarUsuario(Usuario u);
	public void removerUsuario(Usuario u);
	public void cadastrarMidia(Midia m);
	public void removerMidia(Midia m);
	public void reproduzirMidia(Consumidor consumidor, Midia midia);

}
