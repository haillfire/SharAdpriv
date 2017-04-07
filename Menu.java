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
		System.out.println("Digite o numero da fun�ao desejada:");
		System.out.println("1-Inser�ao");
		System.out.println("2-Exibi�ao de informa�oes");
		System.out.println("3-Busca");
		System.out.println("4-Remo�ao");
		System.out.println("5-Sair");
		System.out.println("------------------------------------");
		t = (int)scan.nextInt();
		while(t<1 || t>4){
			System.out.println("Voce nao digitou uma op�ao valida");			
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
			System.out.println("2-N�o");
			i = (int)scan.nextInt();
			if(i==1){
				flag = false;
			}else if(i==2){
				menu();
			}else{
				System.out.println("Op��o inv�lida");
				menu();
			}
		}
		}
		
	}
	
	//INSER��O
	//
	//
	//
		private void menuInsercao(){
			int t = 0;
			Scanner scan = new Scanner(System.in);
			System.out.println("Digite o numero da fun�ao desejada:");
			System.out.println("1-Inser�ao Manual");
			System.out.println("2-Inser�ao via arquivo");
			System.out.println("3-Voltar ao menu");
			if(t==1){
				insercaoManual();
			}else if(t==2){
				insercaoArquivo(); //COLOCAR SAIDA COMO PARAMETRO
			}else if(t==3){
				menu();
			}else{
				System.out.println("Voce nao digitou uma op�ao valida");
				menuInsercao();
			}
			scan.close();
		}
		
		private void insercaoManual(){
			//FUN��O
			System.out.println("Inser�ao Manual");
			flag = false;
		}
		
		private void insercaoArquivo(){
			//FUN��O
			System.out.println("Inser�ao via arquivo");
			flag = false;
		}
	//
	//
	//	
	//FIM DA INSER��O
		
		
		
	//EXIBI��O
	//
	//
	//
		private void exibicao(){
			int t = 0;
			Scanner scan = new Scanner(System.in);
			System.out.println("Digite o numero da fun�ao desejada:");
			System.out.println("1-Exibi�ao no console");
			System.out.println("2-Exibi�ao via arquivo");
			System.out.println("3-Voltar ao menu");
			t = (int)scan.nextInt();		
			if(t==1){
				exibicaoConsole();
			}else if(t==2){
				exibicaoArquivo(); //COLOCAR SAIDA COMO PARAMETRO
			}else if(t==3){
				menu();
			}else{
				System.out.println("Voce nao digitou uma op�ao valida");
				exibicao();
			}
			scan.close();
		}
		
		private void exibicaoConsole(){
			//FUN��O
			System.out.println("Exibi��o no console");
			flag = false;
		}
		
		private void exibicaoArquivo(){
			//FUN��O
			System.out.println("Exibi��o via arquivo");
			flag = false;
		}
	//
	//
	//	
	//FIM DA EXIBI��O
		
		
		
	//BUSCA
	//
	//
	//
		private void busca(){
			System.out.println("Digite uma palavra para busca");
			//FUNCAO
			flag = false;
		}
	//
	//
	//	
	//FIM DA BUSCA
	
		
		
	//REMO��O
	//
	//
	//
		private void remocao(){
			System.out.println("Digite o objeto a ser removido");
			//FUNCAO
			flag = false;
		}
	//
	//
	//	
	//FIM DA REMO��O

		
	}
