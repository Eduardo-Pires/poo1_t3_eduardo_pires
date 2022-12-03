public class CamaroteInferior extends VIP
{
    private String localIngresso;

    public CamaroteInferior(float valorBase, float adicional, String localIngresso)
    {
        super(valorBase);
        this.localIngresso = localIngresso;
    }

    public void imprimeLocalIngresso()
    {
        System.out.println("Localização do ingresso: " + localIngresso);
    }

    public String getLocalIngresso()
    {
        return localIngresso;
    }

    public void setLocalIngresso(String localIngresso)
    {
        this.localIngresso = localIngresso;
    }
}
