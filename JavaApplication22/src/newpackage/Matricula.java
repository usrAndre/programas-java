/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author user
 */
import Aluno.Aluno;
import Disciplina.*;
import Turma.Turma;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class Matricula extends JFrame implements ActionListener{

    JTextField text;
    JTextField text2;
    JComboBox jcb;
    static Vector cadastro = new Vector();
    static Vector vetDisciplina=new Vector();
    
    
    public Matricula() {
        super();
    }
    


    public void addComponent() {
        JLabel lbl = new JLabel("Nome");
        JLabel lbl2 = new JLabel("Matricula");
        String[] str1 = { "COM220", "COM221", "COM212" };
		
        
        text = new JTextField(20);
        text2 = new JTextField(20);
        jcb=new JComboBox(str1);
        JPanel painel = new JPanel();
        text.addActionListener(this);
        text2.addActionListener(this);
        painel.add(lbl, 0);
        painel.add(text, 1);
        painel.add(lbl2, 2);
        painel.add(text2, 3);
        painel.add(jcb);
        jcb.getName();
        this.add(painel);
        this.setVisible(true);
        this.pack();
    }

    public static void main(String[] args) throws Exception {
        ArrayList<Aluno> alunos = new ArrayList<>();
        ArrayList<Disciplina> disciplinas = new ArrayList<>();
        File objFile = new File("cadastro.dat");
        if (objFile.exists()) {
            FileInputStream objFileIS = new FileInputStream("cadastro.dat");
            ObjectInputStream objIS = new ObjectInputStream(objFileIS);
            cadastro = (Vector) objIS.readObject();
            objIS.close();
        }
        alunos.add(new Aluno("lucas", "21649"));
        alunos.add(new Aluno("Fer", "24138"));
        disciplinas.add(new Disciplina("COM220", "Programacao Orientaa a objetos", "materia dificil"));
        disciplinas.add(new Disciplina("COM221", "Programacao Orientaa a objetos II", "materia dificil"));
        disciplinas.add(new Disciplina("COM212", "Gerencia de Projetos", "materia dificil"));
//        for (int i = 0; i < alunos.size(); i++) {
  //          cadastro.add(alunos.get(i));
  //      }
        
       
        Matricula user = new Matricula();
        user.addComponent();
        FileOutputStream objFileOS = new FileOutputStream("cadastro.dat");
        ObjectOutputStream objOS = new ObjectOutputStream(objFileOS);
        objOS.writeObject(cadastro);
        objOS.flush();
        objOS.close();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String[] tempLogin = {(String) text.getText(), (String) text2.getText()};
        for (int i = 0; i < cadastro.size(); i++) {
            String temp = ((Aluno) cadastro.get(i)).getNome();
            String temp2 = ((Aluno) cadastro.get(i)).getMatricula();

            if (tempLogin[0].equals(temp) && (tempLogin[1].equals(temp2))) {
                JOptionPane.showMessageDialog(null, "Aluno Matriculado",null,  JOptionPane.INFORMATION_MESSAGE);
                return;
            }

        }
        Aluno aluno = new Aluno((String) text.getText(),(String) text2.getText());
        cadastro.add(aluno);
        for(int i=0;i<cadastro.size();i++){
           System.out.println("Nome: "+((Aluno)cadastro.elementAt(i)).getNome() +" Matricula: "+((Aluno)cadastro.elementAt(i)).getMatricula() +" Escolha: "+(String)jcb.getSelectedItem());
        }
    }
}

