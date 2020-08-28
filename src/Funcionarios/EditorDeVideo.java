package Funcionarios;

public class EditorDeVideo extends Funcionario{

    public double getBonificacao() {
        System.out.println("bonificacao do editor");
        return super.getBonificacao() + 100;
    }
}
