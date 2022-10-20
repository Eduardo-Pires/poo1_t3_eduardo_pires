import java.util.Scanner;

public class principal {

    public static void ex01()
    {
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

    public static void ex02()
    {
        Scanner scanf = new Scanner(System.in);

        int i;
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

    public static void ex03()
    {
        Scanner scanf = new Scanner(System.in);

        int i = 1;
        int[] numero = new int[6];

        for (i = 1; i <= 6; i++)
        {
            System.out.printf("Entre com o número %d: ", i);
            numero[i-1] = scanf.nextInt();
        }

        System.out.print("Os valores lidos são: ");
        for (i = 5; i >= 0; i--)
        {
            System.out.print(numero[i] + " ");
        }
        System.out.println();
    }

    public static void ex04()
    {
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

    public static void ex05()
    {
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

    public static void ex06()
    {
        Scanner scanf = new Scanner(System.in);

        float auxMedia = 0f;
        int i, auxMenos, auxMais, posicaoMenos = 0, posicaoMais = 0;
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
                posicaoMais  = i;
            }

            if(auxMenos > numero[i])
            {
                auxMenos += numero[i];
                posicaoMenos = i;
            }

            auxMedia += numero[i];
        }
        System.out.println();

        System.out.println("O menor valor é: " + auxMenos + ", localizado na posição " + posicaoMenos + " do vetor");
        System.out.println("O maior valor é: " + auxMais + ", localizado na posição " + posicaoMais + " do vetor");
        System.out.println("O valor médio é: " + (auxMedia/5));


    }

    public static void ex07()
    {
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

    public static void ex08()
    {
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

    public static void ex09()
    {

    }

    public static void ex10()
    {

    }

    public static void ex11()
    {

    }

    public static void ex12()
    {

    }

    public static void ex13()
    {

    }

    public static void ex14()
    {

    }

    public static void ex15()
    {

    }

    public static void ex16()
    {

    }

    public static void escolher(String escolha)
    {
        switch (escolha)
        {
            case "ex01":
                ex01();
                break;

            case "ex02":
                ex02();
                break;

            case "ex03":
                ex03();
                break;

            case "ex04":
                ex04();
                break;

            case "ex05":
                ex05();
                break;

            case "ex06":
                ex06();
                break;

            case "ex07":
                ex07();
                break;

            case "ex08":
                ex08();
                break;

            case "ex09":
                ex09();
                break;

            case "ex10":
                ex10();
                break;

            case "ex11":
                ex11();
                break;

            case "ex12":
                ex12();
                break;

            case "ex13":
                ex13();
                break;

            case "ex14":
                ex14();
                break;

            case "ex15":
                ex15();
                break;

            case "ex16":
                ex16();
                break;

            default:
                System.out.println("opção inválida");
                break;
        }
    }


    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        String escolha;
        Short deveContinuar = 0;


        while(deveContinuar != 1)
        {
            System.out.println("digite a parte que deseja acessar (formato: ex01, ex02,...,ex16): ");
            escolha = scanf.nextLine();

            escolher(escolha);
            
            System.out.printf("\ncontinuar? (0 = sim e 1 = não)\n");
            deveContinuar = scanf.nextShort();
            scanf.nextLine();
        }
    }
}
