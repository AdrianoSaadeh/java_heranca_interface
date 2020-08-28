package Funcionarios;

public class TesteSistemaInterno {

    public static void main(String[] args) {

        Cliente cli = new Cliente();
        cli.setSenha(2222);

        Gerente g = new Gerente();
        g.setSenha(2222);

        Adminstrador adm= new Adminstrador();
        adm.setSenha(3333);

        SistemaInterno si = new SistemaInterno();
        si.autentica(g);
        si.autentica(adm);
        si.autentica(cli);
    }
}
