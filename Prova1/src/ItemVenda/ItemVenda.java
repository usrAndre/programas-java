/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ItemVenda;

import Produto.*;

/**
 *
 * @author Fernanda
 */
public class ItemVenda {
    private int quant;
    Produto produtoVenda;
    
    public ItemVenda(int pQuant, Produto pProdutoVenda) {
        setQuant(pQuant);
        setProdutoVenda(pProdutoVenda);
    }

   /* public ItemVenda(int i, Produto p1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/
    
    public void setQuant(int pQuant) {
        quant = pQuant;
    }
    
    public void setProdutoVenda(Produto pProdutoVenda) {
        produtoVenda = pProdutoVenda;
    }
    
    public float getValorItemVenda() {
        return getProdutoVenda().getPrecoReal()*quant;
    }
    
    public int getQuant() {
        return quant;
    }
    
    /**
     *
     * @return
     */
    public Produto getProdutoVenda() {
        return produtoVenda;
    }
}
