public class FindThirdMax {
    public int thirdMax(int[] nums) {
        long first = Long.MIN_VALUE, second = Long.MIN_VALUE, third = Long.MIN_VALUE;
        
        for (int num : nums) {
            if (num == first || num == second || num == third) continue; // Ignore duplicates
            
            if (num > first) { // New maximum found
                third = second;
                second = first;
                first = num;
            } else if (num > second) { // New second max found
                third = second;
                second = num;
            } else if (num > third) { // New third max found
                third = num;
            }
        }
        
        return third == Long.MIN_VALUE ? (int) first : (int) third;
    }
}
