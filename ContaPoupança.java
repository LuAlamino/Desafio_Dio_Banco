public class ContaPoupança extends Conta{

    public void imprimirExtrato() {
        System.out.println("Extrato Conta Poupança: ");
        super.imprimirInformacoesComuns();
    }
}
