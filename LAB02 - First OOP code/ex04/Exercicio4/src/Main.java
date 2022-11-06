public class Main {
    public static void main(String[] args) {
        String[] nomes1 = {"Aaran", "Aaren", "Aarez", "Aarman", "Aaron", "Aaron-James", "Aarron", "Aaryan", "Aaryn", "Aayan", "Aazaan"};
        String[] nomes2 = {"Benny", "Benoit", "Bentley", "Berkay", "Bernard", "Bertie", "Bevin", "Bezalel", "Bhaaldeen", "Bharath", "Bilal"};

        Selecao selecao1 = new Selecao();
        Selecao selecao2 = new Selecao();

        selecao1.setTeamName("Vasco");
        selecao1.setCoachName("Bruno Travencolo");
        selecao1.setTeamOwners(nomes1);

        selecao2.setTeamName("Real Madrid");
        selecao2.setCoachName("Abdala");
        selecao2.setTeamOwners(nomes2);
        
    }
}