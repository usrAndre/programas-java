/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Produto;

import java.util.*;

/**
 *
 * @author Fernanda
 */
public class Produto {

    private int codigo;
    private String descricao;
    private float preco;
    private float desconto;

    public Produto(int pCodigo, String pDescricao, float pPreco, float pDesconto) throws Exception{
        setCodigo(pCodigo);
        setDescricao(pDescricao);
        setPreco(pPreco);
        setDesconto(pDesconto);
    }


    public void setCodigo(int pCodigo) {
        codigo = pCodigo;
    }

    public void setDescricao(String pDescricao) {
        descricao = pDescricao;
    }

    public void setPreco(float pPreco) {
        preco = pPreco;
    }

    public void setDesconto(float pDesconto) throws Exception{
        if(pDesconto > 20){
            throw new Exception("Desconto invalido");
        }
        desconto = pDesconto;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public float getPreco() {
        return preco;
    }

    public float getDesconto() {
        return desconto;
    }
    
    public float getPrecoReal(){
        float r;
        r = (desconto*preco)/100;
        return preco-r;
    }
}
