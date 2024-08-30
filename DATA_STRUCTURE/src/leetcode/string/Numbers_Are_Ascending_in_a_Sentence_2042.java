package leetcode.string;

public class Numbers_Are_Ascending_in_a_Sentence_2042 {
	
	public static void main(String[] args) {
        // Create an instance of the class containing the method
		Numbers_Are_Ascending_in_a_Sentence_2042 instance = new Numbers_Are_Ascending_in_a_Sentence_2042();

        // Test cases
        String test1 = "1 2 3 4"; // Expected: true
        String test2 = "1 2 2 3"; // Expected: false
        String test3 = "10 20 30"; // Expected: true
        String test4 = "5 1 8"; // Expected: false
        String test5 = "a 1 b 2 c 3"; // Expected: true (non-numeric values should be ignored)
        String test6 = "1 3 2 4"; // Expected: false

        // Call the method and print the results
        System.out.println("Test 1: " + test1 + " -> " + instance.areNumbersAscending(test1));
        System.out.println("Test 2: " + test2 + " -> " + instance.areNumbersAscending(test2));
        System.out.println("Test 3: " + test3 + " -> " + instance.areNumbersAscending(test3));
        System.out.println("Test 4: " + test4 + " -> " + instance.areNumbersAscending(test4));
        System.out.println("Test 5: " + test5 + " -> " + instance.areNumbersAscending(test5));
        System.out.println("Test 6: " + test6 + " -> " + instance.areNumbersAscending(test6));
    }

    public boolean areNumbersAscending(String s) {
        String[] arr = s.split(" ");
        int prev = Integer.MIN_VALUE; // Use a minimum value to handle the first comparison

        for (String str : arr) {
            try {
                int n = Integer.parseInt(str);
                if (n <= prev) {
                    return false;
                }
                prev = n;
            } catch (NumberFormatException e) {
                // Ignore non-numeric strings
            }
        }
        return true;
    }

}
