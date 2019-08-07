package lauti;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test.
     */
    @Test
    public void checkOrdenTest() {
        Colectivo c1 = new Colectivo();
        c1.subeAlguien(50, 25, 12);
        assertTrue(c1.checkOrden());
    }

    @Test
    public void checOrdenTest2() {
        Colectivo c1 = new Colectivo();
        c1.subeAlguien(50, 25, 12);
        c1.subeAlguien(10, 5, 10);
        assertFalse(c1.checkOrden());
    }

    @Test
    public void checkSubida() {
        Colectivo c1 = new Colectivo();
        c1.subeAlguien(40, 20, 23);
        assertTrue(c1.getCantBoletos() == 3);
    }

    @Test
    public void checkBajada() {
        Colectivo c1 = new Colectivo();
        c1.bajaAlguien(1);
        assertTrue(c1.getCantBoletos() == 1);
    }
}
