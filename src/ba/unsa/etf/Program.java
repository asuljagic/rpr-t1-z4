package ba.unsa.etf;

import java.util.Arrays;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner ulaz = new Scanner(System.in);
        Predmet[] predmeti = new Predmet[5];
        predmeti[0] = new Predmet("ASP", 123, 100);
        predmeti[1] = new Predmet("DM", 124, 100);
        predmeti[2] = new Predmet("SP", 125, 100);
        predmeti[3] = new Predmet("RPR", 126, 100);
        predmeti[4] = new Predmet("OBP", 127, 100);
        Student[] studenti = new Student[5];
        int unos;
        do
        {
            System.out.println("Opcije:\n1.Unos studenata\n2.Upis Studenta na predmet\n3.Ispis studenta sa predmeta\n4.Izlaz");
             unos = ulaz.nextInt();
            switch (unos)
            {
                case 1:
                    System.out.println("Unesite ime studenta: ");
                    String ime = ulaz.next();
                    System.out.println("Unesite prezime studenta: ");
                    String prezime = ulaz.next();
                    System.out.println("Unesite indeks studenta: ");
                    int indeks = ulaz.nextInt();
                    studenti[studenti.length - 1] = new Student(indeks, ime ,prezime);
                    Arrays.copyOf(studenti, studenti.length);
                    System.out.println("Uspjesno ste unijeli studenta " + ime + " " + prezime + ", sa brojem indeksa: " + indeks);
                    break;
                case 2:
                    Predmet izabraniPredmet=new Predmet();
                    System.out.println("Birajte predmet unosom sifre:");
                    int sifra = ulaz.nextInt();
                    for (Predmet p : predmeti)
                    if (p.sifraPredmeta == sifra) izabraniPredmet = p;
                    //OVDJE MOZE BITI I IZBOR IZMEDJU VEC UPISANIH STUDENATA ALI MRSKO MI
                    System.out.println("Unesite ime studenta: ");
                    String ime2 = ulaz.next();
                    System.out.println("Unesite prezime studenta: ");
                    String prezime2 = ulaz.next();
                    System.out.println("Unesite indeks studenta: ");
                    int indeks2 = ulaz.nextInt();
                    Student st = new Student(indeks2, ime2, prezime2);
                    studenti[studenti.length - 1] = st;
                    Arrays.copyOf(studenti, studenti.length);
                    //BITNA LINIJA
                    izabraniPredmet.upisi(st);
                    break;
                case 3:
                    Predmet izabraniPredmet2=new Predmet();
                    System.out.println("Birajte predmet unosom sifre:");
                    int sifra2 = ulaz.nextInt();
                    for (Predmet p : predmeti)
                        if (p.sifraPredmeta == sifra2) izabraniPredmet2 = p;
                    //OVDJE MOZE BITI I IZBOR IZMEDJU VEC UPISANIH STUDENATA ALI MRSKO MI
                    System.out.println("Unesite ime studenta: ");
                    String ime3 = ulaz.next();
                    System.out.println("Unesite prezime studenta: ");
                    String prezime3 = ulaz.next();
                    System.out.println("Unesite indeks studenta: ");
                    int indeks3 = ulaz.nextInt();
                    Student st2 = new Student(indeks3, ime3, prezime3);
                    studenti[studenti.length - 1] = st2;
                    Arrays.copyOf(studenti, studenti.length);
                    //BITNA LINIJA
                    izabraniPredmet2.ispisi(st2);
                    break;
                case 4:
                    System.out.println("Ugodan dan");
                    break;
            }
        } while (unos != 4);
    }
}
