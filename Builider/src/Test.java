
import org.junit.Before;
import org.junit.Before;

import static org.junit.Assert.*;


public class Test {
    Builder builder = new Gretta();
    Builder builder2 = new Excelo();
    Rower gretta ;
    Rower excelo;

    @Before
    public void setUp(){
        gretta = builder.getRower();
        excelo = builder2.getRower();
    }

    @org.junit.Test
    public void testNull(){
        assertNull(builder.getRower());
    }

    @org.junit.Test
    public void testMistake(){
        assertFalse(builder2.getRower()== gretta);
    }

    @org.junit.Test
    public void testGood(){
        assertTrue(builder.getRower() == gretta);
    }

}
