/**
 * Possui os seguintes atributos:
 * salarioFixo do tipo double
 * Criar método getter getSalarioFixo()
 * Criar construtor que receba o valor do salario fixo.
 * Possui os seguintes métodos:
 * double calcularBonus(Departamento departamento), retorna o valor bônus do empregado conforme dados do empregado e do departamento.
 * double calcularSalarioTotal(Departamento departamento), retorna o valor do salário fixo do empregado acrescentado de seu bônus.
 * Para funcionários que não são gerentes, o bônus é calculado a partir do desempenho de seu departamento:
 * recebem 10% do salário fixo caso o departamento tenha atingido sua meta.
 */

public class Empregado {

    private double salarioFixo;

    public Empregado(double salarioFixo) {
        this.salarioFixo = salarioFixo;
    }

    public double getSalarioFixo() {
        return salarioFixo;
    }

    double calcularBonus(Departamento departamento){
        if(departamento.alcancouMeta()){
            return this.getSalarioFixo()*0.1;
        } else{
            return 0;
        }
    }

    double calcularSalarioTotal(Departamento departamento){
        if(departamento.alcancouMeta()){
            return this.calcularBonus(departamento) + this.getSalarioFixo();
        } else{
            return this.getSalarioFixo();
        }
    }
}
