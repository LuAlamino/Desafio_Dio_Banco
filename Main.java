import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {




    public static void main(String[] args) {
        Conta cc = new ContaCorrente();
        cc.depositar(200);
        Scanner scanner = new Scanner(System.in);

        Cliente cliente = new Cliente();

        System.out.println("Digite seu nome:");
        String nome = scanner.nextLine();
        cliente.setNome(nome);

        System.out.println("Digite seu CPF:");
        int cpf = scanner.nextInt();
        cliente.setCpf(cpf);

        System.out.println("Nome: " + cliente.getNome());
        System.out.println("CPF: " + cliente.getCpf());

        scanner.close();



        Conta pp = new ContaPoupança();
        cc.transferir(100, pp);
        cc.imprimirExtrato();
        pp.imprimirExtrato();




    }
}
