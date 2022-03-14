package C10Classes;

import java.util.Scanner;

public class ProfilUtilizator {



    String nume;
    String prenume;
    String email;
    String numarTelefon;
    int dataNasterii;
    String gen;

    public void initializeazaProfil(String numeNou, String prenumeNou, String emailNou, String numarTelefonNou, int dataNasteriiNoua, String genNou){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introdu un nume: ");
        nume = numeNou;
        nume = sc.nextLine();
        System.out.println("Introdu un prenume: ");
        prenume = prenumeNou;
        prenume = sc.nextLine();
        System.out.println("Introdu un email: ");
        email = emailNou;
        email = sc.nextLine();
        System.out.println("Introdu un numar de telefon: ");
        numarTelefon = numarTelefonNou;
        numarTelefon = sc.nextLine();
        System.out.println("Introdu data nasterii: ");
        dataNasterii = dataNasteriiNoua;
        dataNasterii = sc.nextInt();
        System.out.println("Introdu genul tau: ");
        gen = genNou;
        gen = sc.next();
    }

    public void actualizareEmail(String emailNou){
        email = emailNou;
    }

    public void actualizareNumarTelefon(String numarTelefonNou) {
        numarTelefon = numarTelefonNou;
    }

    public void  afisareVarsta(int an) {
        int varsta = dataNasterii - an;
        System.out.println("Varsta exacta este " + varsta);

    }
    public void afisareStareInterna() {
        System.out.println("Numele este " + nume +" ,prenumele este "
                +  prenume +" si are numarul " + numarTelefon
                +" cu e-mailul:"+ email + " si genul: " + gen );
    }


    public static void main(String[] args) {

        ProfilUtilizator profilStudent = new ProfilUtilizator();

        profilStudent.initializeazaProfil("Andrei","Ion","andrei@gmail.com","072323232",20041988,"Masculin");
        profilStudent.actualizareEmail("matei@ioan.gmail");
        profilStudent.actualizareNumarTelefon("087666098");
        profilStudent.afisareVarsta(2000);
        profilStudent.afisareStareInterna();

    }

}
