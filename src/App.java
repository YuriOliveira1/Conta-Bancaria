import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);

        String opcao;

        Conta minhaConta = new Conta();

        System.out.println("---Capybara Bank---");
        System.out.print("ID da Conta: ");
        int id = reader.nextInt();
        reader.nextLine();
        minhaConta.setId(id);
        
        do {

            System.out.println("Creditar(C) | Debitar(D) | Mostrar Conta(M) | Sair(S) ");
            opcao = reader.nextLine().toUpperCase();

            switch (opcao) {
                case "C":
                    System.out.println(Transacao.getData());
                    System.out.println("ID da Transação: " + Transacao.getId());

                    System.out.print("Coloque o valor a CREDITAR: R$");
                    double creditar = reader.nextDouble();
                    reader.nextLine();
                    minhaConta.credito(creditar);
                    break;
                case "D":
                    System.out.println(Transacao.getData());
                    System.out.println("ID da Transação: " + Transacao.getId());

                    System.out.print("Debitar: ");
                    double debitar = reader.nextDouble();
                    reader.nextLine();
                    minhaConta.debito(debitar);
                    break;
                case "S":
                    System.out.println("Saindo...");
                    break;
                case "M":
                    System.out.println(Transacao.getData());
                    minhaConta.mostrar();
                    break;
                default:
                    System.out.println("Digite opção valida");  
                    break;
            }   
        } while (!opcao.equals("S"));
        reader.close();
    }
}
