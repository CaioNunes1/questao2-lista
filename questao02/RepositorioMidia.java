package questao02;

import java.util.ArrayList;
import java.util.List;

public class RepositorioMidia {
	ArrayList<Midia> listaMidia=new ArrayList<Midia>();
	
	public void cadastrarMidia(Midia m) {
		
		boolean midiaExistente=false;
		if(listaMidia.contains(m)) {
			midiaExistente=true;
			System.out.println("Impossível cadastrar, midia com mesmo nome já existe!");
		}
		
		if(!midiaExistente) {
			listaMidia.add(m);
			System.out.println("Midia "+m.getArquivo()+" cadastrado com sucesso!");
		}
	}
	public void removerMidia(Midia m) {
	    boolean removido = false;
	    if(listaMidia.contains(m)) {
	    	listaMidia.remove(m);
	    	System.out.println("Midia "+m.getArquivo()+" Removida\n");
	    	removido=true;
	    }

	    if (!removido) {
	        System.out.println("Mídia não existente");
	    }
	}

	public List<Midia> listarMidiasPorFaixaEtaria(int faixaEtaria){
		ArrayList<Midia> MidiasPorFaixaEtaria=new ArrayList<Midia>();
		for(Midia i:listaMidia) {
			if(i.getFaixaEtariaMinima()>=faixaEtaria) {
				MidiasPorFaixaEtaria.add(i);
			}
		}
		return MidiasPorFaixaEtaria;
		
	}
	public List<Midia> listarMidiasPorCategoria(String categoria){
		ArrayList<Midia> listarMidiasPorCategoria=new ArrayList<Midia>();
		for(Midia i:listaMidia) {
			if(i.getCategoria().equalsIgnoreCase(categoria)) {
				listarMidiasPorCategoria.add(i);
			}
		}
		return listarMidiasPorCategoria;
		
	}
}
