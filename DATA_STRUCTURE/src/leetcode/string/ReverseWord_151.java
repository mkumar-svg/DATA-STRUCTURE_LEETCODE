package leetcode.string;

public class ReverseWord_151 {

	public static void main(String[] args) {
		String input = "the sky is blue";
		String reversed = reverseWord(input);
		
		System.out.println("Reversed words: "+ reversed);
	}
	
	public static String reverseWord(String s) {
		String result = "";
		for(int i = 0; i < s.length(); i++) {
			StringBuilder sb = new StringBuilder();
			while(i < s.length() && s.charAt(i) != ' ') {
				sb.append(s.charAt(i));
				i++;
			}
			if(sb.length() != 0) {
				result = " " + sb + result;
			}
		}
		return result.substring(1);
	}

}
