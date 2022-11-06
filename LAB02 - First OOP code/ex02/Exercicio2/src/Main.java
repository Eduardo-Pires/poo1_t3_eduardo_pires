public class Main {
    public static void main(String[] args)
    {
        Figurinha jog1, jog2,jog3;

        jog1 = new Figurinha();
        jog2 = new Figurinha();
        jog3 = new Figurinha();

        jog1.setName("Fausto Corrêa da Silva");
        jog1.setbirthDate("1950-04-02");
        jog1.setHeight(1.88f);
        jog1.setCountry("Brazil");
        jog1.setWeight(70);
        jog1.setPosition("apanhador");

        jog2.setName("Lady Gaga");
        jog2.setbirthDate("1986-03-28");
        jog2.setHeight(1.55f);
        jog2.setCountry("Estados Unidos da América");
        jog2.setWeight(53);
        jog2.setPosition("Armadora");

        jog3.setFigurinha("Nicolas Cage","1964-01-07",1.83f, 90, "Goleiro", "Estados Unidos da América");

        jog1.printFigurinha();

        jog2.printFigurinha();

        System.out.println("\n<<Informações do jogador>>");
        jog3.printName();
        jog3.printBirthDate();
        jog3.printHeight();
        jog3.printWeight();
        jog3.printPosition();
        jog3.printcountry();


    }
}