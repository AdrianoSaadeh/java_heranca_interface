package Funcionarios;

public class TesteGerente {

    public static void main(String[] args) {

        Autenticavel referencia = new Gerente();

        Gerente gerente = new Gerente();
        gerente.setNome("Gustavo");
        gerente.setCpf("987987765-01");
        gerente.setSalario(10000.00);

        System.out.println(gerente.getNome());
        System.out.println(gerente.getCpf());
        System.out.println(gerente.getSalario());

        gerente.setSenha(2222);
        boolean autenticou = gerente.autentica(2222);
        System.out.println(autenticou);

        System.out.println(gerente.getBonificacao());
    }
}
