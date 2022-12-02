import java.time.LocalDate;

public class Funcionario {
        private String nome;
        private LocalDate dataNascimento;
        private float salario;

        public Funcionario(String nome, LocalDate dataNascimento, float salario)
        {
             this.nome = nome;
             this.dataNascimento = dataNascimento;
             this.salario = salario;
         }

        public String getNome()
        {
            return nome;
        }

        public void setNome(String nome)
        {
            this.nome = nome;
        }

        public LocalDate getDataNascimento()
        {
            return dataNascimento;
        }

        public void setDataNascimento(LocalDate dataNascimento)
        {
            this.dataNascimento = dataNascimento;
        }

        public float getSalario()
        {
            return salario;
        }

        public void setSalario(float salario)
        {
            this.salario = salario;
        }

}
