package Contas;

public class ContaPoupanca extends Conta{

    public ContaPoupanca(int agencia, int numero) {
        super(agencia, numero);
    }

    //metodo implentado obrigatoriamente por ser abstrato na classe mae
    @Override
    public void deposita(double valor) {
        super.saldo += valor;
    }
}
