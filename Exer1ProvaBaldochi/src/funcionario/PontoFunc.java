package funcionario;

public class PontoFunc {
    private int aMes;
    private int aAno;
    private int aNroFaltas;
    private int aNroAtrasos;
    
    public PontoFunc(int pMes, int pAno){
        aMes = pMes;
        aAno = pAno;
    }
    
    public PontoFunc(int pMes, int pAno, int pNroFaltas, int pNroAtrasos){
        aMes = pMes;
        aAno = pAno;
        aNroFaltas = pNroFaltas;
        aNroAtrasos = pNroAtrasos;
    }
     
    public void lancaAtraso(int pNroAtrasos){
         aNroAtrasos = pNroAtrasos;
     }
     
     public void lancaFalta(int pNroFaltas){
         aNroFaltas = pNroFaltas;
     }
     
     public int getMes(){ return aMes;}
     
     public int getAno(){ return aAno;}
     
     public int getNroFaltas(){ return aNroFaltas;}
     
     public int getNroAtrasos(){ return aNroAtrasos;}
}
