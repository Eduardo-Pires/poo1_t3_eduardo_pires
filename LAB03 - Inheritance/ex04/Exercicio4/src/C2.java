public class C2 extends C1
{
    public String comum;
    protected String reservado;
    private String guardado;

    public C2()
    {
        System.out.println("Classe C2: chamada do construtor padrao, sem parametros");
    }

    public C2(String comum, String reservado, String guardado)
    {
        System.out.println(  "Classe C2: chamada do construtor com parametros");

        this.comum = comum;
        this.reservado = reservado;
        this.guardado = guardado;

    }

    public String getGuardado() {
        return guardado;
    }

    @Override
    public void mostrar_atributos() {
        System.out.println("C2{" +
                "comum='" + comum + '\'' +
                ", reservado='" + reservado + '\'' +
                ", guardado='" + guardado + '\'' +
                ", publico='" + publico + '\'' +
                ", protegido='" + protegido + '\'' +
                ", privado='" + getPrivado() + '\'' +
                '}');
    }

    public void mostrar_atributos_super()
    {
        super.mostrar_atributos();
        System.out.println("C2{" +
                "comum='" + comum + '\'' +
                ", reservado='" + reservado + '\'' +
                ", guardado='" + guardado + '\'' +
                '}');
    }
}
