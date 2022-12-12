public class Quadrado extends FormaBidimensional
{
    public double lado;

    public Quadrado(double lado) {
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
        return Math.pow(lado,2);
    }

    @Override
    void imprimeForma() {
        System.out.println("Quadrado");
        super.imprimeForma();
    }
}
