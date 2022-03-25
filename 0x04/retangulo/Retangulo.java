/**
 * OK atributo privado: private double largura
 * OK atributo privado: private double altura
 * OK métodos acessores (getters/setters) de largura:
 * OK getLargura: retorna o valor de largura
 * OK setLargura: se valor for negativo, lançar exceção java.lang.IllegalArgumentException com a mensagem Largura deve ser maior ou igual a 0, senão atribua o valor de largura.
 * OK métodos acessores (getters/setters) de altura:
 * OK getAltura: retorna o valor de altura
 * setAltura: se valor for negativo, lançar exceção java.lang.IllegalArgumentException com a mensagem Altura deve ser maior ou igual a 0, senão atribua o valor de altura.
 */


public class Retangulo extends FormaGeometrica{
    private double largura;
    private double altura;

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        if(largura < 0){
            throw new IllegalArgumentException("Largura deve ser maior ou igual a 0");
        }else{
            this.largura = largura;
        }
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if(altura < 0){
            throw new IllegalArgumentException("Altura deve ser maior ou igual a 0");
        }else{
            this.altura = altura;
        }
    }
}
