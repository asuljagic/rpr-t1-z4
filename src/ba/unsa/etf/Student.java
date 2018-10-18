package ba.unsa.etf;

public class Student {
    private int brIndeksa;
    private String ime, prezime;

    public Student(int brIndeksa, String ime, String prezime) {
        this.brIndeksa = brIndeksa;
        this.ime = ime;
        this.prezime = prezime;
    }

    public int getBrIndeksa() {
        return brIndeksa;
    }

    public void setBrIndeksa(int brIndeksa) {
        this.brIndeksa = brIndeksa;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    @Override
    public String toString() {
        return "Student{" + "brIndeksa=" + brIndeksa + ", ime='" + ime + '\'' + ", prezime='" + prezime + '\'' + '}';
    }
}
