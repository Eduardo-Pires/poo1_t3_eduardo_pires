import java.util.Scanner;

public class FaceFriends {
    public static void main(String[] args) {
      Scanner scanf = new Scanner(System.in);

      boolean sair = false;
      String subtipo, apelido, nome, email, aniversario, tipo, parentesco;
      int escolha, grau, i = 0, indice;
      Contato[] contatos = new Contato[10];

      while(i < 10 || sair)
      {
          System.out.print("""
                   Menu:
                   1 - Inserir um contato, especificando o subtipo e então requerendoos seus campos.
                   2 - Imprimir todos os contatos.
                   3 - Imprimir somente os familiares.
                   4 - Imprimir somente os amigos.
                   5 - Imprimir somente os colegas de trabalho.
                   6 - Imprimir os MELHORES amigos, os IRMÃOS e os COLEGAS de trabalho
                   7 - Imprimir os dados de um ÚNICO contato, escolhido pelo índice.
                   digite o número de uma das opções acima: 
                  """);
          escolha = scanf.nextInt();
          scanf.nextLine();

          switch (escolha)
          {
                 case 1:
                     System.out.print("informe o subtipo(Amigos, Familia ou trabalho): ");
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

                     switch (subtipo)
                     {
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
                         case "trabalho" -> {
                             System.out.println("tipo (ex.: chefe, colega, etc.):");
                             tipo = scanf.nextLine();
                             contatos[i] = new Familia(apelido, nome, email, aniversario, tipo);
                             i++;
                         }
                     }
                case 2:
                    for(int j = 0; j < contatos.length; j++)
                    {
                        contatos[i].imprimirContato();
                    }
                    break;
                case 3:
                    for(int j = 0; j < contatos.length; j++)
                    {
                        if(contatos[i] instanceof Familia)
                        {
                            contatos[i].imprimirContato();
                        }
                    }
                    break;
              case 4:
                  for(int j = 0; j < contatos.length; j++)
                  {
                      if(contatos[i] instanceof Amigo)
                      {
                          contatos[i].imprimirContato();
                      }
                  }
                  break;
              case 5:
                  for(int j = 0; j < contatos.length; j++)
                  {
                      if(contatos[i] instanceof Trabalho)
                      {
                          contatos[i].imprimirContato();
                      }
                  }
                  break;
              case 6:
                  for(int j = 0; j < contatos.length; j++)
                  {
                      if(contatos[i] instanceof Amigo && ((Amigo)contatos[i]).getGrau() == 3)
                      {
                          contatos[i].imprimirContato();
                      }
                      else if(contatos[i] instanceof Trabalho && ((Trabalho) contatos[i]).getTipo().equals("colega"))
                      {
                          contatos[i].imprimirContato();
                      }
                      else if(contatos[i] instanceof Familia && ((Familia)contatos[i]).getParentesco().equals("irmão"))
                      {
                          contatos[i].imprimirContato();
                      }
                  }
                  break;
              case 7:
                  System.out.print("digite o indice do contato: ");
                  indice = scanf.nextInt();

                  if(contatos[indice] instanceof Amigo)
                  {
                      System.out.println("Amigos");
                  }
                  else if(contatos[indice] instanceof Trabalho)
                  {
                      System.out.println("Trabalho");
                  }
                  else if(contatos[indice] instanceof Familia)
                  {
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