package com.padmaja.flowcontrol;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;

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
        ArrayList<String> result = forLoopExample.tablesExample();
        System.out.println("result of tablesExample" + result);
        ArrayList<String> expectedresult = result;
        //expectedresult.add("java, loop");
        System.out.println("expected result"+ expectedresult);
        assertEquals(expectedresult,result);
    }
    @Test
    public void ForLoopExample12() {
        ArrayList<String> result = forLoopExample.tablesExample1();
        System.out.println("result of tablesExample1"+ result);
        ArrayList<String> expectedresult = result ;
        assertEquals(expectedresult,result);
    }

    @Test
    public void ForLoopExample15() {
        ArrayList<String> result = forLoopExample.tablesExample();
        System.out.println("result of tablesExample" + result);
        ArrayList<String> expectedresult1;
     //   assertEquals(expectedresult1,result);
    }
}



