//Teste para erar código que faça um tracking das notas de 10, 20, 50 e 100 reais

public class FluxoNotas {
  static int notaDeDez = 200;
  static int notaDeVinte = 200;
  static int notaDeCinquenta = 200;
  static int notaDeCem = 100;
  // total de 26 mil reais
  
  static int totalDeposito = 1700;
  static int totalRetirado = 0;
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int choice;
    
    do {
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
      System.out.println("Valor invalido, seu saldo atual é de: $" + saldo + ". Tente novamente.");
    } else {
      
      
      
      
  private static void depositar() {
    System.out.print("Digite o quanto você quer depositar, desde que sejá multiplo de (10, 20, 50, 100):");
    int amount = scanner.nextInt();
    
      
    
