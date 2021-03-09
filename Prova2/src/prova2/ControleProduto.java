/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package prova2;

import java.util.*;

/**
 *
 * @author Fernanda
 */
public class ControleProduto {
    private Vector listaProduto = new Vector();
    private LimiteProduto objCLimiteProd;

    public ControleProduto() throws Exception {
        objCLimiteProd = new LimiteProduto(this);
    }
    
    public void insereProduto(int pCodigo, String pDescricao, float pPreco, float pDesconto) throws Exception {
        Produto prod = new Produto(pCodigo, pDescricao, pPreco, pDesconto);
        listaProduto.add(prod);
    }
    
    public void removeProduto(int pCodigo) {
	    for (int intIdx = 0; intIdx < listaProduto.size();
		 intIdx++) {
	        Produto rem = (Produto)listaProduto.elementAt(intIdx); 
  	        if (rem.getCodigo()==pCodigo) {
                    listaProduto.remove(intIdx);
                }
            }
            
        }
    
    public String imprimeProdutos() {
        String result = "";
        for (int intIdx = 0; intIdx < listaProduto.size();
                intIdx++) {
            Produto objLProd
                    = (Produto) listaProduto.elementAt(intIdx);
            result += "Codigo: " + objLProd.getCodigo()
                    + "\nDescrição: " + objLProd.getDescricao() 
                    + "\nPreço: " + objLProd.getPreco()
                    + "\nDesconto: " + objLProd.getDesconto();
        }
        return result;
    }

    
public String imprimeProduto(int pCodigo) {
	    for (int intIdx = 0; intIdx < listaProduto.size();
		 intIdx++) {
	        Produto objLProd =
		              (Produto)listaProduto.elementAt(intIdx); 
  	        if (objLProd.getCodigo() == pCodigo) {
	    	return "Codigo: " + objLProd.getCodigo()
                    + "\nDescrição: " + objLProd.getDescricao() 
                    + "\nPreço: " + objLProd.getPreco()
                    + "\nDesconto: " + objLProd.getDesconto();
	       }
	    }
	    return "";
	}

    public String alteraProduto(int pCodigo, float pPreco, float pDesconto) throws Exception{
	    for (int intIdx = 0; intIdx < listaProduto.size();
		 intIdx++) {
	        Produto objLProd =
		              (Produto)listaProduto.elementAt(intIdx); 
  	        if (objLProd.getCodigo() == pCodigo) {  
                objLProd.setPreco(pPreco);
                objLProd.setDesconto(pDesconto);
                        return "Produto alterado";
	       }
	    }
	    return "";
    }

public static void main(String args[]) throws Exception {
	  	new ControleProduto();
	}


}
