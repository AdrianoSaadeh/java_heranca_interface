package Funcionarios;

public class Adminstrador extends Funcionario implements Autenticavel {

    private AutenticacaoUtil util;

    @Override
    public double getBonificacao() {
        return 50;
    }

    public Adminstrador() {
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
