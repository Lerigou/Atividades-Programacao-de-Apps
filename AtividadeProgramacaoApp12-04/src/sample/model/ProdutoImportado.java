package sample.model;

public class ProdutoImportado extends Produto{

    //atributos
    private double taxa;

    //construtor
    public ProdutoImportado(){

    }

    public ProdutoImportado(String nome, double preco, double taxa){
        super(nome, preco);
        this.taxa = taxa;
    }

    public double totalPreco(){
        return getPreco() + getTaxa();
    }

    //get e set
    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }

    @Override
    public String toString() {
        return getNome() + ", R$ " + totalPreco() + " Taxa: R$" + getTaxa();
    }
}
