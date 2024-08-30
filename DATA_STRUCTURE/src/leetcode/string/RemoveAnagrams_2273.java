package leetcode.string;

import java.util.*;

public class RemoveAnagrams_2273 {
	
	public List<String> removeAnagrams(String[] words) {
		String prev = "";
		List<String> list = new ArrayList<>();
		for(int i = 0; i < words.length; i++) {
			char[] ch = words[i].toCharArray();
			Arrays.sort(ch);
			String curr = String.valueOf(ch);
			if(!curr.equals(prev)) {
				list.add(words[i]);
				prev = curr;
			}
		}
		return list;
	}

	public static void main(String[] args) {
		String[] words = {"abba", "baba", "bbaa", "cd", "cd"};
        
        // Creating an instance of the Main class to call the removeAnagrams method
		RemoveAnagrams_2273 obj = new RemoveAnagrams_2273();
        List<String> result = obj.removeAnagrams(words);

        // Printing the output list
        System.out.println(result);

	}

}
