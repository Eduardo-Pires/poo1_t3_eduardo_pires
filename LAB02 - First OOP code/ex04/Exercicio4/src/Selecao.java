public class Selecao {
    private String nomeSelecao;
    private String nometecnico;
    private String[] titular = new String[11];

    public void setTeamName(String nomeSelecao)
    {
        this.nomeSelecao = nomeSelecao;
    }
    public void setCoachName(String nometecnico)
    {
        this.nometecnico = nometecnico;
    }

    public void setTeamOwners(String[] titular)
    {
        this.titular = titular;
    }
}
