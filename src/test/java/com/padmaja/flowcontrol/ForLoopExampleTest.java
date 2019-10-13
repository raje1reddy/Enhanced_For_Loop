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
        ArrayList<String> expectedresult = new ArrayList<String>();
        expectedresult.add("java");
        expectedresult.add("loop");
        assertEquals(expectedresult,result);
    }
    @Test
    public void ForLoopExample12() {
        ArrayList <ArrayList<String>> result = forLoopExample.tablesExample1();
        System.out.println("result of tablesExample1"+ result);
        ArrayList <String> exams = new ArrayList<String>();
        exams.add("java");
        exams.add("oracle");
        ArrayList <String> levels = new ArrayList<String>();
        levels.add("basic");
        levels.add("advanced");
        ArrayList <String> grade = new ArrayList<String>();
        grade.add("pass");
        grade.add("fail");
       ArrayList <ArrayList<String>>  expectedresult = new ArrayList<ArrayList<String>>();
    expectedresult.add(exams);
    expectedresult.add(levels);
    expectedresult.add(grade);
        assertEquals(expectedresult,result);
    }

    @Test
    public void ForLoopExample15() {
        ArrayList<String> result = forLoopExample.tablesExample();
        System.out.println("result of tablesExample" + result);
        ArrayList<String> expectedresult1=new ArrayList<String>();
        expectedresult1.add("java");
        expectedresult1.add("loop");
       assertEquals(expectedresult1,result);
    }
}



