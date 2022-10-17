import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        int i = 1;
        int[] numero = new int[6];

        System.out.printf("Entre com o número %d: ", i);
        numero[i-1] = scanf.nextInt();

        i++;
        System.out.printf("Entre com o número %d: ", i);
        numero[i-1] = scanf.nextInt();

        i++;
        System.out.printf("Entre com o número %d: ", i);
        numero[i-1] = scanf.nextInt();

        i++;
        System.out.printf("Entre com o número %d: ", i);
        numero[i-1] = scanf.nextInt();

        i++;
        System.out.printf("Entre com o número %d: ", i);
        numero[i-1] = scanf.nextInt();

        i++;
        System.out.printf("Entre com o número %d: ", i);
        numero[i-1] = scanf.nextInt();

        System.out.printf("Os valores lidos são: %d %d %d %d %d %d\n", numero[0], numero[1], numero[2], numero[3], numero[4], numero[5]);
    }
}