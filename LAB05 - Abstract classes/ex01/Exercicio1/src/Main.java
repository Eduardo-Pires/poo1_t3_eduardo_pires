public class Main {
    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente(2500, 4587, 123456);

        conta.debitaValor(255, 123456);
        conta.debitaValor(123.45f);

        System.out.println("saldo = " + conta.getSaldo(123456));

        conta.creditaValor(123456, 312);

        System.out.println("a senha é 46546? ");

        if(conta.isSenha(46546))
        {
            System.out.println("a senha está correta");
        }
        else
        {
            System.out.println("a senha está incorreta");
        }

        System.out.println("saldo = " + conta.getSaldo(123456));
        conta.debitaValor(2433.55f, 123456);
        System.out.println("saldo = " + conta.getSaldo(123456));
        System.out.println("é possível retirar mais? "  + conta.debitaValor(2433.55f, 123456));
    }
}