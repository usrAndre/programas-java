package funcionario;

public class TecAdmin extends Funcionario {

    private String aFuncao;
    private double aSalarioMensal;

    public TecAdmin(int pCodigo, String pNome, String pFuncao, double pSalarioMensal) {
        super(pCodigo, pNome);
        aFuncao = pFuncao;
        aSalarioMensal = pSalarioMensal;

    }

    public String getFuncao() {
        return aFuncao;
    }

    public double getSalarioMensal() {
        return aSalarioMensal;
    }

    public double calculoBonus(int pMes, int pAno) {
        for (int i = 0; i < getPontoMensal().size(); i++) {
            PontoFunc pf = getPontoMensal().elementAt(i);
            if (pf.getAno() == pAno && pf.getMes() == pMes) {
                if (pf.getNroAtrasos() < 8) {
                    double bonus = pf.getNroAtrasos();
                    return bonus/100;
                }
            }
            break;
        }
        return 0;
    }

    public double calculoSalario(int pMes, int pAno) {
        double salario = aSalarioMensal;
        for (int i = 0; i < getPontoMensal().size(); i++) {
            PontoFunc pf = getPontoMensal().elementAt(i);
            if (pf.getAno() == pAno && pf.getMes() == pMes) {
                salario -= (aSalarioMensal / 30) * pf.getNroFaltas();
                salario += calculoBonus(pMes, pAno) * salario;
            
                break;
            }
        }
        return salario;
    }
}
