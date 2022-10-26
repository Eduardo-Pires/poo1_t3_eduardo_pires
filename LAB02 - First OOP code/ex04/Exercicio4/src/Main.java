public class Main {
    public static void main(String[] args) {
        String[] names =new String[] {"Aaran", "Aaren", "Aarez", "Aarman", "Aaron", "Aaron-James", "Aarron", "Aaryan", "Aaryn", "Aayan", "Aazaan", "Abaan", "Abbas", "Abdallah", "Abdalroof", "Abdihakim", "Abdirahman", "Abdisalam", "Abdul", "Abel", "Abhinav", "Abhisumant", "Abid", "Abir", "Abraham", "Abu", "Abubakar", "Ace", "Adain", "Adam", "Adam-James", "Addison", "Addisson", "Adegbola", "Adegbolahan"};
        Selecao[] selecta = new Selecao[2];

        for(int i = 0; i < 2; i++)
        {
                selecta[i] = new Selecao();
                selecta[i].nomeSelecao = names[i];
                selecta[i].nometecnico = names[i+1];
                selecta[i].Titular1 = names[i+2];
                selecta[i].Titular2 = names[i+3];
                selecta[i].Titular3 = names[i+4];
                selecta[i].Titular4 = names[i+5];
                selecta[i].Titular5 = names[i+6];
                selecta[i].Titular6 = names[i+7];
                selecta[i].Titular7 = names[i+8];
                selecta[i].Titular8 = names[i+9];
                selecta[i].Titular9 = names[i+10];
                selecta[i].Titular10 = names[i+11];
                selecta[i].Titular11 = names[i+12];

        }


    }
}