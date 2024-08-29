public class ContaPoupanca {

    String extrato = "";
    double saldo = 0;

    public void depositar(double valorDeposito) {
        this.saldo += Math.abs(valorDeposito);
        adicionarValorExtrato("Deposito", valorDeposito);
        System.out.println("Deposito efetuado");
    }

    public void sacar(double valorSaque) throws SaqueMaiorQueSaldoException {
        if(valorSaque > this.saldo) {
            throw new SaqueMaiorQueSaldoException("Impossivel sacar valor maior do que o saldo em conta.");
        }
        this.saldo -= Math.abs(valorSaque);
        adicionarValorExtrato("Saque", valorSaque);
        System.out.println("Saque efetuado");
    }

    public void adicionarValorExtrato(String tipoTransacao, double valor) {
        this.extrato += tipoTransacao + " no valor de " + valor + " na conta poupanca\n";
    }

    public void verExtrato() {
        System.out.println(extrato);
        System.out.printf("Valor total em conta: %.2f%n", this.saldo);
    }
}
