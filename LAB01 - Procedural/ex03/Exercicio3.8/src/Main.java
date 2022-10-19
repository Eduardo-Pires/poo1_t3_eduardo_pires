import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanf = new Scanner(System.in);

        double media, auxDesvioPadrao = 0.0, desvioPadrao, auxSum = 0.0;
        int i;
        double[] numero = new double[5];

        for (i = 1; i <= 5; i++)
        {
            System.out.printf("Digite o valor %d: ", i);
            numero[i-1] = scanf.nextDouble();

            scanf.nextLine();
            auxSum += numero[i-1];
        }


        media = auxSum/5;

        for(i = 0; i < 5; i++) {
            auxDesvioPadrao += Math.pow(numero[i] - media, 2);
        }

        desvioPadrao = Math.sqrt(auxDesvioPadrao/5);

        System.out.println("A média é " + media + " e o desvio padrão é " + desvioPadrao);

    }
}