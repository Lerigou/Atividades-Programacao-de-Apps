package sample.model;

public class Produto {

    //Atributos
    public String nome;
    public double preco;
    public int quantidade;

    public double valorTotalEmEstoque(){
        return preco * quantidade;
    }

    public void adicionarProdutos(int qtd){
        quantidade += qtd;
    }

    public void removerProdutos(int qtd){
        quantidade -=qtd;
    }

    public String imprimir() {
        return "Nome: " + nome +
                ", R$" + preco +
                ", quantidade:" + quantidade + " " +
                valorTotalEmEstoque();
    }

}
