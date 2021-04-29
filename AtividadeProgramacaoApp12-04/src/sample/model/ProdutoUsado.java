package sample.model;

public class ProdutoUsado extends Produto{

    //atributos
    private String data;

    public ProdutoUsado(){

    }

    public ProdutoUsado(String nome, double preco, String data){
        super(nome, preco);
        this.data = data;
    }

    //get e set
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    //to string
    @Override
    public String toString() {
        return getNome() + " (Usado), R$:" + getPreco() + "\nData de fabricação: " + getData();
    }
}
