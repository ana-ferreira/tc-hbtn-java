import exceptions.OperacaoInvalidaException;

public class ContaBancariaTarifada extends ContaBancariaBasica{

    public ContaBancariaTarifada(String numeracao, double taxaJurosAnual) {
        super(numeracao, taxaJurosAnual);
    }

    private int quantidadeTransacoes = 0;

    public int getQuantidadeTransacoes() {
        return quantidadeTransacoes;
    }

    @Override
    void depositar(double valor) throws OperacaoInvalidaException {
        this.quantidadeTransacoes ++;
        super.depositar(valor);
        this.saldo = this.saldo - 0.10;
    }

    @Override
    void sacar(double valor) throws OperacaoInvalidaException {
        this.quantidadeTransacoes ++;
        super.sacar(valor);
        this.saldo = this.saldo - 0.10;
    }
}
