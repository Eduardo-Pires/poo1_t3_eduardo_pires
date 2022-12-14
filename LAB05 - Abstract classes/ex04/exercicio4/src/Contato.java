public abstract class Contato
{
    private String apelido;
    private String nome;
    private String email;
    private String aniversario;

    public Contato(String apelido, String nome, String email, String aniversario) {
        this.apelido = apelido;
        this.nome = nome;
        this.email = email;
        this.aniversario = aniversario;
    }

    public void imprimirBasico()
    {
        System.out.println(
                "apelido = " + apelido + '\n' +
                "nome = " + nome + '\n' +
                "email = " + email + '\n' +
                "aniversario = " + aniversario
                );
    }

     abstract public void imprimirContato();
}
