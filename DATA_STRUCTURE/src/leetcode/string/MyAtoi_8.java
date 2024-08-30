package leetcode.string;

public class MyAtoi_8 {
	
	public int myAtoi(String s) {
        int i = 0;
        int flag = 1; // Sign flag: 1 for positive, -1 for negative
        long val = 0; // Variable to store the numerical value
        
        // Skip leading whitespaces
        while(i < s.length() && s.charAt(i) == ' ') {
            i++;
        }

        // Check for optional sign
        if(i < s.length() && (s.charAt(i) == '-' || s.charAt(i) == '+')) {
            flag = s.charAt(i) == '-' ? -1 : 1;
            i++;
        }

        // Convert digits to integer
        while(i < s.length() && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
            val = val * 10 + (s.charAt(i) - '0');
            i++;

            // Handle overflow cases
            if(val * flag > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            if(val * flag < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
        }
        return (int) (val * flag); // Return the converted integer value
    }
	
	public static void main(String[] args) {
        // Creating an instance of the Solution class
		MyAtoi_8 solution = new MyAtoi_8();
        
        // Test cases
        String test1 = "42";
        String test2 = "   -42";
        String test3 = "4193 with words";
        String test4 = "words and 987";
        String test5 = "-91283472332";

        // Calling myAtoi method and printing the results
        System.out.println(solution.myAtoi(test1)); // Output: 42
        System.out.println(solution.myAtoi(test2)); // Output: -42
        System.out.println(solution.myAtoi(test3)); // Output: 4193
        System.out.println(solution.myAtoi(test4)); // Output: 0
        System.out.println(solution.myAtoi(test5)); // Output: -2147483648 (Integer.MIN_VALUE)
    }

}
