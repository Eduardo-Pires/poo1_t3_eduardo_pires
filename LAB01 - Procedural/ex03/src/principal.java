import java.util.Scanner;

public class principal {

    public static void ex01()
    {
        Scanner scanf = new Scanner(System.in);

        int i = 1;
        int[] numero = new int[6];

        System.out.println("<< Listando um vetor >>");

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

        System.out.println("<< Listando um vetor com loops >>");

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

        int i;
        int[] numero = new int[6];

        System.out.println("<< Listando um vetor em ordem inversa >>");

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

        System.out.println("<< Listando um vetor de números pares>>");
        while(i < 6)
        {
            i++;
            System.out.printf("Entre com o número %d: ", i);
            numero[i-1] = scanf.nextInt();

            if(numero[i-1]%2 != 0)
            {
                System.out.println("Erro: Valor inválido\n");
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

        System.out.println("<< 5 valores >>");

        for (i = 1; i <= 5; i++)
        {
            System.out.printf("Entre com o número %d: ", i);
            numero[i-1] = scanf.nextInt();
        }

        auxMenos = numero[0];
        auxMais = numero[0];

        System.out.print("\n\n");
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
                auxMenos = numero[i];
            }

            auxMedia += numero[i];
        }
        System.out.println();

        System.out.println("O maior valor é: " + auxMais);
        System.out.println("O menor valor é: " + auxMenos);
        System.out.println("O valor médio é: " + (auxMedia/5));
    }

    public static void ex06()
    {
        Scanner scanf = new Scanner(System.in);

        float auxMedia = 0f;
        int i, auxMenos, auxMais, posicaoMenos = 0, posicaoMais = 0;
        int[] numero = new int[5];

        System.out.println("<< 5 valores >>");

        for (i = 1; i <= 5; i++)
        {
            System.out.printf("Entre com o número %d: ", i);
            numero[i-1] = scanf.nextInt();
        }

        auxMenos = numero[0];
        auxMais = numero[0];

        System.out.print("\n\n");
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
                auxMenos = numero[i];
                posicaoMenos = i;
            }

            auxMedia += numero[i];
        }
        System.out.println();

        System.out.println("O maior valor é: " + auxMais + ", localizado na posição " + posicaoMais + " do vetor");
        System.out.println("O menor valor é: " + auxMenos + ", localizado na posição " + posicaoMenos + " do vetor");
        System.out.println("O valor médio é: " + (auxMedia/5));


    }

    public static void ex07()
    {
        Scanner scanf = new Scanner(System.in);

        int i, auxMaior;
        int[] numero = new int[6];

        System.out.println("<<Normalizando as notas>>");

        System.out.printf("entre com as notas do aluno %d: ", 1);
        numero[0] = scanf.nextInt();

        auxMaior = numero[0];

        for (i = 2; i <= 5; i++)
        {
            System.out.printf("entre com a nota do aluno %d: ", i);
            numero[i-1] = scanf.nextInt();

            if(numero[i-1] > auxMaior)
            {
                auxMaior = numero[i-1];
            }
        }

        System.out.println("\nNotas normalizadas\n");

        for (i = 0; i < 5; i++)
        {
            if(auxMaior == numero[i])
            {
                System.out.println("A nota do aluno " + (i+1) + " é " + 100 + " ");
            }
            else
            {
                System.out.println("A nota do aluno " + (i+1) + " é " + (numero[i]*2) + " ");
            }

        }

    }

    public static void ex08()
    {
        Scanner scanf = new Scanner(System.in);

        double media, auxDesvioPadrao = 0.0, desvioPadrao, auxSum = 0.0;
        int i;
        int[] numero = new int[5];

        System.out.println("<< Média e desvio-padrão >>");

        for (i = 1; i <= 5; i++)
        {
            System.out.printf("Digite o valor %d: ", i);
            numero[i-1] = scanf.nextInt();

            scanf.nextLine();
            auxSum += numero[i-1];
        }

        media = auxSum/5;

        for(i = 0; i < 5; i++)
        {
            auxDesvioPadrao += Math.pow((numero[i] - media), 2);
        }

        desvioPadrao = Math.sqrt(auxDesvioPadrao/4);

        System.out.println("A média é " + media + " e o desvio padrão é " + desvioPadrao);
    }

    public static void ex09()
    {
        Scanner scanf = new Scanner(System.in);

        int i, numeroDeAlunos = 0, auxSum = 0;

        System.out.println("<< Média de n alunos. Máximo 100 alunos >>");

        do
        {

            if(numeroDeAlunos > 100)
            {
                System.out.println("Erro! O número máximo de alunos permitido é 100.\n");
            }

            System.out.print("Entre com o número de alunos: ");
            numeroDeAlunos = scanf.nextInt();

        }while(numeroDeAlunos > 100);

        int[] numero = new int[numeroDeAlunos];

        for (i = 1; i <= numeroDeAlunos; i++)
        {
            System.out.printf("digite a nota do aluno %d: ", i);
            numero[i-1] = scanf.nextInt();

            auxSum += numero[i-1];
        }

        System.out.println("\nRelatório de Notas");

        for (i = 0; i < numeroDeAlunos; i++)
        {
            System.out.printf("A nota do aluno %d é: %d\n", i+1 , numero[i]);
        }

        System.out.println("A média da turma é: " + (float)auxSum/numeroDeAlunos);

    }

    public static void ex10()
    {
        Scanner scanf = new Scanner(System.in);

        int i;
        int[] arrayA = new int[3], arrayB = new int[3], arrayC = new int[3];

        System.out.println("<< Subtração de vetores >>");

        for (i = 1; i <= 6; i++)
        {
            if(i <= 3)
            {
                System.out.printf("Digite o valor %d de A: ", i);
                arrayA[i-1] = scanf.nextInt();

                if(i == 3)
                {
                    System.out.println();
                }
            }
            else
            {
                System.out.printf("Digite o valor %d de B: ", i-3);
                arrayB[i-4] = scanf.nextInt();
            }
        }

        System.out.print("\nO vetor C, definido como C = A-B é (");
        for (i = 0; i < 3; i++)
        {
            arrayC[i] = arrayA[i] - arrayB[i];
            System.out.print(arrayC[i]);

            if(i < 2)
            {
                System.out.print(',');
            }
        }
        System.out.println(')');
    }

    public static void ex11()
    {
        Scanner scanf = new Scanner(System.in);

        int i, k = 0, j = 0, numpar = 0, numImpar = 0;
        int[] arrayA = new int[5];

        System.out.println("<< Pares e Ímpares >>");

        for (i = 1; i <= 5; i++)
        {

                System.out.printf("Digite o valor %d: ", i);
                arrayA[i-1] = scanf.nextInt();

                if(arrayA[i-1]%2 != 0)
                {
                    numImpar++;
                }
                else
                {
                    numpar++;
                }

        }

        int[] arrayB = new int[numImpar], arrayC = new int[numpar];

        for(i = 0; i < 5; i++)
        {
            if(arrayA[i]%2 != 0)
            {
                arrayB[j] = arrayA[i];
                j++;
            }
            else
            {
                arrayC[k] = arrayA[i];
                k++;
            }
        }

        System.out.print("\nimpares: ");
        for (i = 0; i < numImpar; i++)
        {
            System.out.print(arrayB[i]);

            if(i < numImpar-1)
            {
                System.out.print(',');
            }
        }

        System.out.print("\npares: ");
        for (i = 0; i < numpar; i++)
        {
            System.out.print(arrayC[i]);

            if(i < numpar - 1)
            {
                System.out.print(',');
            }
        }


    }


    public static void ex12()
    {
        Scanner scanf = new Scanner(System.in);

        int i;
        float total = 0;
        float[] numero = new float[4];
        float[] resultado = new float[4];

        System.out.println("<< Probabilidades >>\n");
        String[] cores = {"Verde: ", "Azul: ", "Amarela: ", "Vermelha: "};

        System.out.println("Digite a quantidade de bolinhas");
        for (i = 0; i < 4; i++)
        {
            System.out.print(cores[i]);
            numero[i] = scanf.nextFloat();
            total += numero[i];

            scanf.nextLine();
        }

        resultado[0] = (numero[0]/total)*100;
        float maior = resultado[0];


        for (i = 1; i < 4; i++)
        {
           resultado[i] = ((numero[i]/total)*100);

           if(resultado[i] > maior)
           {
               maior = resultado[i];
           }

        }

        System.out.println("Probabilidades");
        for (i = 0; i < 4; i++)
        {
            if (resultado[i] != maior)
            {
                System.out.println(cores[i] + String.format("%.1f", resultado[i]) + '%');
            }
            else
            {
                System.out.println(cores[i] + String.format("%.1f", resultado[i]) + '%' + " << Maior probabilidade");
            }
        }



    }

    public static void ex13()
    {
        Scanner scanf = new Scanner(System.in);

        int i;
        int[] numero = new int[5];

        System.out.println("<< Zerando negativos >>");

        for (i = 1; i <= 5; i++)
        {
            System.out.printf("Entre com o número %d: ", i);
            numero[i-1] = scanf.nextInt();

            if(numero[i-1] < 0)
            {
                numero[i-1] = 0;
            }
        }

        System.out.print("Zerando os negativos, obtém-se: ");
        for (i = 0; i < 5; i++)
        {
            System.out.print(numero[i] + " ");
        }
        System.out.println();

    }

    public static void ex14()
    {
        Scanner scanf = new Scanner(System.in);

        int numeroAlunos = 0;

        System.out.println("<< Universidade X >>");

        do {
            if (numeroAlunos > 10000)
            {
                System.out.println("erro, digite novamente\n");
            }

            System.out.print("Quantos alunos serão cadastrados: ");
            numeroAlunos = scanf.nextInt();
        }while (numeroAlunos > 10000);

        int[] numeroAluno = new int[numeroAlunos];
        String[] classeSocial = new String[numeroAlunos];
        float[] cra = new float[numeroAlunos];

        for (int i = 0; i < numeroAlunos; i++)
        {
            System.out.print("Entre com o número do aluno: ");
            numeroAluno[i] = scanf.nextInt();
            scanf.nextLine();

            System.out.printf("Entre com a classe social do aluno %d: ", numeroAluno[i]);
            classeSocial[i] = scanf.nextLine();

            System.out.printf("Entre com o CRA do aluno %d: ", numeroAluno[i]);
            cra[i] = scanf.nextFloat();

            System.out.println();
        }

        System.out.println("\n==== Alunos Cadastrados ====");
        for (int i = 0; i < numeroAlunos; i++)
        {
            System.out.printf("Número: %d Classe Social: %s CRA: %.2f\n", numeroAluno[i], classeSocial[i], cra[i]);
        }
    }

    public static void ex15() {
        Scanner scanf = new Scanner(System.in);

        int i, j, printado;
        double[] numero = new double[8];
        double erroPi = 3.141592653589793238462643383279502884197169;

        System.out.println("<< Valores iguais >>");

        for (i = 1; i <= 8; i++)
        {
            System.out.printf("Entre com o número %d: ", i);
            numero[i - 1] = scanf.nextFloat();

            if(numero[i-1]- (int)numero[i-1] != 0)
            {
                System.out.println("erro, digite um número inteiro");
                scanf.nextLine();
                i--;
            }
        }

        System.out.print("\nValores repetidos: ");
        for (i = 0; i < numero.length; i++)
        {
            printado = 0;
            for (j = i + 1; j < numero.length; j++)
            {
                if (numero[i] == numero[j] && printado > 0)
                {
                    numero[j] = erroPi;
                    printado++;
                    continue;
                }

                if (numero[i] == numero[j] && numero[j] != erroPi)
                {
                    System.out.printf("%.0f ", numero[j]);
                    printado++;
                }
            }
        }
    }
    public static void ex16()
    {
        Scanner scanf = new Scanner(System.in);

        int i, j, printado;
        double[] numero = new double[8];
        double erroPi = 3.141592653589793238462643383279502884197169;

        System.out.println("<< Valores iguais >>");

        for (i = 1; i <= 8; i++)
        {
            System.out.printf("Entre com o número %d: ", i);
            numero[i - 1] = scanf.nextFloat();

            if(numero[i-1]- (int)numero[i-1] != 0)
            {
                System.out.println("erro, digite um número inteiro");
                scanf.nextLine();
                i--;
            }
        }

        System.out.println("\nValores repetidos: ");
        for (i = 0; i < numero.length; i++)
        {
            printado = 0;
            for (j = i + 1; j < numero.length; j++)
            {
                if (numero[i] == numero[j] && printado > 0)
                {
                    numero[j] = erroPi;
                    printado++;
                    continue;
                }

                if (numero[i] == numero[j] && numero[j] != erroPi)
                {
                    System.out.printf("%.0f ", numero[j]);
                    printado++;
                }
            }
            if (printado != 0)
            {
                System.out.println("aparece " + (printado+1) + " vezes");
            }
        }
    }



    //função que encapsula o switch-case para escolher e então acessar os métodos dos diferentes exercícios
    public static void escolher(String escolha)
    {
        switch (escolha)
        {
            case "ex01" -> ex01();
            case "ex02" -> ex02();
            case "ex03" -> ex03();
            case "ex04" -> ex04();
            case "ex05" -> ex05();
            case "ex06" -> ex06();
            case "ex07" -> ex07();
            case "ex08" -> ex08();
            case "ex09" -> ex09();
            case "ex10" -> ex10();
            case "ex11" -> ex11();
            case "ex12" -> ex12();
            case "ex13" -> ex13();
            case "ex14" -> ex14();
            case "ex15" -> ex15();
            case "ex16" -> ex16();
            default -> System.out.println("opção inválida");
        }
    }

    //para não ter de ser mudado manualmente no código foi criado um sistema de escolha
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        String escolha;
        short deveContinuar = 1;

        //O laço de repetição permite verificar a funcionalidade de todos os exercícios sem parar a execução
        while(deveContinuar != 0)
        {
            System.out.println("digite a parte que deseja acessar (formato: ex01, ex02,...,ex16): ");
            escolha = scanf.nextLine();

            escolher(escolha);

            System.out.println("\ndeseja verificar outra parte? (1 = sim e 0 = não)");
            deveContinuar = scanf.nextShort();
            scanf.nextLine();
        }
    }
}
