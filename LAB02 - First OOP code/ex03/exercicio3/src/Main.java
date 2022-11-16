import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanf = new Scanner(System.in);

        System.out.print("Digite o numero de jogadores: ");
        int numJog = scanf.nextInt();
        Figurinha[] jogador = new Figurinha[numJog];
        scanf.nextLine();

        //informações do jogador adicionadas na entrada pelo usuário
        for (int i = 0; i < numJog; i++)
        {
            jogador[i] = new Figurinha();

            System.out.printf("\n<<entre com as informações do jogador %d>>\n", i+1);
            System.out.print("Nome do jogador: ");
            jogador[i].setName(scanf.nextLine());

            System.out.print("data de nascimento do jogador [ano-mês-dia]: ");
            jogador[i].setbirthDate(scanf.nextLine());

            System.out.print("altura do jogador: ");
            jogador[i].setHeight(scanf.nextFloat());

            System.out.print("peso do jogador: ");
            jogador[i].setWeight(scanf.nextFloat());

            scanf.nextLine();

            System.out.print("posição do jogador: ");
            jogador[i].setPosition(scanf.nextLine());

            System.out.print("país do jogador: ");
            jogador[i].setCountry(scanf.nextLine());
        }

        for (int i = 0; i < numJog; i++)
        {
            jogador[i].printFigurinha();
        }

    }
}