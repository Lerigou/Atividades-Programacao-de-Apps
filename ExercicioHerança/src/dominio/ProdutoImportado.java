package dominio;

public class ProdutoImportado extends Produto{

    private double taxa;
    
    //construtor
    public ProdutoImportado(){};
    public ProdutoImportado(String nome, double preco, double taxa) {
        super(nome, preco);
        this.taxa = taxa;
    }
    
    public double totalPreco(double valor){
        return getPreco() + valor;
    }
    
    @Override
    public void imprimir(){
        System.out.println(getNome() +", R$"+(getPreco()+getTaxa())
                + " (taxa aduaneira: R$ "+getTaxa()+")");
    }

    /**
     * @return the taxa
     */
    public double getTaxa() {
        return taxa;
    }

    /**
     * @param taxa the taxa to set
     */
    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }
    
    
}
