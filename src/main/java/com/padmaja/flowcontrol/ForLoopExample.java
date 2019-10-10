package com.padmaja.flowcontrol;
import java.lang.String;
import java.util.ArrayList;

public class ForLoopExample {
    public  ArrayList<String> tablesExample() {
        ArrayList <String> mylist = new ArrayList<String>();
        mylist.add("java");
        mylist.add("loop");
        for(String val: mylist)
            System.out.println(val);
        return mylist;
        }
    public  ArrayList<String> tablesExample1() {
        ArrayList <String> exams = new ArrayList<String>();
        exams.add("java");
        exams.add("oracle");
        ArrayList <String> levels = new ArrayList<String>();
        levels.add("basic");
        levels.add("advanced");
        ArrayList <String> grade = new ArrayList<String>();
        grade.add("pass");
        grade.add("fail");
    ArrayList <ArrayList<String>>  nestedArrayList = new ArrayList<ArrayList<String>>();
    nestedArrayList.add(exams);
    nestedArrayList.add(levels);
    nestedArrayList.add(grade);
    for(ArrayList<String> nestedListedElement : nestedArrayList)
        for(String element: nestedListedElement)
           System.out.println(element);
    return tablesExample();
    }

}


