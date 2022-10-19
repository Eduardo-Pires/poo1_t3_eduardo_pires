import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanf = new Scanner(System.in);

        int i = 1;
        int[] numero = new int[6];

        for (i = 1; i <= 6; i++)
        {
            System.out.printf("Entre com o número %d: ", i);
            numero[i-1] = scanf.nextInt();
        }

        System.out.print("Os valores lidos são: ");
        for (i = 0; i < 6; i++)
        {
            System.out.print(numero[i] + " ");
        }
        System.out.println();

    }
}