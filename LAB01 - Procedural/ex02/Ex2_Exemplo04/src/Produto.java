

public class Produto {

    public String[] nome = new String[100];
    public float[] preco = new float[4];
    public int[] qtd_estoque = new int[4];

    public boolean altera_preco(float preco, float porcentagem)
    {
        float temp;

        if(porcentagem > -100)
        {
            temp = 1 + porcentagem/100;
            //O this.preco não funciona e sem ele o código roda, porém não troca o preço
            this.preco = preco * temp;
            return true;
        }
        else
        {
            return false;
        }
    }
}
