package questao02;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class TestesMain {
	public static void main(String[] args) {
	LocalDate dataNasciProd1=LocalDate.of(2000, 9, 16);
	LocalDate dataNasciProd2=LocalDate.of(1998, 2, 9);
	LocalDate dataNasciProd3=LocalDate.of(1998, 2, 9);
	
	ArrayList<String> categoriasProd1=new ArrayList<String>();
	categoriasProd1.add("Culinaria");
	categoriasProd1.add("Cozinha");
	
	ArrayList<String> categoriasProd2=new ArrayList<String>();
	categoriasProd2.add("Esportes");
	categoriasProd2.add("Futebol");
	
	ArrayList<String> categoriasProd3=new ArrayList<String>();
	categoriasProd3.add("Tecnologia");
	categoriasProd3.add("Programação");
	
	Produtor prod1=new Produtor("joao@gmail.com","João da Silva Vieira",dataNasciProd1,"Cozinhando com João",categoriasProd1);
	Produtor prod2=new Produtor("anaM@gmail.com","Ana Maria da Costa",dataNasciProd2,"AnaLisando Futebol",categoriasProd2);
	Produtor prod3=new Produtor("mateusA@gmail.com","Mateus Almeida Souza",dataNasciProd3,"Programando com Mateus",categoriasProd3);
	
	ControladorMidia c1=ControladorMidia.getIntancia();
	
	System.out.println("Cadastrando Usuários Produtores");
	c1.cadastrarUsuario(prod1);
	c1.cadastrarUsuario(prod2);
	c1.cadastrarUsuario(prod3);
	
	LocalDate dataNasciConsu1= LocalDate.of(1999,4,23);
	LocalDate dataNasciConsu2= LocalDate.of(2007,8,2);
	LocalDate dataNasciConsu3= LocalDate.of(2002,4,30);
	LocalDate dataNasciConsu4= LocalDate.of(1990,3,6);
	LocalDate dataNasciConsu5= LocalDate.of(2009,1,14);
	LocalDate dataNasciConsu6= LocalDate.of(1999,10,7);
	LocalDate dataNasciConsu7= LocalDate.of(2010,5,19);
	
	ArrayList<String> categoriasConsu=new ArrayList<String>();
	categoriasConsu.add("Tecnologia");
	categoriasConsu.add("Games");
	ArrayList<String> categoriasConsu2=new ArrayList<String>();
	categoriasConsu2.add("Culinaria");
	categoriasConsu2.add("Casa");
	ArrayList<String> categoriasConsu3=new ArrayList<String>();
	categoriasConsu3.add("Programação");
	categoriasConsu3.add("Futebol");
	ArrayList<String> categoriasConsu4=new ArrayList<String>();
	categoriasConsu4.add("Games");
	categoriasConsu4.add("Tecnologia");
	ArrayList<String> categoriasConsu5=new ArrayList<String>();
	categoriasConsu5.add("Games");
	categoriasConsu5.add("Futebol");
	ArrayList<String> categoriasConsu6=new ArrayList<String>();
	categoriasConsu6.add("Maquiagem");
	categoriasConsu6.add("Programação");
	ArrayList<String> categoriasConsu7=new ArrayList<String>();
	categoriasConsu7.add("Culinaria");
	categoriasConsu7.add("Games");
	
	Consumidor consumidor1=new Consumidor("mariaJ@gmail.com","Maria Julia Gomes",dataNasciConsu1,categoriasConsu);
	Consumidor consumidor2=new Consumidor("erick@gmail.com","Erick Riberiro Farias",dataNasciConsu2,categoriasConsu2);
	Consumidor consumidor3=new Consumidor("luizh@gmail.com","Luiz Henrique Matos",dataNasciConsu3,categoriasConsu3);
	Consumidor consumidor4=new Consumidor("manoelB@gamil.com","Manuel Barbosa Santos",dataNasciConsu4,categoriasConsu4);
	Consumidor consumidor5=new Consumidor("lucasmendes@gmail.com","Lucas Mendes",dataNasciConsu5,categoriasConsu5);
	Consumidor consumidor6=new Consumidor(" isabellasantos@gmail.com","Isabella Santos",dataNasciConsu6,categoriasConsu6);
	Consumidor consumidor7=new Consumidor(" enzooliveira@gmail.com","Enzo Oliveira",dataNasciConsu7,categoriasConsu7);
	
	System.out.println("\nCadastrando Usuários Consumidores");
	c1.cadastrarUsuario(consumidor1);
	c1.cadastrarUsuario(consumidor2);
	c1.cadastrarUsuario(consumidor3);
	c1.cadastrarUsuario(consumidor4);
	c1.cadastrarUsuario(consumidor5);
	c1.cadastrarUsuario(consumidor6);
	c1.cadastrarUsuario(consumidor7);
	
	c1.removerUsuario(consumidor7);
	
	System.out.println("\nUsuários com idade acima de 16 anos");
	System.out.println(c1.getRu().listarUsuariosComIdadeAcimaDe(16));
	System.out.println(c1.getRu().listaUsuarioPorTipo(Consumidor.class));
	
	LocalDateTime d1= LocalDateTime.of(2022, 12, 21, 19, 00);
	LocalDateTime d2= LocalDateTime.of(2023, 2, 10, 13, 30);
	LocalDateTime d3= LocalDateTime.of(2023, 5, 29, 8, 15);
	LocalDateTime d4= LocalDateTime.of(2023, 6, 3, 10, 00);
	LocalDateTime d5= LocalDateTime.of(2023, 4, 12, 11, 00);
	LocalDateTime d6= LocalDateTime.of(2023, 1, 17, 9, 00);
	LocalDateTime d7= LocalDateTime.of(2023, 4, 24, 21, 00);
	LocalDateTime d8= LocalDateTime.of(2023, 7, 2, 12, 00);
	
	Midia m1=new Midia(d1,"Como cozinhar arroz",10,"Culinaria",prod1);
	Midia m2=new Midia(d2,"Como fazer um otimo feijão",10,"Culinaria",prod1);
	Midia m3=new Midia(d3,"Ultimas tranferências do mundo da bola",14,"Esportes",prod2);
	Midia m4=new Midia(d4,"Melhores gols do ano",14,"Esportes",prod2);
	Midia m5=new Midia(d5,"Todos os campeões da champions",14,"Esportes",prod2);
	Midia m6=new Midia(d6,"Como ser um bom programdor",15,"Tecnologia",prod3);
	Midia m7=new Midia(d7,"Aprender Python 2023",15,"Tecnologia",prod3);
	Midia m8=new Midia(d8,"Aprender Java 2023",15,"Tecnologia",prod3);
	
	System.out.println("\nCadastrando Midias");
	c1.cadastrarMidia(m1);
	c1.cadastrarMidia(m2);
	c1.cadastrarMidia(m3);
	c1.cadastrarMidia(m4);
	c1.cadastrarMidia(m5);
	c1.cadastrarMidia(m6);
	c1.cadastrarMidia(m7);
	c1.cadastrarMidia(m7);
	c1.cadastrarMidia(m8);
	
	System.out.println("\nRemovendo mídia");
	c1.removerMidia(m8);
	
	System.out.println("\nMidias por faixa etária de 14 anos");
	System.out.println(c1.getRm().listarMidiasPorFaixaEtaria(14));
	System.out.println("\nMidias por Categoria");
	System.out.println(c1.getRm().listarMidiasPorCategoria("Esportes"));
	
	
	System.out.println("\nReproduzindo mídias");
	c1.reproduzirMidia(consumidor7, m4);
	c1.reproduzirMidia(consumidor7, m1);
	c1.reproduzirMidia(consumidor7, m6);
	
	c1.reproduzirMidia(consumidor1, m3);
	c1.reproduzirMidia(consumidor1, m2);
	c1.reproduzirMidia(consumidor1, m7);
	
	c1.reproduzirMidia(consumidor2, m5);
	c1.reproduzirMidia(consumidor2, m6);
	c1.reproduzirMidia(consumidor2, m4);
	
	c1.reproduzirMidia(consumidor3, m7);
	c1.reproduzirMidia(consumidor3, m1);
	c1.reproduzirMidia(consumidor3, m2);
	
	c1.reproduzirMidia(consumidor4, m6);
	c1.reproduzirMidia(consumidor4, m3);
	c1.reproduzirMidia(consumidor4, m4);
	
	c1.reproduzirMidia(consumidor5, m1);
	c1.reproduzirMidia(consumidor5, m5);
	c1.reproduzirMidia(consumidor5, m7);
	
	c1.reproduzirMidia(consumidor6, m7);
	c1.reproduzirMidia(consumidor6, m6);
	
	
	LocalDateTime inicio=LocalDateTime.of(2023, 4, 1, 00, 00);
	LocalDateTime fim=LocalDateTime.now();
	
	System.out.println("\n\nLista de reproduções em um período específico");
	System.out.println(c1.getRrm().listarReproducoesNoPeriodo(inicio,fim));
	
	System.out.println("\n\nLista de reproduções por Usuário");
	System.out.println(c1.getRrm().listarReproducoesPorUsuario(consumidor4));
	
	System.out.println("\n\nLista de reproduções em um período específico");
	
	LocalDateTime inicio2=LocalDateTime.of(2023, 1, 2, 00, 00);
	LocalDateTime fim2=LocalDateTime.of(2023,3,30,00,00);
	
	System.out.println(c1.getRrm().listarReproducoesNoPeriodo(inicio2,fim2));
	ArrayList<String> categoriasAlet=new ArrayList<String>();
	categoriasAlet.add("Tecnologia");
	categoriasAlet.add("Esportes");
	
	System.out.println("\n\nLista de Reproduções por categoria da mídia escolhida por mim");
	System.out.println(c1.getRrm().listarReproducoesPorCategorias(categoriasAlet));
	}

}
