public class Trabalho extends Contato
{
    private String tipo;

    public Trabalho(String apelido, String nome, String email, String aniversario, String tipo) {
        super(apelido, nome, email, aniversario);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public void imprimirContato() {
        imprimirBasico();
        System.out.println("tipo= " + tipo + '\n');
    }
}
