package leetcode.string;

import java.util.*;

public class AnagramFinder_438 {
	
	public List<Integer> findAnagrams(String s, String p) {
		List<Integer> ans = new ArrayList<>();
		int n = s.length();
		int m = p.length();
		
		if(m > n) {
			return ans;
		}
		
		int[] arrs = new int[26];
		int[] arrp = new int[26];
		for(int i = 0; i < m; i++) {
			arrs[s.charAt(i)-'a']++;
			arrp[p.charAt(i)-'a']++;
		}
		
		for(int i = 0; i <= n-m; i++) {
			if(isEqual(arrs, arrp)) {
				ans.add(i);
			}
			
			arrs[s.charAt(i)-'a']--;
			if(i+m < n) {
				arrs[s.charAt(i+m)-'a']++;
			}
		}
		return ans;
	}
	
	public boolean isEqual(int[] arrs, int[] arrp) {
		for(int j = 0; j < 26; j++) {
			if(arrs[j] != arrp[j]) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		AnagramFinder_438 af = new AnagramFinder_438();
		String s = "cbaebabacd";
        String p = "abc";
        
     // Find all start indices of p's anagrams in s
        List<Integer> result = af.findAnagrams(s, p);
        
        // Print the result
        System.out.println("Anagram indices: " + result);
	}

}
