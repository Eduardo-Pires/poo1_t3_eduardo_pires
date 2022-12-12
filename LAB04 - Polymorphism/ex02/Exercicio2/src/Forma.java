
public abstract class Forma
{
    protected double area;
    protected double volume;

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double obterArea()
    {
        return area;
    }
    public double obterVolume()
    {
        return volume;
    }

    abstract void imprimeForma();

}
