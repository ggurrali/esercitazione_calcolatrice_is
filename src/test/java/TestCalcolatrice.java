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
}
