import java.util.Scanner;

public class Main
{
    public static boolean altera_preco(float preco, float porcentagem)
    {
       float temp;

       if(porcentagem > -100)
       {
           temp = 1 + porcentagem/100;
           preco = preco*temp;

           return true;
       }
       else
       {
           return false;
       }
    }

    public static void main(String[] args)
    {
        String[] nome = new String[100];
        float[] preco = new float[4];
        int[] qtd_estoque = new int[4];

        Scanner scanf = new Scanner(System.in);

        for(int i = 0; i < 4; i++)
        {
            System.out.printf("\nInforme o nome, o preco e a qtd. em estoque do produto 1:\n");
            nome[i] = scanf.nextLine();
            preco[i] = scanf.nextFloat();
            qtd_estoque[i] = scanf.nextInt();
        }

        System.out.printf("\nAumentando o preco em 10%% do produto 1 e 3");
        altera_preco(preco[0], -110);
        altera_preco(preco[2], 10);

        System.out.printf("\nReduzindo o preco em 5%% do produto 2");

        if(altera_preco(preco[1], -5))
        {
            System.out.printf("\n\nErro: preco nao alterado. Porcentagem invalida\n");
        }
        else
        {
            System.out.printf("\n\n Preco alterado com sucesso");
        }

        System.out.printf("\nAlterando o preco do prod. 3");

        System.out.printf("\nAlterando o preco do prod. 3");
        if (altera_preco(preco[3],-110) == false)
        {
            System.out.printf("\n\nErro: preco nao alterado. Porcentagem invalida\n");
        }

        System.out.printf("\nProdutos Cadastrados:\n");
        for (int i = 0; i < 4; i++){
            System.out.printf("\nProduto: %s\nPreco: %f\nEstoque: %d", nome[i],preco[i],qtd_estoque[i]);
        }


    }
}