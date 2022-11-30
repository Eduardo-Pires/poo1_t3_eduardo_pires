public class C3 extends C2
{
    public String livre;
    protected String resguardado;
    private String particular;

    public C3()
    {
        System.out.println("Classe C3: chamada do construtor padrao, sem parametros");

    }

    public C3(String livre, String resguardado, String particular)
    {
        System.out.println(  "Classe C3: chamada do construtor com parametros");

        this.livre = livre;
        this.resguardado = resguardado;
        this.particular = particular;
    }

    public C3(String comum, String reservado, String guardado, String livre, String resguardado, String particular)
    {
        super(comum, reservado, guardado);

        this.livre = livre;
        this.resguardado = resguardado;
        this.particular = particular;
    }

    @Override
    public void mostrar_atributos() {
        System.out.println("C3{" +
                "livre='" + livre + '\'' +
                ", resguardado='" + resguardado + '\'' +
                ", particular='" + particular + '\'' +
                ", comum='" + comum + '\'' +
                ", reservado='" + reservado + '\'' +
                ", guardado='" + getGuardado() + '\'' +
                ", publico='" + publico + '\'' +
                ", protegido='" + protegido + '\'' +
                ", privado='" + getPrivado() + '\'' +
                '}');
    }


    @Override
    public void mostrar_atributos_super() {
        super.mostrar_atributos();
        System.out.println("C3{" +
                "livre='" + livre + '\'' +
                ", resguardado='" + resguardado + '\'' +
                ", particular='" + particular + '\'' +
                '}');
    }
}
