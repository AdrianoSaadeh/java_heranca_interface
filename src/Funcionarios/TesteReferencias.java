package Funcionarios;

import Funcionarios.ControleBonificacao;

public class TesteReferencias {

    public static void main(String[] args) {

        Gerente g1 = new Gerente();
        g1.setNome("Marcos");
        g1.setSalario(5000.00);

        Funcionario f1 = new Gerente();
        f1.setSalario(2000.00);

        EditorDeVideo e1 = new EditorDeVideo();
        e1.setSalario(2500.0);

        ControleBonificacao controle = new ControleBonificacao();
        controle.registra(g1);
        controle.registra(f1);
        controle.registra(e1);

        System.out.println(controle.getSoma());

    }
}
