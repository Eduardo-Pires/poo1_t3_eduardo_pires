import java.time.LocalDate;

public class FolhaPagamento
{
    public void print(Funcionario[] worker) {
        for (int i = 0; i < worker.length; i++) {
            System.out.println("Nome: " + worker[i].getNome());
            System.out.println("Data de nascimento:" + worker[i].getDataNascimento());
            System.out.println("Salario: " + worker[i].getSalario());
            System.out.println();
        }
    }

    public void print(Funcionario worker)
    {
        System.out.println("Nome: " + worker.getNome());
        System.out.println("Data de nascimento:" + worker.getDataNascimento());
        System.out.println("Salario: " + worker.getSalario());
        System.out.println();
    }
}
