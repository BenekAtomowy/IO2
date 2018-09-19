

import org.junit.Before;


import static org.junit.Assert.*;
/**
 * Autor : Emilian Ossowski
 *
 * Testy jednostkowe utworzone dla implementacji wzorca projektowego Builder
 *
 * Utworzone testy jednostkowe
 *
 * testNull - sprawdzaczy jeżeli nie stworzymy obiektu to dostaniemy null w metodzie getRower().
 * testMistake - sprawdza czy builder budujący inny obiekt zwraca inny obiekt
 * testGood - sprawdza czy builder zwraca dobry obiekt
 * **/

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
        assertTrue(builder2.getRower()== gretta);
    }

    @org.junit.Test
    public void testGood(){
        assertTrue(builder.getRower() == gretta);
    }

}
