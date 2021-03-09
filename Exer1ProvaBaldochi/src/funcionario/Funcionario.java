package funcionario;

import java.util.Vector;

public abstract class Funcionario {

    private int aCodigo;
    private String aNome;
    private Vector <PontoFunc> aPontoMensal;

    public Funcionario(int pCodigo, String pNome) {
        aCodigo = pCodigo;
        aNome = pNome;
        aPontoMensal = new Vector<PontoFunc>();
    }

    public int getCodigo() {
        return aCodigo;
    }

    public String getNome() {
        return aNome;
    }

    public Vector<PontoFunc> getPontoMensal() {
        return aPontoMensal;
    }

 

    public void lancaFalta(int pMes, int pAno, int pFalta) {
        for (int i = 0; i < aPontoMensal.size(); i++) {
            PontoFunc pf = aPontoMensal.elementAt(i);
            if (pf.getMes() == pMes && pf.getAno() == pAno) {
                aPontoMensal.elementAt(i).lancaFalta(pFalta);
            }
        }
    }

    public void lancaAtraso(int pMes, int pAno, int pAtraso) {
        for (int i = 0; i < aPontoMensal.size(); i++) {
            PontoFunc pf = aPontoMensal.elementAt(i);
            if (pf.getMes() == pMes && pf.getAno() == pAno) {
                aPontoMensal.elementAt(i).lancaAtraso(pAtraso);
            }
        }
    }
    public String imprimeFolha(int pMes, int pAno){
        for (int i=0; i< aPontoMensal.size(); i++){
        PontoFunc pf = aPontoMensal.elementAt(i);
        if (pf.getMes() == pMes && pf.getAno() == pAno) {
            String retorno = "Código: "+ getCodigo()
                             +"Ponto do Mês: "+ pMes+ "/"+pAno
                             +"\nNome: "+ getNome()
                             +"\nNumero de Faltas: "+pf.getNroFaltas()
                             +"\nNumero de Atrasos: "+pf.getNroAtrasos()
                             +"\nSalario: "+ calculoSalario(pMes, pAno)
                             +"\n======================";
            
            return retorno;
          
        }
        
        }
    return "Ponto não encontrado";
    
    }
       public void adicionaPonto(int pMes, int pAno) {
        PontoFunc pf = new PontoFunc(pMes, pAno);
        aPontoMensal.add(pf);
    }
    public abstract double calculoSalario(int pMes,int pAno);
    
    public abstract double calculoBonus(int pMes,int pAno);
}
