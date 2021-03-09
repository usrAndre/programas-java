package funcionario;


public class Professor extends Funcionario {

    private String aTitulacao;
    private double aSalarioHora;
    private int aNroAula;

    public Professor(int pCodigo, String pNome, String pTitulacao, double pSalarioHora, int pNroAula) {
        super(pCodigo, pNome);
        aTitulacao = pTitulacao;
        aSalarioHora = pSalarioHora;
        aNroAula = pNroAula;
    }

    public int getNrAula() {
        return aNroAula;
    }

    public double getSalarioHora() {
        return aSalarioHora;
    }

    public String getTitulacao() {
        return aTitulacao;
    }

    public double calculoSalario(int pMes, int pAno) {
        double salario = aSalarioHora * aNroAula;
        for (int i = 0; i < getPontoMensal().size(); i++) {
            PontoFunc pf = getPontoMensal().elementAt(i);
            if (pf.getAno() == pAno && pf.getMes() == pMes) {
                salario -= (pf.getNroFaltas() * aSalarioHora);
                salario += (calculoBonus(pMes, pAno)) * salario;
                System.out.println((calculoBonus(pMes, pAno)));
                break;
            }


        }
        return salario;
    }

    public double calculoBonus(int pMes, int pAno) {
       
        for (int i = 0; i < getPontoMensal().size(); i++) {
            PontoFunc pf = getPontoMensal().elementAt(i);
            if (pf.getAno() == pAno && pf.getMes() == pMes) {
                if (pf.getNroAtrasos() < 10){
                    double bonus = pf.getNroAtrasos();
                    return bonus/100;

                }
                break;

            }
        }
        return 0;
    }
}
