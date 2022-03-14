package C10Classes;

public class Avion {
    int scaune;
    String culoare;
    String model;
    int numarAvion;
    int combustibil;


    public void alimenteazaAvion (int combustibilNou) {
       combustibil = combustibilNou;
    }

    public void vopsesteAvion(String culoareNoua) {
        culoare = culoareNoua;
    }

    public void adaugaScane(int scauneNoi){
        scaune = scauneNoi;
    }

    public void printObjectState() {
        System.out.println("Avionul Boeing737 de culoare "
                + culoare + " aterizeaza astazi.");
        System.out.println("Astazi cel mai vechi avion din flota are culoarea "
                + culoare);
        System.out.println("Avionul cumparat ieri are "
                + scaune + " scaune si consuma " + combustibil + " la 100 km");
    }

    public void initializeState(String culoare, int scaune, String model, int numarAvion, int combustibil){


    }

    public static void main(String[] args) {


        Avion avionNou = new Avion();

        avionNou.culoare = "rosu";
        avionNou.combustibil = 232;
        avionNou.model = "Boeing";
        avionNou.numarAvion = 737;

        avionNou.printObjectState();
    }
    }


