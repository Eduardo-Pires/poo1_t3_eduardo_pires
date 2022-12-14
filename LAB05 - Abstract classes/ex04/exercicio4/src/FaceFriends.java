import java.util.Scanner;

public class FaceFriends {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        boolean sair = false;
        String subtipo, apelido, nome, email, aniversario, tipo, parentesco;
        int escolha, grau, i = 0, indice;
        Contato[] contatos = new Contato[10];

        while (i < 10 || sair) {
            System.out.print("""
                     Menu:
                     1 - Inserir um contato, especificando o subtipo e então requerendoos seus campos.
                     2 - Imprimir todos os contatos.
                     3 - Imprimir somente os familiares.
                     4 - Imprimir somente os amigos.
                     5 - Imprimir somente os colegas de trabalho.
                     6 - Imprimir os MELHORES amigos, os IRMÃOS e os COLEGAS de trabalho
                     7 - Imprimir os dados de um ÚNICO contato, escolhido pelo índice.
                    """);
            System.out.print("digite o número de uma das opções acima:\040");
            escolha = scanf.nextInt();
            scanf.nextLine();

            switch (escolha) {
                case 1:
                    System.out.print("informe o subtipo(Amigos, Familia ou Trabalho): ");
                    subtipo = scanf.nextLine();

                    System.out.println("informe os campos de para a criação do contato");
                    System.out.print("Nome:");
                    nome = scanf.nextLine();
                    System.out.print("apelido: ");
                    apelido = scanf.nextLine();
                    System.out.print("email: ");
                    email = scanf.nextLine();
                    System.out.print("aniversário: ");
                    aniversario = scanf.nextLine();

                    switch (subtipo) {
                        case "Amigos" -> {
                            System.out.print("grau (1 = melhor amigo; 2 = amigo; 3 = conhecido).: ");
                            grau = scanf.nextInt();
                            contatos[i] = new Amigo(apelido, nome, email, aniversario, grau);
                            i++;
                        }
                        case "Familia" -> {
                            System.out.print("parentesco: ");
                            parentesco = scanf.nextLine();
                            contatos[i] = new Familia(apelido, nome, email, aniversario, parentesco);
                            i++;
                        }
                        case "Trabalho" -> {
                            System.out.println("tipo (ex.: chefe, colega, etc.):");
                            tipo = scanf.nextLine();
                            contatos[i] = new Familia(apelido, nome, email, aniversario, tipo);
                            i++;
                        }
                    }
                    break;
                case 2:
                    for (int j = 0; j < i; j++) {
                        contatos[j].imprimirContato();
                    }
                    break;
                case 3:
                    for (int j = 0; j < contatos.length; j++) {
                        if (contatos[j] instanceof Familia) {
                            contatos[j].imprimirContato();
                        }
                    }
                    break;
                case 4:
                    for (int j = 0; j < contatos.length; j++) {
                        if (contatos[j] instanceof Amigo) {
                            contatos[j].imprimirContato();
                        }
                    }
                    break;
                case 5:
                    for (int j = 0; j < contatos.length; j++) {
                        if (contatos[j] instanceof Trabalho) {
                            contatos[j].imprimirContato();
                        }
                    }
                    break;
                case 6:
                    for (int j = 0; j < contatos.length; j++) {
                        if (contatos[j] instanceof Amigo && ((Amigo) contatos[j]).getGrau() == 1) {
                            contatos[j].imprimirContato();
                        } else if (contatos[j] instanceof Trabalho && ((Trabalho) contatos[j]).getTipo().equals("colega")) {
                            contatos[i].imprimirContato();
                        } else if (contatos[j] instanceof Familia && ((Familia) contatos[j]).getParentesco().equals("irmão")) {
                            contatos[j].imprimirContato();
                        }
                    }
                    break;
                case 7:
                    System.out.print("digite o indice do contato: ");
                    indice = scanf.nextInt();

                    if (contatos[indice] instanceof Amigo) {
                        System.out.println("Amigos");
                    } else if (contatos[indice] instanceof Trabalho) {
                        System.out.println("Trabalho");
                    } else if (contatos[indice] instanceof Familia) {
                        System.out.println("Familia");
                    }
                    contatos[indice].imprimirContato();
                    break;
                case 8:
                    sair = true;
                    break;
            }
        }
    }
}