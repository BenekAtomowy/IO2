
/**
 * Autor : Emilian Ossowski
 *
 * Testy jednostkowe które sprawdzające klasę ClientModule i Producer Module, czy przypisanie odpowiedniej klasy powoduje wyświetlenie jej winterfejsie
 *
 * **/

import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.*;


public class TestClass {
    private RecyclerApplication app;
    ClientModule cm;

    @Before
    public void setUp(){
        cm = new ClientModule();
    }

    @Test
    public void testNewObject(){
        app = new RecyclerApplication("","",new ClientModule());
        assertFalse(app.display == cm);
    }

    @Test
    public void testcm(){
        app = new RecyclerApplication("","",cm);
        assertTrue(app.display == cm);
    }


    @Test
    public void testNull(){
        app = new RecyclerApplication("","",null);
        assertTrue(app.display == null);
    }


    @Test
    public void testProducerModule(){
        app = new RecyclerApplication("","",new ProducerModule());
        assertFalse(app.display == cm);
    }


}
