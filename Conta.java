public abstract class Conta extends Iconta {

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;


    protected int agencia;
    protected int numero;
    protected double saldo;

    public Conta() {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;

    }


    @Override
    public void sacar(double valor) {
        saldo = saldo - valor;
        // poderia ser saldo -= valor;



    }

    @Override
    public void depositar(double valor) {
        saldo = saldo + valor;

    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);


    }




    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }
    protected void imprimirInformacoesComuns() {
        System.out.println("Extrato conta corrente: ");
        System.out.println(String.format("Agencia: %d", this.agencia ));
        System.out.println(String.format("Conta: %d", this.numero ));
        System.out.println(String.format("Saldo: %.2f", this.saldo ));

    }



}
