import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);

        double creditar;
        double debitar; 
        String opcao;

        Conta minhaConta = new Conta();

        
        do {

            System.out.println("Creditar(C) | Debitar(D) | Sair(S)");
            opcao = reader.nextLine().toUpperCase();

            switch (opcao) {
                case "C":
                    System.out.print("Coloque o valor a CREDITAR: R$");
                    creditar = reader.nextDouble();
                    reader.nextLine();
                    minhaConta.credito(creditar);
                    System.out.println("Saldo: " + minhaConta.getSaldo());
                    break;
                case "D":
                    System.out.print("Debitar: ");
                    debitar = reader.nextDouble();
                    reader.nextLine();
                    minhaConta.debito(debitar);
                    System.out.println("Saldo: " + minhaConta.getSaldo());
                    break;
                case "S":
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Digite opção valida");  
                    break;
            }   
        } while (!opcao.equals("S"));
    }
}
