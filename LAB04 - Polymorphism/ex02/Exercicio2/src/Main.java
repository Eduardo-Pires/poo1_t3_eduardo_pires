public class Main {
    public static void main(String[] args) {
        Forma[] forma = new Forma[6];

        forma[0] = new Circulo(7);
        forma[1] = new Quadrado(7);
        forma[2] = new Triangulo(7,7);
        forma[3] = new Esfera(7);
        forma[4] = new Cubo(7);
        forma[5] = new Tetraedro(7,7,7);

        for (int i = 0; i < forma.length; i++)
        {
            forma[i].imprimeForma();
        }
    }
}