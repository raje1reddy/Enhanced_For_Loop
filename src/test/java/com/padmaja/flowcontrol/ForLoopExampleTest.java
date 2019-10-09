package com.padmaja.flowcontrol;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;
public class ForLoopExampleTest {
    private ForLoopExample forLoopExample;
    @BeforeClass
    public static void setUpClass()
    {
        System.out.println("set up class");
        // ForLoopExample forLoopExample = new ForLoopExample();
    }
    @Before
    public void setUp(){
        forLoopExample = new ForLoopExample();
    }

    @After
    public void tearDown(){
        System.out.println("tear down");
        forLoopExample = null;
    }

    @Test
    public void ForLoopExample1() {
        int result = forLoopExample.tablesExample();
        System.out.println(result);
        int expectedresult = 0;
        assertEquals(expectedresult,result);
    }
    @Test
    public void ForLoopExample12() {
        int result = forLoopExample.tablesExample1();
        System.out.println(result);
        int expectedresult = 1;
        assertEquals(expectedresult,result);
    }

    @Test
    public void ForLoopExample15() {
        int result = forLoopExample.tablesExample();
        System.out.println(result);
        int expectedresult = 0;
        assertEquals(expectedresult,result);
    }
}



