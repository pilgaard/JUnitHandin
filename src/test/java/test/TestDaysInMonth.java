package test;

import java.util.Arrays;
import java.util.Collection;
import main.MyCalendar;
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class TestDaysInMonth {

    int month, year, expected;

    public TestDaysInMonth(int m, int y, int e){
        month = m;
        year = y;
        expected = e;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data(){
        return Arrays.asList(new Object[][] { {1,2017,31}, {12,2020,31},{4,2018,30}, {6,2016,30}, {2,2020,29}, {2,1900,28}});
    }

    @Test
    public void testDaysInMonth(){
        assert(expected == MyCalendar.getNumDaysinMonth(month, year));
    }

}
