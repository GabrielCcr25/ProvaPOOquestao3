package br.com.Questao3;

public class Mensalidade {
    private double valorMensalidade;
    private int numIrmaos;

    public Mensalidade(double valorMensalidade, int numIrmaos) {
        this.valorMensalidade = valorMensalidade;
        this.numIrmaos = numIrmaos;
    }
    public double CalculaMensalidade(double valorMensalidade, int numIrmaos){
        if(numIrmaos == 1){
            valorMensalidade=valorMensalidade-(valorMensalidade/0.05);
        } else if (numIrmaos==2) {
            valorMensalidade=valorMensalidade-(valorMensalidade/0.10);


        } else if (numIrmaos>2) {
            valorMensalidade=valorMensalidade-(valorMensalidade/0.15);

        }
        else{
            valorMensalidade=valorMensalidade;
        }
        return valorMensalidade;


    }

}
