import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanf = new Scanner(System.in);

        System.out.print("Digite o numero de jogadores: ");
        int numJog = scanf.nextInt();
        Figurinha[] jog = new Figurinha[numJog];

        for (int i = 0; i < numJog; i++)
        {
            jog[i] = new Figurinha();
            jog[i].alteraInfo(jog[i]);
        }

        for (int i = 0; i < numJog; i++)
        {
            jog[i].mostraInfo(jog[i]);
        }

    }
}