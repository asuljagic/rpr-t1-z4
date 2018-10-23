package ba.unsa.etf;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void getBrIndeksa() {
        Student s1 = new Student(17686,"Adnan","Suljagic");
        assertEquals(17686,s1.getBrIndeksa());
    }

    @Test
    void setBrIndeksa() {
        Student s1 = new Student(100,"Adnan","Suljagic");
        s1.setBrIndeksa(17686);
        assertEquals(17686,s1.getBrIndeksa() );
    }

    @Test
    void getIme() {
        Student s1 = new Student(17686,"Adnan","Suljagic");
        assertEquals("Adnan",s1.getIme() );
    }

    @Test
    void setIme() {
        Student s1 = new Student(17686,"Test","Suljagic");
        s1.setIme("Adnan");
        assertEquals("Adnan",s1.getIme() );
    }

    @Test
    void getPrezime() {
        Student s1 = new Student(17686,"Adnan","Suljagic");
        assertEquals("Suljagic",s1.getPrezime() );
    }

    @Test
    void setPrezime() {
        Student s1 = new Student(17686,"Adnan","Test");
        s1.setPrezime("Suljagic");
        assertEquals("Suljagic",s1.getPrezime() );
    }
}