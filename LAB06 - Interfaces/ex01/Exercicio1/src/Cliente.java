public class Cliente implements Classificavel
{
    private String nome;

    public Cliente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean eMenorQue(Classificavel o) {
        Cliente compara = (Cliente) o;
        int numComp = this.nome.compareTo(compara.nome);
        return numComp < 0;
    }
}
