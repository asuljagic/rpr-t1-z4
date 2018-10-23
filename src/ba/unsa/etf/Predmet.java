package ba.unsa.etf;


import java.util.Arrays;
import java.util.stream.IntStream;

public class Predmet {
    public String nazivPredmeta;
    public int maxBrStudenata=10,sifraPredmeta;
    private Student[] niz_studenata = new Student[maxBrStudenata];

    private void porukaUpisan(){
        System.out.println("Student je uspjesno upisan na " + this.getNazivPredmeta());
    }
    private void porukaIspisan(){
        System.out.println("Studen je uspjesno ispisan sa " + this.getNazivPredmeta());
    }

    public String getNazivPredmeta() {
        return nazivPredmeta;
    }

    public void setNazivPredmeta(String nazivPredmeta) {
        this.nazivPredmeta = nazivPredmeta;
    }

    public int getSifraPredmeta() {
        return sifraPredmeta;
    }

    public void setSifraPredmeta(int sifraPredmeta) {
        this.sifraPredmeta = sifraPredmeta;
    }

    public int getMaxBrStudenata() {
        return maxBrStudenata;
    }

    public void setMaxBrStudenata(int maxBrStudenata) {
        this.maxBrStudenata = maxBrStudenata;
    }

    public Predmet() {
    }

    public Predmet(String nazivPredmeta, int sifraPredmeta, int maxBrPredmeta) {
        this.nazivPredmeta = nazivPredmeta;
        this.sifraPredmeta = sifraPredmeta;
        this.maxBrStudenata = maxBrPredmeta;
    }


    public void upisi(Student s){
        //dodatna provjera da li je upisan
            boolean upisan = false;
            for (int i = 0; i <niz_studenata.length ; i++) {
                if(niz_studenata[i] == s) upisan = true;
            }
            if(!upisan){
                 niz_studenata[niz_studenata.length - 1] = s;
                 Arrays.copyOf(niz_studenata,niz_studenata.length);
                porukaUpisan();
            }else{
                System.out.println("Student vec upisan");
            }
    }

    public void ispisi(Student s){
            boolean upisan = false;
            for (int i = 0; i <niz_studenata.length ; i++) {
                if(niz_studenata[i] == s) upisan = true;
            }
            if(!upisan){
                int indeks = Arrays.binarySearch(niz_studenata,s);
                for (int i = indeks; i < niz_studenata.length-1; i++) {
                    niz_studenata[i] = niz_studenata[i+1];
                }
                Arrays.copyOf(niz_studenata,niz_studenata.length-1);
                porukaIspisan();
            }else{
                System.out.println("Student nije upisan");
            }
    }
}
