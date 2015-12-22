package com.coolzeze;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by coolzeze on 12/21/2015 021.
 */
public class MainTest {
    private Main main;

    @Before
    public void setUp() throws Exception {
        main = new Main();
    }

    @After
    public void tearDown() throws Exception {
        main = null;
    }

    @Test
    public void testAdd() throws Exception {
        assertEquals(main.add(2, 4), 6);
        assertNotEquals(main.add(3, 3), 9);
    }


    @Test
    public void testMinus() throws Exception {

    }

    @Test
    public void testMultiply() throws Exception {

    }
}