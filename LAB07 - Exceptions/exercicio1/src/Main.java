public class Main {
    public static void main(String[] args) {
        Funcionario f = new Funcionario();

        f.setSalario(7800);

        int salario = 11000;

        try {
            f.aumentaSalario(salario);
        }
        catch (IllegalStateException e)
        {
            System.out.println(e.getMessage());
        }
        finally
        {
            System.out.println(f.getSalario());
        }
    }
}