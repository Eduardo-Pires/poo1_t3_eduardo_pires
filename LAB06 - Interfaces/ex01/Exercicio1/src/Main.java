public class Main {
    public static void main(String[] args)
    {
        int codMax = 72348917, codMin = 10000000, costMax = 1000, costMin = 10;

        Cliente[] costumer = new Cliente[3];
        Produto[] product = new Produto[3];
        Servico[] service = new Servico[3];

        costumer[0] = new Cliente("James Cameron");
        costumer[1] = new Cliente("Michael Bay");
        costumer[2] = new Cliente("Quentin Tarantino");

        product[0] = new Produto((int)(Math.random() * (codMax - codMin)) + codMin);
        product[1] = new Produto((int)(Math.random() * (codMax - codMin)) + codMin);
        product[2] = new Produto((int)(Math.random() * (codMax - codMin)) + codMin);

        service[0] = new Servico((int)(Math.random() * (costMax - costMin)) + costMin);
        service[1] = new Servico((int)(Math.random() * (costMax - costMin)) + costMin);
        service[2] = new Servico((int)(Math.random() * (costMax - costMin)) + costMin);

        System.out.println("Pré ordenação:");
        for (int i = 0; i < 3; i++)
        {
            System.out.println("produto " + (i+1) + ": " + product[i].getCodigo());
        }
        System.out.println();

        for (int i = 0; i < 3; i++)
        {
            System.out.println("Serviço " + (i+1) + ": " + service[i].getPreco());
        }
        System.out.println();

        for (int i = 0; i < 3; i++)
        {
            System.out.println("Cliente " + (i+1) + ": " + costumer[i].getNome());
        }
        System.out.println();

        Classificador.ordena(costumer);
        Classificador.ordena(product);
        Classificador.ordena(service);

        System.out.println("Pós ordenação: ");
        for (int i = 0; i < 3; i++)
        {
            System.out.println("produto " + (i+1) + ": " + product[i].getCodigo());
        }
        System.out.println();

        for (int i = 0; i < 3; i++)
        {
            System.out.println("Serviço " + (i+1) + ": " + service[i].getPreco());
        }
        System.out.println();

        for (int i = 0; i < 3; i++)
        {
            System.out.println("Cliente " + (i+1) + ": " + costumer[i].getNome());
        }
        System.out.println();

    }
}