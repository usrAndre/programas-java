/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Turma;

import Aluno.Aluno;
import Disciplina.Disciplina;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class Turma implements Serializable{
    private String disc;
    private ArrayList<Aluno> alunos=new ArrayList<>();
    public Turma(String pDisc){
        
       disc=pDisc;
    }
   
    /**
     * @return the disc
     */
    public String getDisc() {
        return disc;
    }

    /**
     * @param disc the disc to set
     */
    public void setDisc(String disc) {
        this.disc = disc;
    }

    /**
     * @return the alunos
     */
    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    /**
     * @param alunos the alunos to set
     */
    public void setAlunos(Aluno aluno) {
        this.alunos.add(aluno);
    }
}
