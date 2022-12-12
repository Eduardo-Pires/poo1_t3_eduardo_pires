public class Tetraedro extends FormaTridimensional
{
    private double lado;
    private double areaBase;
    private double altura;

    public Tetraedro(double lado, double areaBase, double altura) {
        this.lado = lado;
        this.areaBase = areaBase;
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAreaBase() {
        return areaBase;
    }

    public void setAreaBase(double areaBase) {
        this.areaBase = areaBase;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double obterArea() {
        return Math.pow(lado, 2) * Math.sqrt(3);
    }

    @Override
    public double obterVolume() {
        return (((double)1/3) * areaBase) * altura;
    }

    @Override
    void imprimeForma() {
        System.out.println("Tetraedro");
        super.imprimeForma();
    }
}
