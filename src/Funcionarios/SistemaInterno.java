package Funcionarios;

public class SistemaInterno {

    private int senha = 2222;

    public void autentica(Autenticavel a) {
        boolean autenticou = a.autentica(this.senha);
        if (autenticou) {
            System.out.println("pode entrar no sistema");
        } else {
            System.out.println("entrada negada");
        }
    }
}
