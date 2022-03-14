package C10Classes;

public class Casa {

    int persoana;
    int suprafata;
    String culoare;
    int capacitate;
    int numarBai;


    public void definesteSuprafata(int suprafataNoua){
        suprafata = suprafataNoua;
    }

    public void modificaCapacitatea(int capacitateNoua){
        capacitate = capacitateNoua;
    }

    public void verificaNumbarBai( int numarBaiCasa){
        numarBai=numarBaiCasa;
    }

    public void printObjectState(){
        System.out.println("Casa are o suprafata de: " + suprafata + " mp2");
        System.out.println("In aceasta case de " + suprafata + " mp2 pot locui un numar de " + capacitate + " persoane" );
        System.out.println("Casa are 4 dormitoare si un numar de " + numarBai + " bai");
        System.out.println("In ceasta casa de culoare " + culoare + " incap un numar de " + persoana + " persoane");
    }



    public static void main(String [] args) {

        Casa casaNoua = new Casa();
        casaNoua.culoare = "Verde";
        casaNoua.numarBai = 2;
        casaNoua.capacitate = 232;
        casaNoua.suprafata = 32;
        casaNoua.persoana = 5;

        casaNoua.printObjectState();
    }
}
