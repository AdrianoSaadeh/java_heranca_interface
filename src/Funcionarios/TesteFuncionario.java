package Funcionarios;

public class TesteFuncionario {

    public static void main(String[] args) {

        Funcionario funcionario = new EditorDeVideo();
        funcionario.setNome("Adriano");
        funcionario.setCpf("1212343456-10");
        funcionario.setSalario(2800.00);

        System.out.println(funcionario.getNome());
        System.out.println(funcionario.getBonificacao());
    }
}
