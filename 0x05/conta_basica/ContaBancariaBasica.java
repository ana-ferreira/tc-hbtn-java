import exceptions.OperacaoInvalidaException;

public class ContaBancariaBasica {

    private String numeracao;
    private double saldo;
    private double taxaJurosAnual;

    public ContaBancariaBasica(String numeracao, double taxaJurosAnual) {
        this.numeracao = numeracao;
        this.taxaJurosAnual = taxaJurosAnual;
        this.saldo = 0.0;
    }

    public String getNumeracao() {
        return numeracao;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getTaxaJurosAnual() {
        return taxaJurosAnual;
    }

    void depositar(double valor) throws OperacaoInvalidaException {
        if(valor > 0){
            this.saldo = this.getSaldo() + valor;
        }else {
            throw new OperacaoInvalidaException("Valor para deposito deve ser maior que 0");
        }
    }

    void sacar(double valor) throws OperacaoInvalidaException {
        if(valor > 0){
            if(this.getSaldo() >= valor){
                this.saldo = this.getSaldo() - valor;
            }else {
                throw new OperacaoInvalidaException("Valor de saque deve ser menor que o saldo atual");
            }

        }else {
            throw new OperacaoInvalidaException("Valor de saque deve ser menor que 0");
        }
    }

    double calcularTarifaMensal(){
        double valorPercentual = Math.max(0.0, saldo * 0.1);
        double valorTarifa = Math.min(10.00, valorPercentual);
        return valorTarifa;
    }

    double calcularJurosMensal(){
        if(this.getSaldo() < 0){
            return 0;
        } else {
            double porcentagem = (this.getTaxaJurosAnual() / 12) / 100;
            double valorJuros = this.getSaldo() * porcentagem;
            valorJuros = Math.max(0.00, valorJuros);
            return valorJuros;
        }
    }

    void aplicarAtualizacaoMensal(){
        double valorAjuste = calcularJurosMensal() - calcularTarifaMensal();
        saldo += valorAjuste;
    }

}
