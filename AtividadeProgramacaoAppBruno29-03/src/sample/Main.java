package sample;

import sample.model.Atividade1;

public class Main {
    public static void main(String[] args) {

        Atividade1 pessoa1 = new Atividade1();
        pessoa1.setNome("Juliana");
        pessoa1.setIdade(10);

        Atividade1 pessoa2 = new Atividade1();
        pessoa2.setNome("Gabriel");
        pessoa2.setIdade(30);

        System.out.println("Dados pessoa 1: " + pessoa1.getNome() + ", Idade: " + pessoa1.getIdade());
        System.out.println("Dados pessoa 2: " + pessoa2.getNome() + ", Idade: " + pessoa2.getIdade());

        if (pessoa1.getIdade() > pessoa2.getIdade()){
            System.out.println("A idade maior pertence à: " + pessoa1.getNome() + ", Idade: " + pessoa1.getIdade());
        } else {
            System.out.println("A idade maior pertence à: " + pessoa2.getNome() + ", Idade: " + pessoa2.getIdade());
        }
    }
}
