import java.time.LocalDate;
import java.util.Scanner;

public class Figurinha
{
    private String nomeJogador;
    private LocalDate dataNascimento;
    private float altura;
    private float peso;
    private String posicao;
    private String pais;


    private static LocalDate configuraData()
    {
        Scanner scanf = new Scanner(System.in);
        String data = scanf.nextLine();
        return LocalDate.parse(data);
    }

    public void alteraInfo(Figurinha jogador)
    {
        Scanner scanf = new Scanner(System.in);
        System.out.println("(nome), (data de nascimento), (altura)\n(peso), (posição), (país), (tudo)");
        System.out.println("dos elelementos acima, qual você deseja alterar: ");
        String escolha = scanf.nextLine();

        switch (escolha)
        {
            case "nome" ->
            {
                System.out.print("Nome do jogador: ");
                jogador.nomeJogador = scanf.nextLine();
            }
            case "data de nascimento" ->
            {
                System.out.print("data de nascimento do jogador [ano-mês-dia]: ");
                jogador.dataNascimento = configuraData();
            }
            case "altura" ->
            {
                System.out.print("altura do jogador: ");
                jogador.altura = scanf.nextFloat();
            }
            case "peso" ->
            {
                System.out.print("peso do jogador: ");
                jogador.peso = scanf.nextFloat();
                scanf.nextLine();
            }
            case "posição" ->
            {
                System.out.print("posição do jogador: ");
                jogador.posicao = scanf.nextLine();
            }
            case "país" ->
            {
                System.out.print("país do jogador: ");
                jogador.pais = scanf.nextLine();
            }
            case "tudo" ->
            {
                System.out.println("\n<<entre com as informações do jogador>>");
                System.out.print("Nome do jogador: ");
                jogador.nomeJogador = scanf.nextLine();
                System.out.print("data de nascimento do jogador [ano-mês-dia]: ");
                jogador.dataNascimento = configuraData();
                System.out.print("altura do jogador: ");
                jogador.altura = scanf.nextFloat();
                System.out.print("peso do jogador: ");
                jogador.peso = scanf.nextFloat();
                scanf.nextLine();
                System.out.print("posição do jogador: ");
                jogador.posicao = scanf.nextLine();
                System.out.print("país do jogador: ");
                jogador.pais = scanf.nextLine();
            }
        }
    }

    public void mostraInfo(Figurinha jogador)
    {
        System.out.println("\n<<Informações do jogador " + jogador.nomeJogador + ">>");
        System.out.println("Nome: " + jogador.nomeJogador);
        System.out.println("Data de nascimento: " + jogador.dataNascimento);
        System.out.println("Altura: "+ jogador.altura);
        System.out.println("Peso: "+ jogador.peso);
        System.out.println("Posicao: "+ jogador.posicao);
        System.out.println("País: "+ jogador.pais);
    }

}
