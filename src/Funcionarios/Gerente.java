package Funcionarios;

public class Gerente extends Funcionario implements Autenticavel {

    private AutenticacaoUtil util;

    public double getBonificacao() {
        System.out.println("chamando metodo de bonificacao do gerente");
        return super.getBonificacao() + super.getSalario();
    }

    public Gerente() {
        this.util = new AutenticacaoUtil();
    }

    @Override
    public void setSenha(int senha) {
        this.util.setSenha(senha);
    }

    @Override
    public boolean autentica(int senha) {
        return this.util.autentica(senha);
    }
}