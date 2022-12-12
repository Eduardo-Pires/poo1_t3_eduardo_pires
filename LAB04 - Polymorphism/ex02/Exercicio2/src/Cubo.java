public class Cubo extends FormaTridimensional
{
    private double lado;

    public Cubo(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double obterArea() {
        return 6 * Math.pow(lado, 2);
    }

    @Override
    public double obterVolume() {
        return Math.pow(lado, 3);
    }

    @Override
    void imprimeForma() {
        System.out.println("Cubo");
        super.imprimeForma();
    }
}
