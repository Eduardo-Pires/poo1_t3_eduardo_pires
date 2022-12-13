import java.time.LocalDate;
public class Empresa
{
    public static void main(String[] args) {
        Funcionario[] employee = new Funcionario[4];

        employee[0] = new Chefe("Hermes", LocalDate.parse("2002-02-02"), 2333);
        employee[1] = new Horista("Thiago", LocalDate.parse("2003-03-03"), 33, 232);
        employee[2] = new Operario("Heracles", LocalDate.parse("2003-06-03"), 339, 43);
        employee[3] = new Vendedor("Jasão", LocalDate.parse("2003-05-05"), 1578, 12, 20);

        FolhaPagamento folha = new FolhaPagamento();

        folha.print(employee);

    }
}
