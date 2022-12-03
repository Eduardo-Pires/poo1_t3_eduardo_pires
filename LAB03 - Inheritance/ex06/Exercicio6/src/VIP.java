public class VIP extends Ingresso
{
    private float adicional;
    protected float valorFinal;

    public VIP(float valor)
    {
        super(valor);
    }
    public VIP(float valorBase, float adicional)
    {
        super(valorBase);
        this.valorFinal = valorBase + adicional;
        this.adicional = adicional;
    }

    public void calculaValorVIP()
    {
        valorFinal = getValor() + adicional;
    }


    public float getAdicional()
    {
        return adicional;
    }

    public void setAdicional(float adicional)
    {
        this.adicional = adicional;
    }
}
