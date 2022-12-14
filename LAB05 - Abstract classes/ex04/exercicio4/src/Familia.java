public class Familia extends Contato{

   private String parentesco;

    public Familia(String apelido, String nome, String email, String aniversario, String parentesco) {
        super(apelido, nome, email, aniversario);
        this.parentesco = parentesco;
    }

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    @Override
    public void imprimirContato() {
        imprimirBasico();
        System.out.println("parentesco = " + parentesco + '\n');
    }
}
