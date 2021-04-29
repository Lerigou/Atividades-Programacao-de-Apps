package sample.model;

public class ContaBancaria {
    private int numConta;
    private String nomeTitular;
    private int inicial;
    private double saldo;
    private double varini;
    private double deposito;
    private double saque;

    public ContaBancaria(int numConta, String nomeTitular){
        this.numConta = numConta;
        this.nomeTitular = nomeTitular;
    }

    public void iniciar(double valor){
        if(inicial == 1){
            this.saldo += valor;
        }
        else{
            this.saldo = 0;
        }
    }

    public void depositar(double valor){
        this.saldo += valor;
    }

    public double sacar(double valor){
        this.saldo -= valor + 5;
        return valor;
    }

    public int getNumconta(){
        return numConta;
    }

    public void setNumconta(int numconta){
        this.numConta = numconta;
    }

    public String getNometitular(){
        return nomeTitular;
    }

    public void setNometitular(String nometitular){
        this.nomeTitular = nometitular;
    }

    public int getInicial(){
        return inicial;
    }

    public void setInicial(int inicial){
        this.inicial = inicial;
    }

    @Override
    public String toString() {
        return "Conta Bancária:" +
                "\nNúmero da Conta: " + numConta +
                "\nNome do Titular: " + nomeTitular +
                "\nSaldo: " + saldo + " reais\n";
    }
}
