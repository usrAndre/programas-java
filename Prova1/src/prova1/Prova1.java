/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package prova1;

import java.util.*;
import ItemVenda.*;
import Produto.*;
import Venda.*;
/**
 *
 * @author Fernanda
 */
public class Prova1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        Produto p1 = new Produto (100, "Calca jeans masculina Levis", 150, 5);
        Produto p2 = new Produto (101, "Camiseta masculina hering", 45, 7);
        Produto p3 = new Produto (102, "Calca jeans feminina Forum", 160, 10);
        ItemVenda iv1 = new ItemVenda(10, p1);
        ItemVenda iv2 = new ItemVenda(15,p2);
        ItemVenda iv3 = new ItemVenda(8,p3);
        Venda v = new Venda(1000, "Martins S/A", new Date());
        v.insereItemVenda(iv1);
        v.insereItemVenda(iv2);
        v.insereItemVenda(iv3);
        v.imprimeVenda();
    }
    
}
