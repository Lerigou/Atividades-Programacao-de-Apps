package exercicioherança;

import dominio.Produto;
import dominio.ProdutoImportado;
import dominio.ProdutoUsado;

public class ExercicioHerança {

    public static void main(String[] args) {
        
        Produto p = new Produto("TV", 9000);
        p.imprimir();
        
        ProdutoImportado pi = new ProdutoImportado("Notebook",1000, 200);
        pi.imprimir();
        
        ProdutoUsado pu = new ProdutoUsado("Iphone", 3000, "12/04/2010");
        pu.imprimir();
    } 
}
