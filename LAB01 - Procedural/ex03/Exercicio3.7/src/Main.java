import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanf = new Scanner(System.in);

        int i, auxMaior = 0;
        int[] numero = new int[6];

        System.out.printf("entre com as notas do aluno %d: ", 1);
        numero[0] = scanf.nextInt();

        auxMaior = numero[0];

        for (i = 2; i <= 5; i++)
        {
            System.out.printf("entre com as notas do aluno %d: ", i);
            numero[i-1] = scanf.nextInt();

            if(numero[i-1] > auxMaior)
            {
                auxMaior = numero[i-1];
            }
        }

        System.out.printf("\nNotas normalizadas\n");

        for (i = 0; i < 5; i++)
        {
            if(auxMaior == numero[i])
            {
                System.out.println("A nota do aluno " + i + " é " + 100 + " ");
            }
            else
            {
                System.out.println("A nota do aluno " + i + " é " + (numero[i]*2) + " ");
            }

        }

    }
}