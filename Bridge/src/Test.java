

import org.junit.Before;

import static org.junit.Assert.*;


public class Test {
    private RecyclerApplication app;
    ClientModule cm;

    @Before
    public void setUp(){
        cm = new ClientModule();
    }

    @org.junit.Test
    public void testNewObject(){
        app = new RecyclerApplication("","",new ClientModule());
        assertFalse(app.display == cm);
    }

    @org.junit.Test
    public void testcm(){
        app = new RecyclerApplication("","",cm);
        assertTrue(app.display == cm);
    }


    @org.junit.Test
    public void testNull(){
        app = new RecyclerApplication("","",null);
        assertFalse(app.display == cm);
    }


    @org.junit.Test
    public void testProducerModule(){
        app = new RecyclerApplication("","",new ProducerModule());
        assertFalse(app.display == cm);
    }


}
