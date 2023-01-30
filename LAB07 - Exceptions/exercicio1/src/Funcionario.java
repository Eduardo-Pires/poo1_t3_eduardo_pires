
public class Funcionario
{
    private String CPF;
    private String Nome;
    private double salario;
    private final double  tetoSalarial = 40000;

    public void aumentaSalario(int porcentagem)
    {
       double aumento = salario + (salario * ((double) porcentagem / 100));
       if(aumento > 0 && aumento < tetoSalarial)
       {
           salario = aumento;
       }
       else if(aumento < 0)
       {
            throw new IllegalStateException("Valor inválido de salário");
       }
       else
       {
            throw new IllegalStateException("valor ultrapassa o teto");
       }
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }
}
