package questao02;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class RepositorioUsuario {
	
	ArrayList <Usuario> listaUsuarios=new ArrayList<Usuario>();
	
	public void cadastrarUsuario(Usuario u) {
		    boolean emailExistente = false;
		    
		    if(listaUsuarios.contains(u)) {
		    	System.out.println("Impossível cadastrar, usuário com o mesmo email já existe!");
		    	emailExistente=true;
		    }
		    
		    if (!emailExistente) {
		        listaUsuarios.add(u);
		        System.out.println("Usuário " + u.getEmail() + " cadastrado com sucesso!");
		    }
		}

	public void removerUsuario(Usuario u) {
		boolean usuarioExistente=false;
		for (Usuario i : listaUsuarios) {
	        if (i.getEmail().equals(u.getEmail())) {
	            System.out.println("Usuario removido!");
	            usuarioExistente=true;
	            listaUsuarios.remove(u);
	            break;
	        }
	    }
		if(!usuarioExistente) {
			System.out.println("Usuario não existente");
		}
		
	}
	public List<Usuario> listarUsuariosComIdadeAcimaDe(int idade){//lista todos os
		//usuários com idade acima da informada como parâmetro
		ArrayList<Usuario> listarUsuariosComIdadeAcimaDe=new ArrayList<Usuario>();
		long resultado=-1;
		
		for(Usuario i:listaUsuarios) {
			if(i.getIdade()!=null) {
				
				resultado=i.getIdade().until(LocalDate.now(), ChronoUnit.YEARS);
				if(resultado>idade) {
					listarUsuariosComIdadeAcimaDe.add(i);
				}
			}
		}
		return listarUsuariosComIdadeAcimaDe;
		
	}
	public List<Usuario> listaUsuarioPorTipo(Class tipo){
		ArrayList <Usuario> listaUsuarioPorTipoConsumidor=new  ArrayList <Usuario>();
		ArrayList <Usuario> listaUsuarioPorTipoProdutor=new  ArrayList <Usuario>();
		if(tipo.isAssignableFrom(Consumidor.class)) {
			for(Usuario i:listaUsuarios) {
				if(i instanceof Consumidor) {
					listaUsuarioPorTipoConsumidor.add(i);
				}
			}
			return listaUsuarioPorTipoConsumidor;
			
		}
		else if(tipo.isAssignableFrom(Produtor.class)) {
			for(Usuario j:listaUsuarios) {
				if(j instanceof Produtor) {
					listaUsuarioPorTipoProdutor.add(j);
				}
			}
			return listaUsuarioPorTipoProdutor;
		}
		return null;
		
	}
	
}
