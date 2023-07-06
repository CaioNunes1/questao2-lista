package questao02;
import java.time.LocalDateTime;
import java.util.Random;
public class ControladorMidia implements InterfaceControladorMidia{
	
	private static ControladorMidia controlador;
	private RepositorioMidia rm;
	private RepositorioUsuario ru;
	private RepositorioReproducaoMidia rrm;
	
	private ControladorMidia() {
		rm=new RepositorioMidia();
		ru=new RepositorioUsuario();
		rrm=new RepositorioReproducaoMidia();
	}
	
	public static synchronized ControladorMidia getIntancia() {
		if(controlador==null) {
			controlador=new ControladorMidia();	
		}
		return controlador;
	}
	
	public void cadastrarUsuario(Usuario u) {
		if(u!=null) {
			if(u instanceof Produtor) {//SE U FOR DO TIPO PRODUTOR
				
				if(((Produtor) u).getCategorias()==null) {//SE AS CATEGORIAS DO PRODUTOR NAO FOREM NULAS
					System.out.println("Usu�rio do tipo Produtor n�o pode ter suas categorias nulas ou vazias");
				}
				else {
					ru.cadastrarUsuario(u);
				}
			}
			if(u instanceof Consumidor) {
				ru.cadastrarUsuario(u);
			}
		}
		else if(u==null) {
			System.out.println("Imposs�vel cadastrar usu�rio nulo!!");
		}
		
	}
	public void removerUsuario(Usuario u) {
		if(u!=null) {
			ru.removerUsuario(u);
		}
		
	}
	public void cadastrarMidia(Midia m) {
	    if (m != null) {
	        
	        boolean correspondencia = false;
	        for (int i = 0; i < m.getProdutor().getCategorias().size(); i++) {
	            if (m.getCategoria().equals(m.getProdutor().getCategorias().get(i))) {
	                correspondencia = true;
	                break;
	            }
	        }
	        
	        if (correspondencia) {
	        	System.out.println("Midia cadastrada");
	            rm.cadastrarMidia(m);
	        }
	        else {
	            System.out.println("N�o � poss�vel cadastrar uma m�dia com a categoria diferente da do seu produtor");
	        }
	    }
	    else {
	        System.out.println("Imposs�vel cadastrar m�dia nula ou vazia");
	    }
	}

	public void removerMidia(Midia m) {
		if(m!=null) {
			rm.removerMidia(m);
		}
		else {
			System.out.println("Imposs�vel remover m�dia nula ou vazia");
		}
		
	}
	public void reproduzirMidia(Consumidor consumidor, Midia midia) {
		if(consumidor!=null && midia!=null) {
			if(consumidor.calcularIdade()>=midia.getFaixaEtariaMinima()) {
				Random random = new Random();
				int mesMin = 1,mesMax = 12;
		        int diaMin = 1,diaMax = 30;
		        int anoMin = 2022,anoMax = 2023;
		        int horaMin = 0,horaMax = 23;
		        int minutoMin = 0,minutoMax = 59;
		        
		        // Gerando valores aleat�rios para cada componente
		        int mesAleatorio = random.nextInt(mesMax - mesMin + 1) + mesMin;
		        int diaAleatorio = random.nextInt(diaMax - diaMin + 1) + diaMin;
		        int anoAleatorio = random.nextInt(anoMax - anoMin + 1) + anoMin;
		        int horaAleatoria = random.nextInt(horaMax - horaMin + 1) + horaMin;
		        int minutoAleatorio = random.nextInt(minutoMax - minutoMin + 1) + minutoMin;
		        if(mesAleatorio==2) {
		        	diaAleatorio=28;
		        }
				
				LocalDateTime dataAtual=LocalDateTime.of(anoAleatorio, mesAleatorio, diaAleatorio, horaAleatoria, minutoAleatorio);
				ReproducaoMidia reproM=new ReproducaoMidia();//criando um objeto do tipo ReproducaoMidia
				
				//setando consumidor, data e midia
				reproM.setConsumidor(consumidor);
				reproM.setMidia(midia);
				reproM.setDataHoraReproducao(dataAtual);
				rrm.cadastrarReproducaoMidia(reproM);
			}
			if(consumidor.calcularIdade()<midia.getFaixaEtariaMinima()) {
				System.out.println("Usu�rio"+consumidor.getEmail()+"n�o tem idade min�ma para assistir "+midia.getArquivo());
			}
		}
		else
		{
			System.out.println("Imposs�vel cadastrar m�dia com Usu�rio ou m�dia nulos");
		}
	}

	public RepositorioMidia getRm() {
		return rm;
	}

	public void setRm(RepositorioMidia rm) {
		this.rm = rm;
	}

	public RepositorioUsuario getRu() {
		return ru;
	}

	public void setRu(RepositorioUsuario ru) {
		this.ru = ru;
	}

	public RepositorioReproducaoMidia getRrm() {
		return rrm;
	}

	public void setRrm(RepositorioReproducaoMidia rrm) {
		this.rrm = rrm;
	}
}
