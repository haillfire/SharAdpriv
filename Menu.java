import java.util.Scanner;
public class Menu {
	boolean flag = true;
	public void menu(){
		while(flag){
		int t = 0;
		int i = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("------------------------------------");
		System.out.println("Bem vindo ao SharAd");
		System.out.println("Aqui voce pode fazer seu projeto crescer!");
		System.out.println("");
		System.out.println("Digite o numero da funçao desejada:");
		System.out.println("1-Inserçao");
		System.out.println("2-Exibiçao de informaçoes");
		System.out.println("3-Busca");
		System.out.println("4-Remoçao");
		System.out.println("5-Sair");
		System.out.println("------------------------------------");
		t = (int)scan.nextInt();
		while(t<1 || t>5){
			System.out.println("Voce nao digitou uma opçao valida");			
		}
		if(t==1){
			menuInsercao();
		}else if(t==2){
			exibicao(); //COLOCAR SAIDA COMO PARAMETRO
		}else if(t==3){
			busca();
		}else if(t==4){
			remocao();
		}else if(t==5){
			System.out.println("Tem certeza que deseja sair?");
			System.out.println("1-Sim");
			System.out.println("2-Não");
			i = (int)scan.nextInt();
			if(i==1){
				flag = false;
			}else if(i==2){
				menu();
			}else{
				System.out.println("Opção inválida");
				menu();
			}
		}scan.close();
		}
		
	}
	
	//INSERÇÃO
	//
	//
	//
		private void menuInsercao(){
			int t = 0;
			Scanner scan = new Scanner(System.in);
			System.out.println("Digite o numero da funçao desejada:");
			System.out.println("1-Inserçao Manual");
			System.out.println("2-Inserçao via arquivo");
			System.out.println("3-Voltar ao menu principal");
			t = (int)scan.nextInt();
			if(t==1){
				insercaoManual();
			}else if(t==2){
				insercaoArquivo(); //COLOCAR SAIDA COMO PARAMETRO
			}else if(t==3){
				menu();
			}else{
				System.out.println("Voce nao digitou uma opçao valida");
				menuInsercao();
			}
			scan.close();
		}
		
		private void insercaoManual(){
			//FUNÇÃO
			System.out.println("Inserçao Manual");
			flag = false;
		}
		
		private void insercaoArquivo(){
			//FUNÇÃO
			System.out.println("Inserçao via arquivo");
			flag = false;
		}
	//
	//
	//	
	//FIM DA INSERÇÃO
		
		
		
	//EXIBIÇÃO
	//
	//
	//
		private void exibicao(){
			int t = 0;
			Scanner scan = new Scanner(System.in);
			System.out.println("Digite o numero da funçao desejada:");
			System.out.println("1-Exibiçao no console");
			System.out.println("2-Exibiçao via arquivo");
			System.out.println("3-Voltar ao menu principal");
			t = (int)scan.nextInt();		
			if(t==1){
				exibicaoConsole();
			}else if(t==2){
				exibicaoArquivo(); //COLOCAR SAIDA COMO PARAMETRO
			}else if(t==3){
				menu();
			}else{
				System.out.println("Voce nao digitou uma opçao valida");
				exibicao();
			}
			scan.close();
		}
		
		private void exibicaoConsole(){
			//FUNÇÃO
			System.out.println("Exibição no console");
			flag = false;
		}
		
		private void exibicaoArquivo(){
			//FUNÇÃO
			System.out.println("Exibição via arquivo");
			flag = false;
		}
	//
	//
	//	
	//FIM DA EXIBIÇÃO
		
		
		
	//BUSCA
	//
	//
	//
		private void busca(){
			int t = 0;
			Scanner scan = new Scanner(System.in);
			System.out.println("Escolha o que quer buscar:");
			System.out.println("1-Empresas");
			System.out.println("2-Funcionarios");
			System.out.println("3-Grupos");
			System.out.println("4-Usuarios");
			System.out.println("5-Voltar ao menu principal");
			t = (int)scan.nextInt();
			if(t == 1){
				buscaEmpresa();
			}else if(t==2){
				System.out.println("Digite o nome do funcionario:");
				buscaFuncionario();
			}else if(t==3){
				System.out.println("Digite o nome do grupo:");
				buscaGrupo();
			}else if(t==4){
				System.out.println("Digite o nome do usuario:");
				buscaUsuario();
			}else if(t==5){
				menu();
			}else{
				System.out.println("Voce nao digitou uma opçao valida");
				busca();
			}
			
			
			flag = false;
		}
		
		//BUSCA EMPRESA
		//
		//
		//
		private void buscaEmpresa(){
			int t = 0;
			Scanner scan = new Scanner(System.in);
			System.out.println("O que voce sabe sobre a empresa?");
			System.out.println("1-Nome");
			System.out.println("2-Telefone");
			System.out.println("3-Area");
			System.out.println("4-Nada");
			System.out.println("5-Voltar ao menu busca");
			System.out.println("6-Voltar ao menu principal");
			t = (int)scan.nextInt();
			if(t == 1){
				buscaEmpresaNome();
			}else if(t==2){
				buscaEmpresaTelefone();
			}else if(t==3){
				buscaEmpresaArea();
			}else if(t==4){
				
			}else if(t==5){
				busca();
			}else if(t==6){
				menu();
			}else{
				System.out.println("Voce nao digitou uma opçao valida");
				buscaEmpresa();
			}
		}
		
		
		
		private void buscaTudoEmpresa(){
			int t = 0;
			Scanner scan = new Scanner(System.in);
			System.out.println("Entao, o que quer saber?");
			System.out.println("1-Nome");
			System.out.println("2-Telefone");
			System.out.println("3-Area");
			System.out.println("4-Voltar ao menu busca empresa");
			System.out.println("5-Voltar ao menu busca");
			System.out.println("6-Voltar ao menu principal");
			t = (int)scan.nextInt();
			if(t == 1){
				//LISTA TODOS OS NOMES DE TODAS AS EMPRESAS
			}else if(t==2){
				//LISTA TODOS OS TELEFONES DE TODAS AS EMPRESAS
			}else if(t==3){
				//LISTA TODAS AS AREAS DE TODAS AS EMPRESAS
			}else if(t==4){
				buscaEmpresa();
			}else if(t==5){
				busca();
			}else if(t==6){
				menu();
			}else{
				System.out.println("Voce nao digitou uma opçao valida");
				buscaTudoEmpresa();
			}
		}
		
		
		
		private void buscaEmpresaNome(){
			String t;
			Scanner scan = new Scanner(System.in);
			System.out.println("Digite o nome da empresa que quer buscar:");
			t = (String)scan.nextLine();
			//FUNÇAO QUE VAI MOSTRAR TODAS AS INFORMAÇOES DA(S) EMPRESA(S) COM ESSE NOME
			scan.close();
		}
		
		private void buscaEmpresaTelefone(){
			int t = 0;
			Scanner scan = new Scanner(System.in);
			System.out.println("Digite o telefone da empresa que quer buscar:");
			t = (int)scan.nextInt();
			//FUNÇAO QUE VAI MOSTRAR TODAS AS INFORMAÇOES DA EMPRESA COM ESSE TELEFONE
			scan.close();
		}
		
		private void buscaEmpresaArea(){
			String t;
			Scanner scan = new Scanner(System.in);
			System.out.println("Digite a area da empresa que quer buscar:");
			t = (String)scan.nextLine();
			//FUNÇAO QUE VAI MOSTRAR TODAS AS INFORMAÇOES DA(S) EMPRESA(S) COM ESSA AREA
			scan.close();
		}

		//
		//
		//
		//FIM DO BUSCA EMPRESA
		
		//BUSCA FUNCIONARIO
		//
		//
		//
		private void buscaFuncionario(){
			int t = 0;
			Scanner scan = new Scanner(System.in);
			System.out.println("O que voce sabe sobre o funcionario?");
			System.out.println("1-Nome");
			System.out.println("2-Ranking");
			System.out.println("3-Nada");
			System.out.println("4-Voltar ao menu busca");
			System.out.println("5-Voltar ao menu principal");
			t = (int)scan.nextInt();
			if(t==1){
				buscaFuncionarioNome();
			}else if(t==2){
				buscaFuncionarioRanking();
			}
			else if(t == 3){
				System.out.println("Aqui estao os nomes e seus respectivos rankings: ");
				//LISTA TODOS OS NOMES E RANKINGS DE FUNCIONARIOS
			}
			else if(t == 4){
				busca();
			}else if(t == 5){
				menu();
			}else{
				System.out.println("Voce nao digitou uma opçao valida");
				buscaFuncionario();
			}
			scan.close();
		}
		
		private void buscaFuncionarioNome(){
			String t;
			Scanner scan = new Scanner(System.in);
			System.out.println("Digite o nome do funcionario:");
			t = (String)scan.nextLine();
			//LISTA TODOS OS FUNCIONARIOS E SEUS RESPECTIVOS RANKINGS COM ESSE NOME
		}
		
		private void buscaFuncionarioRanking(){
			int t;
			Scanner scan = new Scanner(System.in);
			System.out.println("Digite o ranking do funcionario:");
			t = (int)scan.nextInt();
			//LISTA TODOS OS FUNCIONARIOS E SEUS RESPECTIVOS RANKINGS COM ESSE RANKING
		}
		//
		//
		//
		//FIM DO BUSCA FUNCIONARIO
		
		private void buscaGrupo(){
			System.out.println("Listando aqui todos os grupos:");
			//LISTA TODOS OS GRUPOS
		}
		
		
		
		//BUSCA USUARIO
		//
		//
		//
		private void buscaUsuario(){
			int t = 0;
			Scanner scan = new Scanner(System.in);
			System.out.println("O que voce sabe sobre o usuario?");
			System.out.println("1-Nome");
			System.out.println("2-Area");
			System.out.println("3-Telefone");
			System.out.println("4-Nada");
			System.out.println("5-Voltar ao menu busca");
			System.out.println("6-Voltar ao menu principal");
			t = (int)scan.nextInt();
			if(t==1){
				buscaUsuarioNome();
			}else if(t==2){
				buscaUsuarioArea();
			}else if(t==3){
				buscaUsuarioTelefone();
			}else if(t==4){
				buscaTudoUsuario();
			}else if(t==5){
				busca();
			}else if(t==6){
				menu();
			}else{
				System.out.println("Voce nao digitou uma opçao valida");
				buscaUsuario();
			}
		}
		
		private void buscaUsuarioNome(){
			String t;
			Scanner scan = new Scanner(System.in);
			System.out.println("Digite o nome aqui:");
			t = (String)scan.nextLine();
			System.out.println("Listando...");
			//LISTA OS NOMES E AREAS DOS USUARIOS COM ESSE NOME
			scan.close();
		}
		
		private void buscaUsuarioArea(){
			String t;
			Scanner scan = new Scanner(System.in);
			System.out.println("Digite a area aqui:");
			t = (String)scan.nextLine();
			System.out.println("Listando...");
			//LISTA OS NOMES E AREAS DOS USUARIOS COM ESSA AREA
			scan.close();
		}
		
		private void buscaUsuarioTelefone(){
			int t = 0;
			Scanner scan = new Scanner(System.in);
			System.out.println("Digite o telefone aqui:");
			t = (int)scan.nextInt();
			System.out.println("Listando...");
			//LISTA O NOME E AREA DO USUARIO COM ESSE TELEFONE
			scan.close();
		}
		
		private void buscaTudoUsuario(){
			int t = 0;
			Scanner scan = new Scanner(System.in);
			System.out.println("Entao, o que voce quer saber?");
			System.out.println("1-Nomes");
			System.out.println("2-Areas");
			System.out.println("3-Voltar ao menu de busca de usuario");
			System.out.println("4-Voltar ao menu de busca");
			System.out.println("5-Voltar ao menu principal");
			t = (int)scan.nextInt();
			if(t==1 || t==2){
				System.out.println("Listando...");
				//LISTA TODOS OS NOMES E AREAS
			}else if(t==3){
				buscaUsuario();
			}else if(t==4){
				busca();
			}else if(t==5){
				menu();
			}else{
				System.out.println("Voce nao digitou uma opçao valida");
				buscaTudoUsuario();
			}
		}
		//
		//
		//
		//FIM DO BUSCA USUARIO
			
	//
	//
	//	
	//FIM DA BUSCA
	
		
		
	//REMOÇÃO
	//
	//
	//
		private void remocao(){
			int t = 0;
			Scanner scan = new Scanner(System.in);
			System.out.println("Escolha o que quer remover:");
			System.out.println("1-Empresa");
			System.out.println("2-Funcionario");
			System.out.println("3-Grupo");
			System.out.println("4-Usuario");
			System.out.println("5-Voltar ao menu principal");
			t = (int)scan.nextInt();
			if(t == 1){
				remocaoEmpresa();
			}else if(t==2){
				remocaoFuncionario();
			}else if(t==3){
				remocaoGrupo();
			}else if(t==4){
				remocaoUsuario();
			}else if(t==5){
				menu();
			}else{
				System.out.println("Voce nao digitou uma opçao valida");
				remocao();
			}

			flag = false;
		}
	//
	//
	//	
	//FIM DA REMOÇÃO

	
	//REMOÇÃO EMPRESA
	//
	//
	//
		private void remocaoEmpresa(){
			String t;
			Scanner scan = new Scanner(System.in);
			System.out.println("Digite o nome da Empresa que quer remover:");
			t = (String)scan.nextLine();
			System.out.println("Removendo...");
			//FUNÇÃO REMOVE TUDO DA EMPRESA
			System.out.println("Removido com sucesso!");
			scan.close();
		}
	//
	//
	//	
	//FIM DA REMOÇÃO EMPRESA
		
	
	//REMOÇÃO FUNCIONARIO
	//
	//
	//	
		private void remocaoFuncionario(){
			String t;
			Scanner scan = new Scanner(System.in);
			System.out.println("Digite o nome do Funcionário que quer remover:");
			t = (String)scan.nextLine();
			System.out.println("Removendo...");
			//FUNÇÃO REMOVE TUDO DO FUNCIONARIO
			System.out.println("Removido com sucesso!");
			scan.close();
			
		}
	//
	//
	//
	//FIM DAS REMOÇÃO FUNCIONARIO
		
		
	//REMOÇÃO GRUPO
	//
	//
	//
		private void remocaoGrupo(){
			String t;
			Scanner scan = new Scanner(System.in);
			System.out.println("Digite o nome do Grupo que quer remover:");
			t = (String)scan.nextLine();
			System.out.println("Removendo...");
			//FUNÇÃO REMOVE TUDO DO GRUPO
			System.out.println("Removido com sucesso!");
			scan.close();
			//DEVERIA TER A OPÇÃO DE REMOVER USUARIOS DO GRUPO, ETC.
		}
	//
	//
	//
	//FIM DAS REMOÇÃO GRUPO
		
		
	//REMOÇÃO USUARIO
	//
	//
	//		
		private void remocaoUsuario(){
			String t;
			Scanner scan = new Scanner(System.in);
			System.out.println("Digite o nome do Usuário que quer remover:");
			t = (String)scan.nextLine();
			System.out.println("Removendo...");
			//FUNÇÃO REMOVE TUDO DO USUÁRIO
			System.out.println("Removido com sucesso!");
			scan.close();
		}
	//
	//
	//
	//FIM DAS REMOÇÃO USUARIO
	}
