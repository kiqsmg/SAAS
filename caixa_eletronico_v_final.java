package default_package; // primeiro iremos 
import java.util.Scanner; //Importar a clase Scanner do java.util package, essa clase vai ser utilizada para ler inputs da command line

//A partir daqui iremos começar realmente a montar as funções do codigo...

public class ATM { //criaremos a public class ATM (acessivel a utras clases) lembrando que ela terá o mesmo nome que o arquivo
  private static Scanner scanner = new Scanner(System.in); // criaremos uma variavel que vai ler o input do usuario
  
  /*
   * posição - cedula
   * 0 - 2
   * 1 - 5
   * 2 - 10
   * 3 - 20
   * 4 - 50
   * 5 - 100
   */
  private static int caixa [] = {100, 100, 100, 100, 100, 100};  //Representando que há 100 cedulas de cada valor no caixa, totalizando 18.700
  
  private static int saldo = 1700; // criamos um int saldo para armazenar quanto a pessoa tem no banco (começaremos com 1700 reais que ela recebe de bolsa)
  
  public static void main(String[] args) { //Ponto de começo para rodar o programa (método principal do programa e chama todos os outros)
    int opcao;  //essa int opcao, armazenara o valor indicado pelo usuario na escolha de função do caixa eletronico
    System.out.println("Caixa Eletrônico SAAS"); //print de inicialização do programa
    do {             // Aqui teremos um do-while loop que deverá se repetir até o usuario selecionar a opção 4-SAIR
     
      System.out.println("Escollha uma opção abaixo:");
      
      System.out.println("1. Verificar saldo");
      
      System.out.println("2. Retirar dinheiro");
      
      System.out.println("3. Depositar dinheiro");
      
      System.out.println("4. Sair");
      
      System.out.print("Opção: ");
      
      
      opcao = scanner.nextInt();  // a int opcao digitada pelo usuario será armazenada na variavel opcao
      
      switch (opcao) { //usaremos o switch para que o programa verifique cqual das 4 opções é igual a opção selecionada pelo usuario
        case 1:     //if opcao = 1...
          verificar_saldo();
          break;
        case 2:
          retirar();
          break;
        case 3:
          depositar();
          break;
        case 4:
          System.out.println("Fim do acesso ao caixa eletrônico. Tenha um bom dia!");
          break;
        default:    //default será usado caso a pessoa digite qualquer coisa que não seja as 4 opções acima
          System.out.println("Error. Tente de novo!");
      }
    } while (opcao != 4); // Aqui teremos a opção que leva a saida do do-while
  }

  private static void verificar_saldo() {
    System.out.println("Seu saldo é de: $" + saldo);
  }

  private static void retirar() {
	  
	//--------------------- cedula 2 --------------------------------------
    System.out.print("Digite o quantas notas de 2 reais você quer retirar:");
    int retirar_2 = scanner.nextInt();
    saldo = saldo - retirar_2*2;
    
    
  //--------------------- cedula 5 --------------------------------------
    System.out.print("Digite o quantas notas de 5 reais você quer retirar:");
    int retirar_5 = scanner.nextInt();
    saldo = saldo - retirar_5*5;
    
    
  //--------------------- cedula 10 --------------------------------------
    System.out.print("Digite o quantas notas de 10 reais você quer retirar:");
    int retirar_10 = scanner.nextInt();
    saldo = saldo - retirar_10*10;
    
    
  //--------------------- cedula 20 --------------------------------------
    System.out.print("Digite o quantas notas de 20 reais você quer retirar:");
    int retirar_20 = scanner.nextInt();
    saldo = saldo - retirar_20*20;
    
    
  //--------------------- cedula 50 --------------------------------------
    System.out.print("Digite o quantas notas de 50 reais você quer retirar:");
    int retirar_50 = scanner.nextInt();
    saldo = saldo - retirar_50*50;
    
    
  //--------------------- cedula 100 --------------------------------------
    System.out.print("Digite o quantas notas de 100 reais você quer retirar:");
    int retirar_100 = scanner.nextInt();
    saldo = saldo - retirar_100*100;
    
    
  //--------------------- situações de erro -------------------------------
    int retirar_total = retirar_2*2 + retirar_5*5 + retirar_10*10 + retirar_20*20 +retirar_50*50 + retirar_100*100;
    if (retirar_total > saldo) {
    	System.out.println("Valor invalido, seu saldo atual é de: $" + saldo + ". Tente novamente.");
    } else if (caixa [0] < retirar_2 || caixa[1] < retirar_5 || caixa[2] < retirar_10 || caixa[3] < retirar_20 || caixa[4] < retirar_50 || caixa[5] < retirar_100) {
    	System.out.println("Valor invalido, seu saldo atual é de: $" + saldo + ". Tente novamente.");
    } else {
    	caixa [0] = caixa [0] - retirar_2;
    	
    	caixa [1] = caixa[1] - retirar_5;
    	
    	caixa [2] = caixa[2] - retirar_10;
    	
    	caixa [3] = caixa[3] - retirar_20;
    	
    	caixa [4] = caixa[4] - retirar_50;
    	
    	caixa [5] = caixa[5] - retirar_100;
    	
    	System.out.println("Você acabou de retirar $" + retirar_total);
        System.out.println("Seu saldo atual é de: $" + saldo);
        
    }
    
  }

  private static void depositar() {
	  
	//--------------------- cedula 2 --------------------------------------
    System.out.print("Digite quantas notas de 2 reais você quer depositar:");
    int amount_2 = scanner.nextInt(); //amount_2 representa a quantidade de cedulas de 2 reais depositada pelo usuario
    saldo = saldo + amount_2*2;
    caixa [0] = caixa [0] + amount_2;
    
    //--------------------- cedula 5 --------------------------------------
    System.out.print("Digite quantas notas de 5 reais você quer depositar:");
    int amount_5 = scanner.nextInt(); //amount_5 representa a quantidade de cedulas de 5 reais depositada pelo usuario
    saldo = saldo +amount_5*5;
    caixa [1] = caixa [1] + amount_5;
    
  //--------------------- cedula 10 --------------------------------------
    System.out.print("Digite quantas notas de 10 reais você quer depositar:");
    int amount_10 = scanner.nextInt(); //amount_10 representa a quantidade de cedulas de 10 reais depositada pelo usuario
    saldo = saldo +amount_10*10;
    caixa [2] = caixa [2] + amount_10;
    
  //--------------------- cedula 20 --------------------------------------
    System.out.print("Digite quantas notas de 20 reais você quer depositar:");
    int amount_20 = scanner.nextInt(); //amount_20 representa a quantidade de cedulas de 20 reais depositada pelo usuario
    saldo = saldo +amount_20*20;
    caixa [3] = caixa [3] + amount_20;
    
  //--------------------- cedula 50 --------------------------------------
    System.out.print("Digite quantas notas de 50 reais você quer depositar:");
    int amount_50 = scanner.nextInt(); //amount_50 representa a quantidade de cedulas de 50 reais depositada pelo usuario
    saldo = saldo +amount_50*50;
    caixa [4] = caixa [4] + amount_50;
    
  //--------------------- cedula 100 --------------------------------------
    System.out.print("Digite quantas notas de 100 reais você quer depositar:");
    int amount_100 = scanner.nextInt(); //amount_100 representa a quantidade de cedulas de 100 reais depositada pelo usuario
    saldo = saldo +amount_100*100;
    caixa [5] = caixa [5] + amount_100;
    
    System.out.println("Seu saldo é de: $" + saldo);
  }
}
