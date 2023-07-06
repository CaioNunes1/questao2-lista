package questao02;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class RepositorioReproducaoMidia {
	ArrayList<ReproducaoMidia> listarReproducaoMidia=new ArrayList<ReproducaoMidia> ();
	
	public void cadastrarReproducaoMidia(ReproducaoMidia rm) {
		listarReproducaoMidia.add(rm);
		System.out.println("Midia "+rm.getMidia()+" adicionada");
		
	}
	public List<ReproducaoMidia> listarReproducoesNoPeriodo(LocalDateTime inicio,LocalDateTime fim){
		ArrayList<ReproducaoMidia> listarReproducoesNoPeriodo=new ArrayList<ReproducaoMidia>();
		for(ReproducaoMidia i:listarReproducaoMidia) {
			if(i.getDataHoraReproducao().isAfter(inicio)&& i.getDataHoraReproducao().isBefore(fim)) {
				listarReproducoesNoPeriodo.add(i);
			}
		}
		return listarReproducoesNoPeriodo;
		
	}
	List<ReproducaoMidia> listarReproducoesPorUsuario(Consumidor usuario){
		ArrayList<ReproducaoMidia> listarReproducoesPorUsuario=new ArrayList<ReproducaoMidia>();
		for(ReproducaoMidia i:listarReproducaoMidia) {
			if(usuario.getEmail().equals(i.getConsumidor().getEmail())) {
				listarReproducoesPorUsuario.add(i);
			}
		}
		return listarReproducoesPorUsuario;
		
	}
	List<ReproducaoMidia> listarReproducoesPorCategorias(List<String> categoria){
		ArrayList<ReproducaoMidia> listarReproducoesPorCategorias=new ArrayList<ReproducaoMidia>();
		for(ReproducaoMidia i:listarReproducaoMidia) {
			for(String a:categoria) {
				if(i.getMidia().getCategoria().equals(a)) {
					listarReproducoesPorCategorias.add(i);
				}
			}
		}
		
		return listarReproducoesPorCategorias;
		
	}
}
