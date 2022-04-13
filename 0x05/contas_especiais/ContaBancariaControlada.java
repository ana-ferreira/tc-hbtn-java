public class ContaBancariaControlada extends ContaBancariaBasica{

    private double saldoMinimo;
    private double valorPenalidade;

    public ContaBancariaControlada(String numeracao, double taxaJurosAnual, double saldoMinimo, double valorPenalidade) {
        super(numeracao, taxaJurosAnual);
        this.saldoMinimo = saldoMinimo;
        this.valorPenalidade = valorPenalidade;
    }

    @Override
    void aplicarAtualizacaoMensal(){
        if (this.getSaldo() < this.saldoMinimo || this.getSaldo() == 0){
            // como modificar o saldo private?
        }
    }

    /**
     * OK herda da classe ContaBancariaBasica
     * contém os seguintes atributos privados:
     * saldoMinimo do tipo double, é o saldo mínimo que conta deve ter para não ser taxada.
     * valorPenalidade do tipo double, é o valor de penalidade a aplicar à conta em que o saldo esteja abaixo do saldo mínimo.
     * OK crie construtor que receba todos valores recebidos pela super classe acrescentado de saldoMinimo e valorPenalidade.
     * sobrescreva o método aplicarAtualizacaoMensal para aplicar a penalidade caso o saldo esteja abaixo do saldo mínimo ou igual a zero.
     */

}
