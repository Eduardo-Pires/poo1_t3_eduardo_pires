public class Circulo extends FormaBidimensional
{
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio()
    {
        return raio;
    }

    public void setRaio(float raio)
    {
        this.raio = raio;
    }

    @Override
    public double obterArea()
    {
        return Math.PI * Math.pow(raio, 2);
    }

    @Override
    void imprimeForma() {
        System.out.println("Círculo");
        super.imprimeForma();
    }
}
