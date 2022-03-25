public class Gerente extends Empregado{
    public Gerente(double salarioFixo) {
        super(salarioFixo);
    }

    @Override
    public double calcularBonus(Departamento departamento){
        if(departamento.alcancouMeta()){
            if (departamento.getValorMeta() < departamento.getValorAtingidoMeta()){
                double porcentagemAdc = (departamento.getValorAtingidoMeta() - departamento.getValorMeta())*0.01;
                return this.getSalarioFixo()*0.2 + porcentagemAdc;
            }else{
                return this.getSalarioFixo()*0.2;
            }
        } else{
            return 0;
        }
    }
}
