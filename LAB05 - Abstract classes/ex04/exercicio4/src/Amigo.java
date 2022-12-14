public class Amigo extends Contato{

    private int grau;

    public Amigo(String apelido, String nome, String email, String aniversario, int grau) {
        super(apelido, nome, email, aniversario);
        this.grau = grau;
    }

    public int getGrau() {
        return grau;
    }

    public void setGrau(int grau) {
        this.grau = grau;
    }

    private String grauToString()
    {
        if (grau == 1)
        {
            return "melhor amigo";
        }
        else if (grau == 2)
        {
            return "amigo";
        }
        else if (grau == 3)
        {
            return "conhecido";
        }
        else
        {
            return "invalido";
        }
    }

    @Override
    public void imprimirContato() {
        imprimirBasico();
        System.out.println("grau = (" + grau + ')' + grauToString() +  '\n');
    }
}
