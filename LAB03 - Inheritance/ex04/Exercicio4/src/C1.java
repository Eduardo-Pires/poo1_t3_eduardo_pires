public class C1
{
    public String publico;
    protected String protegido;
    private String privado;

    public C1()
    {
        System.out.println("Classe C1: chamada do construtor padrao, sem parametros");

    }

    public C1(String publico, String protegido, String privado)
    {
        System.out.println(  "Classe C1: chamada do construtor com parametros");

        this.publico = publico;
        this.privado = privado;
        this.protegido = protegido;
    }

    public String getPrivado() {
        return privado;
    }

    public void mostrar_atributos()
    {
        System.out.println
                (
                    "publico='" + publico + '\'' +
                    "\nprotegido='" + protegido + '\'' +
                    "\nprivado='" + privado + '\''
                );
    }
}
