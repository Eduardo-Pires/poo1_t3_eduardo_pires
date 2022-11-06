public class Selecao {
    private String nomeSelecao;
    private String nometecnico;
    Figurinha[] titular = new Figurinha[11];

    public Selecao(String nomeSelecao, String nometecnico, Figurinha[] titular)
    {
        this.nomeSelecao = nomeSelecao;
        this.nometecnico = nometecnico;
        this.titular = titular;
    }

    public void setTeamName(String nomeSelecao)
    {
        this.nomeSelecao = nomeSelecao;
    }

    public void setCoachName(String nometecnico)
    {
        this.nometecnico = nometecnico;
    }

    public void setTeamOwners(Figurinha[] titular)
    {
        this.titular = titular;
    }
}
