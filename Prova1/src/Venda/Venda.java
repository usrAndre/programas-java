/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Venda;

import java.util.*;
import ItemVenda.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Fernanda
 */
public class Venda {
    private int nroNF;
    private String nomeCliente;
    private Date data;
    ArrayList<ItemVenda> itensVenda = new ArrayList<>();
    
    public Venda(int pNroNF, String pNomeCliente, Date pData){
        setNroNF(pNroNF);
        setNomeCliente(pNomeCliente);
        setData(pData);
    }

   /* public Venda(int i, String martins_SA, Date date) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/
    
    public void setNroNF(int pNroNF) {
        nroNF = pNroNF;
    }
    
    public void setNomeCliente(String pNomeCliente) {
        nomeCliente = pNomeCliente;
    }
    
    public void setData(Date pData) {
        data = pData;
    }
    
    public void setItensVenda(ArrayList pItensVenda) {
        itensVenda = pItensVenda;
    }
        
    public int getNroNF() {
        return nroNF;
    }
    
    public String getNomeCliente() {
        return nomeCliente;
    }
    
    public Date getData() {
        return data;
    }
    
    public ArrayList getItensVenda() {
        return itensVenda;
    }
    
    public void insereItemVenda(ItemVenda itemVenda){
        itensVenda.add(itemVenda);
    }

   public void imprimeVenda(){
       float soma=0;
       String saida = ""; 
        saida+=     "Numero da nota fiscal: "+getNroNF() 
                    +"\nNome do cliente: "+getNomeCliente()
                    +"\nData da venda: "+getData()
                    +"\n"
                    +"\nQuant. -- Descrição -- PrecoUnit -- PrecoTotal\n";
        for (int i = 0; i < itensVenda.size(); i++) { 
            saida+= itensVenda.get(i).getQuant()
                    +" -- "+itensVenda.get(i).getProdutoVenda().getDescricao()
                    +" -- "+itensVenda.get(i).getProdutoVenda().getPrecoReal()
                    +" -- "+itensVenda.get(i).getValorItemVenda()
                    +"\n"; 
            soma=soma+itensVenda.get(i).getValorItemVenda();
        }  
        saida+= "\nValor total: "+soma;
        JOptionPane.showMessageDialog(null, saida, "Nota fiscal de venda", JOptionPane.INFORMATION_MESSAGE);
    }
}
