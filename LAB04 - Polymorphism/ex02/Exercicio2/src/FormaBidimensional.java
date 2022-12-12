public abstract class FormaBidimensional extends Forma
{
    @Override
    public double obterArea() {
        return this.area;
    }

    void imprimeForma() {
        System.out.println("Area = " + String.format("%.2f", obterArea()));
        System.out.println();
    }
}
