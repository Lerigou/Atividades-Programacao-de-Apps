package sample;

import sample.model.ContaBancaria;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Insira o nome do titular.");
        String nomeTitular = scan.next();

        System.out.println("Insira o número da conta.");
        int numConta = scan.nextInt();

        System.out.println("Deseja inicializar saldo na conta? Use 1 para sim ou 2 para não.");
        int inicial = scan.nextInt();

        ContaBancaria conta3 = new ContaBancaria(numConta, nomeTitular);
        conta3.setInicial(inicial);
        System.out.println("Insira um valor para o depósito inicial. Caso tenha optado por não inicializar saldo, não se preocupe pois o valor será anulado.");
        double varini = scan.nextDouble();
        conta3.iniciar(varini);
        System.out.println(conta3);

        System.out.println("Insira um valor para o depósito.");
        double deposito = scan.nextDouble();
        conta3.depositar(deposito);
        System.out.println(conta3);

        System.out.println("Insira um valor para o saque.");
        double saque = scan.nextDouble();
        conta3.sacar(saque);
        System.out.println(conta3);
    }
}
