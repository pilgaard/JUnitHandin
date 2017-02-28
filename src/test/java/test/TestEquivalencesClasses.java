package test;

import main.MyCalendar;
import org.junit.*;
import static org.junit.Assert.*;

public class TestEquivalencesClasses {

    int month, year, expected;

    public TestEquivalencesClasses(){
    }
    
    @Test
    public void testMinMonth(){
        expected = 0;
        month = 0;
        year = 2000;
        assertTrue(expected == MyCalendar.getNumDaysinMonth(month, year));
    }
    
    @Test
    public void testMaxMonth(){
        expected = 0;
        month = 13;
        year = 2000;
        assertTrue(expected == MyCalendar.getNumDaysinMonth(month, year));
    }
    @Test
    public void testLowYears(){
        expected = 0;
        month = 1;
        year = -1;
        assertTrue(expected == MyCalendar.getNumDaysinMonth(month, year));
    }
    
    @Test
    public void testMaxYears(){
        expected = 0;
        month = 1;
        year = 2147483647+1;
        assertTrue(expected == MyCalendar.getNumDaysinMonth(month, year));
    }

    @Test
    public void testLeapYear(){
        expected = 29;
        month = 2;
        year = 4;
        assertTrue(expected == MyCalendar.getNumDaysinMonth(month, year));
    }
    
    @Test
    public void testNonLeapYear(){
        expected = 28;
        month = 2;
        year = 5;
        System.out.println("year = " + year);
        assertTrue(expected == MyCalendar.getNumDaysinMonth(month, year));
    }
}
