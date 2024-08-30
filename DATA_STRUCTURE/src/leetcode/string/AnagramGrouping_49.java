package leetcode.string;

import java.util.*;

public class AnagramGrouping_49 {
	
	public List<List<String>> groupAnagrams(String[] strs) {
		if(strs == null || strs.length == 0) {
			return new ArrayList<>();
		}
		
		Map<String, List<String>> freqMap = new HashMap<>();
		for(String str : strs) {
			String freqString = getFreqString(str);
			
			if(freqMap.containsKey(freqString)) {
				freqMap.get(freqString).add(str);
			} else {
				List<String> strList = new ArrayList<>();
				strList.add(str);
				freqMap.put(freqString, strList);
			}
		}
		
		return new ArrayList<>(freqMap.values());
	}
	
	private String getFreqString(String str) {
		int[] freq = new int[26];
		
		for(char ch : str.toCharArray()) {
			freq[ch-'a']++;
		}
		
		StringBuilder sb = new StringBuilder("");
		char c = 'a';
		for(int i : freq) {
			sb.append(c);
			sb.append(i);
			c++;
		}
		
		return sb.toString();
	}

	public static void main(String[] args) {
		AnagramGrouping_49 ag = new AnagramGrouping_49();
        String[] input = {"eat", "tea", "tan", "ate", "nat", "bat"};
        
        List<List<String>> result = ag.groupAnagrams(input);
        
        for(List<String> group : result) {
        	System.out.println(group);
        }
	}

}
