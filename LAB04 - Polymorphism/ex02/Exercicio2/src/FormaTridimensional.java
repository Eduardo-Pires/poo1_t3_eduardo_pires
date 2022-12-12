public abstract class FormaTridimensional extends Forma
{
    @Override
    public double obterArea() {
        return this.area;
    }

    @Override
    public double obterVolume() {
        return this.volume;
    }

    @Override
    void imprimeForma() {
        System.out.println("Area = " + String.format("%.2f", obterArea()));
        System.out.println("Volume = " + String.format("%.2f", obterVolume()));
        System.out.println();
    }
}
