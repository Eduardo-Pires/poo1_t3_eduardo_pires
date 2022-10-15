import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Produto item = new Produto();
        Scanner scanf = new Scanner(System.in);

        for(int i = 0; i < 4; i++)
        {
            System.out.printf("\nInforme o nome, o preco e a qtd. em estoque do produto %d:\n", i+1);
            item.nome[i] = scanf.nextLine();
            item.preco[i] = scanf.nextFloat();
            item.qtd_estoque[i] = scanf.nextInt();

            scanf.nextLine();
        }

        System.out.printf("\nAumentando o preco em 10%% do produto 1 e 3");
        item.altera_preco(item.preco[0], -110);
        item.altera_preco(item.preco[2], 10);

        System.out.printf("\nReduzindo o preco em 5%% do produto 2");

        if(item.altera_preco(item.preco[1], -5) == false)
        {
            System.out.printf("\nErro: preco nao alterado. Porcentagem invalida");
        }
        else
        {
            System.out.printf("\nPreco alterado com sucesso");
        }

        System.out.printf("\n\nAlterando o preco do prod. 3");
        if (item.altera_preco(item.preco[3],-110) == false)
        {
            System.out.printf("\nErro: preco nao alterado. Porcentagem invalida\n");
        }

        System.out.printf("\nProdutos Cadastrados:");
        for (int i = 0; i < 4; i++){
            System.out.printf("\nProduto: %s\nPreco: %f\nEstoque: %d\n", item.nome[i],item.preco[i],item.qtd_estoque[i]);
        }

    }
}