/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Disciplina;

import java.io.Serializable;

/**
 *
 * @author user
 */
public class Disciplina implements Serializable{
    private String sigla;
    private String nome;
    private String descricao;
    public Disciplina(){
        
    }
    public Disciplina(String pSigla,String pNome,String pDescricao){
        sigla=pSigla;
        nome=pNome;
        descricao=pDescricao;
    }

    
    /**
     * @return the sigla
     */
    public String getCodigo() {
        return sigla;
    }

    /**
     * @param sigla the sigla to set
     */
    public void setCodigo(String sigla) {
        this.sigla = sigla;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
}
