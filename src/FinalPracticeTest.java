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

    @Test
    void testLargest3only3nodes(){
        ListNode list = new ListNode(5, new ListNode(30, new ListNode(10))); 
        assertEquals(30, FinalPractice.largest3(list));
    }

    @Test
    void testLargest3Negative(){
        ListNode list = new ListNode(-10, new ListNode (-20, new ListNode (-5, new ListNode (-8, new ListNode (-15)))));
        assertEquals(-5, FinalPractice.largest3(list)); 
    }

    @Test 
    void testLargest3FirstofLast(){
        ListNode list = new ListNode(10, 
                        new ListNode (20, 
                        new ListNode (40, 
                        new ListNode (15, 
                        new ListNode (8)))));
        assertEquals(40, FinalPractice.largest3(list)); 
    }
    @Test 
    void testEvenSumSingle(){
        TreeNode root = new TreeNode(8);

        assertEquals(8, FinalPractice.evenSumLeaf(root));
    }




    // TODO: Make more tests for oddIndexSum

    // TODO: Make thorough tests for ALL the questions on the study guide
}
