import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestCalcolatrice {

    Calcolatrice calcolatrice;

    @Before

    public final void setUp(){
        calcolatrice=new Calcolatrice();
    }

    @Test
    public void testSomma(){
        assertTrue(calcolatrice.somma(11,1)==12, "somma corretta");
    }

    @Test
    public void testMoltiplicazione(){
        assertTrue(calcolatrice.moltiplicazione(10,2)==20, "moltiplicazione corretta");
    }

    @Test
    public void testSottrazione(){
        assertTrue(calcolatrice.sottrazione(5,3)==2, "sottrazione corretta");
    }

    @Test
    public void testDivisione(){
        assertTrue(calcolatrice.divisione(10,2)==5, "divisione corretta");
    }

    @Test
    public void testDivisionePerZero(){
        assertTrue(calcolatrice.divisione(10,0)==0, "divisione corretta");
    }
}
