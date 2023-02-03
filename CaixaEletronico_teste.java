package default_package; // primeiro iremos 
import java.util.Scanner; //Importar a clase Scanner do java.util package, essa clase vai ser utilizada para ler inputs da command line

//A partir daqui iremos começar realmente a montar as funções do codigo...

public class ATM { //criaremos a public class ATM (acessivel a utras clases) lembrando que ela terá o mesmo nome que o arquivo
  private static Scanner scanner = new Scanner(System.in); // criaremos uma variavel que vai ler o input do usuario
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
    System.out.print("Digite o quanto você quer retirar, desde que sejá multiplo de (10, 20, 50, 100):");
    int amount = scanner.nextInt();
    if (amount % 10 != 0 || amount > saldo) {
      System.out.println("Saldo insuficiente, seu saldo atual é de: $" + saldo + ". Tente novamente.");
    } else {
      saldo -= amount;
      System.out.println("Você acabou de retirar $" + amount);
      System.out.println("Seu saldo atual é de: $" + saldo);
    }
  }

  private static void depositar() {
    System.out.print("Digite o quanto você quer depositar, desde que sejá multiplo de (10, 20, 50, 100):");
    int amount = scanner.nextInt();
    if (amount % 10 != 0) {
      System.out.println("Seu valor não é valido. Por favor tentar novamente.");
    } else {
      saldo += amount;
      System.out.println("Você depositou a quantia de $" + amount);
      System.out.println("Seu saldo atual é de: $" + saldo);
    }
  }
}
