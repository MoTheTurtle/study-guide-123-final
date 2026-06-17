import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

public class FinalPracticeTest {
    @Test
    void testOddIndexSum_oddLengthList() {
        ListNode list = new ListNode(4, new ListNode(8, new ListNode(15, new ListNode(16, new ListNode(23, new ListNode(42, new ListNode(11, new ListNode(29, new ListNode(34)))))))));
        int actual = FinalPractice.oddIndexSum(list);
        assertEquals(95, actual);
    }
    @Test 
    void testOddIndexSum_nulllist(){
        assertEquals(0, FinalPractice.oddIndexSum(null));
    }

    @Test
    void testOddIndexsumOneNode(){
        ListNode list= new ListNode(5);
        assertEquals(0, FinalPractice.oddIndexSum(list));
    }


    // TODO: Make more tests for oddIndexSum

    // TODO: Make thorough tests for ALL the questions on the study guide
}
