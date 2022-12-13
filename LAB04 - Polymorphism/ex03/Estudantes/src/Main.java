import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        System.out.println("---------------------------------------------------------------------------");
        EstudantePosGrad[] estudante = new EstudantePosGrad[4];
        estudante[0] = new EstudantePosGrad("Ailton","Rua 31 de fevereiro","Engenharia",
                "Banco de Dados");
        estudante[1] = new EstudantePosGrad("Airton","Rua 32 de fevereiro","Engenharia de software",
                "Banco de clusters");
        estudante[2] = new EstudantePosGrad("Amilton","Rua 33 de fevereiro","Engenharia elétrica",
                "Banco de Eletrons");

        Estudante[] normal = new Estudante[3];

        System.arraycopy(estudante, 0, normal, 0, 3);

        Universidade uni = new Universidade("FUFU", LocalDate.parse("1545-02-02"), normal);
        uni.printUniversidade();
        System.out.println("---------------------------------------------------------------------------");


        Estudante e = new Estudante("Carlos","Rua 1o de Abril");
        EstudanteGraduacao eg = new EstudanteGraduacao("Maria", "Rua Maio", "Java is funny");
        EstudantePosGrad ep = new EstudantePosGrad("Ailton","Rua 31 de fevereiro","Engenharia",
                "Banco de Dados");
        EstudanteMestrado epm = new EstudanteMestrado("Carla","Rua Primavera","Medicina",
                "Vacinas de RNA", "academico","Anticorpos");
        EstudanteDoutorado epd = new EstudanteDoutorado("Bruno","Rua Inverno",
                "Tecnologia","Processamento de Imagens","Carros Inteligentes");

        e.print();

        eg.print();
        System.out.println("Título TCC: " + eg.getTituloTCC());

        ep.print();
        System.out.println("Formação prévia: " + ep.getFormacao());

        epm.print();
        System.out.println("Título Dissertação: " + epm.getTituloDissertacao());

        epd.print();
        System.out.println("Título Tese: " + epd.getTituloTese());



        // casos com polimorfismo
        Estudante e2 = new Estudante("Carlos","Rua 1o de Abril");
        Estudante eg2 = new EstudanteGraduacao("Maria", "Rua Maio", "Java is funny");
        Estudante ep2 = new EstudantePosGrad("Ailton","Rua 31 de fevereiro","Engenharia",
                "Banco de Dados");
        Estudante epm2 = new EstudanteMestrado("Carla","Rua Primavera","Medicina",
                "Vacinas de RNA", "Anticorpos","academico");
        Estudante epd2 = new EstudanteDoutorado("Bruno","Rua Inverno",
                "Tecnologia","Processamento de Imagens","Carros Inteligentes");

/*
        e2.print();
        epd2.print();
        ep2.print();
        epd2.print();
        EstudanteDoutorado epd3;
        epd3 = (EstudanteDoutorado)epd2;
        System.out.println(epd3.getTituloTese());
        System.out.println(((EstudanteDoutorado)epd2).getTituloTese());
*/

/*
        eg2.print();
        System.out.println(eg2.getTituloTCC());

        ep2.print();
        System.out.println(ep2.getFormacao());

        epm2.print();
        System.out.println(epm2.getTituloDissertacao());

*/
        /*
        Estudante e2 = new Estudante();
        Estudante eg2 = new EstudanteGraduacao();
        Estudante ep2 = new EstudantePosGrad();
        Estudante epm2 = new EstudanteMestrado();
        Estudante epd2 = new EstudanteDoutorado();

        //EstudantePosGrad e3 = new Estudante();
        //EstudantePosGrad eg3 = new EstudanteGraduacao();
        */

        // polimorfismo com pós-graduação
        // construtor incompleto
        /*
        EstudantePosGrad ep3 = new EstudantePosGrad();
        EstudantePosGrad epm3 = new EstudanteMestrado();
        EstudantePosGrad epd3 = new EstudanteDoutorado();
        */



    }
}
