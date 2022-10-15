import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Produto[] item = new Produto[4];
        Scanner scanf = new Scanner(System.in);

        /*  realizei pequenas mudanças estéticas na saída do programa, porém os valores e funcionalidade continuam os
         *  mesmos do "exemplo 04.c"
         */

        for(int i = 0; i < 4; i++)
        {
            item[i] = new Produto();

            /*  adicionei o índice do produto na saída para dar uma exemplificação melhor de qual produto está sendo
             *  inserido no momento.
             */
            System.out.printf("\nInforme o nome, o preco e a qtd. em estoque do produto %d:\n", i+1);
            item[i].nome = scanf.nextLine();
            item[i].preco = scanf.nextFloat();
            item[i].qtd_estoque = scanf.nextInt();

            scanf.nextLine();
        }

        //nas saídas eu dei uma otimizada nos espaços para melhor vizualização

        System.out.printf("\nAumentando o preco em 10%% do produto 1 e 3\n");
        //acredito que possa ter um equivoco nessa parte, mas mantive os valores do original
        item[0].altera_preco(item[0].preco, -110);
        item[2].altera_preco(item[2].preco, 10);

        System.out.printf("\nReduzindo o preco em 5%% do produto 2");

        if(!(item[1].altera_preco(item[1].preco, -5)))
        {
            System.out.printf("\nErro: preco nao alterado. Porcentagem invalida");
        }
        else
        {
            System.out.printf("\nPreco alterado com sucesso");
        }

        System.out.printf("\n\nAlterando o preco do prod. 3");
        //outra vez acredito que possa ter tido um equívoco, pois está alterando o quarto produto, mas mantive como estava
        if (!(item[3].altera_preco(item[3].preco,-110)))
        {
            System.out.printf("\nErro: preco nao alterado. Porcentagem invalida\n");
        }

        System.out.printf("\nProdutos Cadastrados:");
        for (int i = 0; i < 4; i++){
            //alteração no número de casas mostradas após a vírgula, apenas por convenção estética
            System.out.printf("\nProduto: %s\nPreco: %.2f\nEstoque: %d\n", item[i].nome, item[i].preco, item[i].qtd_estoque);
        }

    }
}