package dominio;

public class ProdutoUsado extends Produto{
    private String dataFabricacao;
    
    public ProdutoUsado(){}
    public ProdutoUsado(String nome, double preco, String data){
        super(nome, preco);
        this.dataFabricacao = data;
    }
    
    @Override
    public void imprimir(){
        System.out.println(getNome() +" (usado), R$"+getPreco()
                +" (data de fabricação: "+getDataFabricacao()+")");
    }

    /**
     * @return the dataFabricacao
     */
    public String getDataFabricacao() {
        return dataFabricacao;
    }

    /**
     * @param dataFabricacao the dataFabricacao to set
     */
    public void setDataFabricacao(String dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }
    
    
}
