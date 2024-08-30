package leetcode.string;

import java.util.HashMap;
import java.util.Map;

public class AnagramChecker_242 {

	public boolean isAnagram(String s, String t) {
		if(s.length() != t.length()) {
			return false;
		}
		
		Map<Character, Integer> freMap = new HashMap<>();
		
		for(char c : s.toCharArray()) {
			freMap.put(c, freMap.getOrDefault(c, 0) + 1);
		}
		
		for(char c : t.toCharArray()) {
			int count = freMap.getOrDefault(c, 0);
			if(count == 0) {
				return false;
			}
			freMap.put(c, count-1);
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		AnagramChecker_242 checker = new AnagramChecker_242();

        String s = "listen";
        String t = "silent";

        // Check if the strings are anagrams
        boolean result = checker.isAnagram(s, t);

        if (result) {
            System.out.println(s + " and " + t + " are anagrams.");
        } else {
            System.out.println(s + " and " + t + " are not anagrams.");
        }
	}

}
