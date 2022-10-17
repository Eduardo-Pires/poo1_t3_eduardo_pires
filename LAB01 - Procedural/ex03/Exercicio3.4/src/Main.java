import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanf = new Scanner(System.in);

        int i = 0;
        int[] numero = new int[6];

        while(i < 6)
        {
            i++;
            System.out.printf("Entre com o número %d: ", i);
            numero[i-1] = scanf.nextInt();

            if(numero[i-1]%2 != 0)
            {
                System.out.println("Erro: Valor inválido");
                i--;
            }
        }

        System.out.print("Os valores lidos são: ");
        for (i = 0; i < 6; i++)
        {
            System.out.print(numero[i] + " ");
        }
        System.out.println();

    }
}