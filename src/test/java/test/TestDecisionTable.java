package test;

import java.util.Arrays;
import java.util.Collection;
import main.DecisionTable;
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class TestDecisionTable {

    boolean deduction;
    String type;
    int expected;

    public TestDecisionTable(boolean d, String t, int e) {
        deduction = d;
        type = t;
        expected = e;
    }

    

    @Parameterized.Parameters
    public static Collection<Object[]> data(){
        return Arrays.asList(new Object[][] { {true,"Doctor",50}, {true,"Hospital",80},{false,"Doctor",0}, {false,"Hospital",0}, {true,"Something",0}, {false,"Something",0}});
    }

    @Test
    public void testTable(){
        assert(expected == DecisionTable.calcReimbursement(deduction, type));
    }

}