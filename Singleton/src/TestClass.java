
import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.*;

/**
 * Autor : Emilian Ossowski
 *
 * Testy jednostkowe sprawdzające czy niezainicjalizowane zmienne są nullami, oraz czy przypisując je do innych obiektów tworzymy nową instancje
 *
 * **/


    public class TestClass {
    Config cfg = Config.getConfig();
    Config [] cfg2 = new Config[3];

        @Before
        public void setUp(){

            cfg.about();

            cfg2[0] = Config.getConfig();
            cfg2[1] = Config.getConfig();
        }

        @Test
        public void testIsNotNull(){
            assertFalse(cfg2[0] == null);
        }

        @Test
        public void test2(){
            assertTrue(cfg2[0] == cfg);
        }


        @Test
        public void test1(){
            assertTrue(cfg2[1] == cfg);
        }


        @Test
        public void testIsNull(){
            assertNull(cfg2[2]);
        }


    }
