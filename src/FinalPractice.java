public class FinalPractice {
    public static void main(String[] args) {
        // Feel free to call your methods here to experiment

        // YOU MUST ALSO MAKE THOROUGH TESTS FOR EVERY METHOD 
    }

    /**
     * Return the sum of the values at odd indexes in a linked list.
     * 
     * Assumes head is at index 0.
     * 
     * If passed a null head, returns 0.
     * 
     * @param head the head of the linked list
     * @return the sum of the values at odd indexes
     */
    public static int oddIndexSum(ListNode head) {
        int total = 0;
        int x = 0;

        while(head != null){
            if(x%2==1){
                total += head.data;
            }

            head = head.next;
            x++;
        }
        return total;
    }

    
}
