package Contas;

public class CalculadorDeImposto {

    private double totoImposto;

    public void registra(Tributavel t) {
        double valor = t.getValorImposto();
        this.totoImposto += valor;
    }

    public double getTotoImposto() {
        return totoImposto;
    }
}
