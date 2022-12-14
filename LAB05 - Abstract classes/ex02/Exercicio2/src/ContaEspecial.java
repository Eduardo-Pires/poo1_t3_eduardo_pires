public class ContaEspecial extends ContaCorrente
{
    private float limite;
    public ContaEspecial(float val, int num, int pwd, float limite)
    {
        super(val, num, pwd);
        this.limite = limite;
    }



}
