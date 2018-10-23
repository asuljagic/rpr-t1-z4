package ba.unsa.etf;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PredmetTest {

    @Test
    void getNazivPredmeta() {
        Predmet p = new Predmet("DM",120,100);
        assertEquals("DM",p.getNazivPredmeta());
    }

    @Test
    void setNazivPredmeta() {
        Predmet p = new Predmet("ASP",120,100);
        p.setNazivPredmeta("DM");
        assertEquals("DM",p.getNazivPredmeta());
    }

    @Test
    void getSifraPredmeta() {
        Predmet p = new Predmet("DM",120,100);
        assertEquals(120,p.getSifraPredmeta());
    }

    @Test
    void setSifraPredmeta() {
        Predmet p = new Predmet("DM",120,100);
        p.setSifraPredmeta(150);
        assertEquals(150,p.getSifraPredmeta());
    }

    @Test
    void getMaxBrStudenata() {
        Predmet p = new Predmet("DM",120,100);
        assertEquals(100,p.getMaxBrStudenata());
    }

    @Test
    void setMaxBrPredmeta() {
        Predmet p = new Predmet("DM",120,100);
        p.setMaxBrStudenata(200);
        assertEquals(200,p.getMaxBrStudenata());
    }
}