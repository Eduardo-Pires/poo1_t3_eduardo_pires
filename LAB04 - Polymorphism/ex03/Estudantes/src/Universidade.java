import java.time.LocalDate;

public class Universidade {
    private String nomeUniversidade;
    private LocalDate dataFundacao;
    private EstudanteDoutorado[] dtr;
    private EstudanteGraduacao[] grd;
    private EstudanteMestrado[] mst;

    public Universidade(String nomeUniversidade, LocalDate dataFundacao, EstudanteDoutorado[] dtr, EstudanteGraduacao[] grd, EstudanteMestrado[] mst) {
        if(getNumEstudantes() > 100)
        {
            System.out.println("Erro, quantidade invalida de estudantes, universidade não criada.");
        }
        else
        {
            this.nomeUniversidade = nomeUniversidade;
            this.dataFundacao = dataFundacao;
            this.dtr = dtr;
            this.grd = grd;
            this.mst = mst;
        }
    }

    public String getNomeUniversidade() {
        return nomeUniversidade;
    }

    public void setNomeUniversidade(String nomeUniversidade) {
        this.nomeUniversidade = nomeUniversidade;
    }

    public LocalDate getDataFundacao() {
        return dataFundacao;
    }

    public void setDataFundacao(LocalDate dataFundacao) {
        this.dataFundacao = dataFundacao;
    }

    public EstudanteDoutorado[] getDtr() {
        return dtr;
    }

    public void setDtr(EstudanteDoutorado[] dtr) {
        this.dtr = dtr;
    }

    public EstudanteGraduacao[] getGrd() {
        return grd;
    }

    public void setGrd(EstudanteGraduacao[] grd) {
        this.grd = grd;
    }

    public EstudanteMestrado[] getMst() {
        return mst;
    }

    public void setMst(EstudanteMestrado[] mst) {
        this.mst = mst;
    }

    public int getNumEstudantes()
    {
        return grd.length + dtr.length + dtr.length;
    }
}
