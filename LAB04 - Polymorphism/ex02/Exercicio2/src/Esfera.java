public class Esfera extends FormaTridimensional
{
    private double raio;

    public Esfera(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double obterArea() {
        return 4*(Math.PI * Math.pow(raio, 2));
    }

    @Override
    public double obterVolume() {
        return ((double) 4/3)* Math.PI * Math.pow(raio, 3);
    }

    @Override
    void imprimeForma() {
        System.out.println("Esfera");
        super.imprimeForma();
    }
}
