

public class Produto {

    String nome;
    float preco;
    int qtd_estoque;

    public boolean altera_preco(float preco, float porcentagem)
    {
        float temp;

        if(porcentagem > -100)
        {
            temp = 1 + porcentagem/100;
            this.preco = preco * temp;
            return true;
        }
        else
        {
            return false;
        }
    }
}
