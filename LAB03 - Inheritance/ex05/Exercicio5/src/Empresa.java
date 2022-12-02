import java.time.LocalDate;
public class Empresa
{
    public static void main(String[] args) {
        Vendedor logista = new Vendedor("eduardo", LocalDate.parse("2002-02-13"), 2000, 50, 12);
        logista.calculaSalario();

        System.out.println(logista);
    }
}
