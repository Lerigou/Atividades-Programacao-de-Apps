package sample;

import sample.model.Atividade2;

public class Main2 {

    public static void main(String[] args) {

        Atividade2 funcionario1 = new Atividade2();
        funcionario1.setNome("Rafael");
        funcionario1.setSalario(4500);

        Atividade2 funcionario2 = new Atividade2();
        funcionario2.setNome("Jonata");
        funcionario2.setSalario(4000);

        System.out.println("Dados do Funcionario 1: " + funcionario1.getNome() + ", Salário: " + funcionario1.getSalario());
        System.out.println("Dados do Funcionario 2: " + funcionario2.getNome() + ", Salário: " + funcionario2.getSalario());

        if (funcionario1.getSalario() > funcionario2.getSalario()){
            System.out.println("O maior salário pertence à: " + funcionario1.getNome() + ", Salário: " + funcionario1.getSalario());
        } else {
            System.out.println("O maior salário pertence à: " + funcionario2.getNome() + ", Salário: " + funcionario2.getSalario());
        }
    }
}
