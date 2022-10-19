import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanf = new Scanner(System.in);

        float auxMedia = 0f;
        int i, auxMenos, auxMais;
        int[] numero = new int[5];

        for (i = 1; i <= 5; i++)
        {
            System.out.printf("Entre com o número %d: ", i);
            numero[i-1] = scanf.nextInt();
        }

        auxMenos = numero[0];
        auxMais = numero[0];

        System.out.printf("\n\n");
        System.out.print("Os valores lidos são: ");
        for (i = 0; i < 5; i++)
        {
            System.out.print(numero[i] + " ");

            if(auxMais < numero[i])
            {
                auxMais =  numero[i];
            }

            if(auxMenos > numero[i])
            {
                auxMenos += numero[i];
            }

            auxMedia += numero[i];
        }
        System.out.println();

        System.out.println("O menor valor é: " + auxMenos);
        System.out.println("O maior valor é: " + auxMais);
        System.out.println("O valor médio é: " + (auxMedia/5));

    }
}