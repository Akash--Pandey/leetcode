package pundeyJava;

public class ImplementIndexOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(strStr("mississippi", "mississippi"));
		 System.out.println(strStr("hello", "ll"));
		 System.out.println(strStr("a", "a"));
	}

	public static int strStr(String haystack, String needle) {
		int track = -1;
		int hayIndex = 0;
		if (needle.length() == 0) {
			return 0;
		}

		if (haystack.length() == 0 || needle.length() > haystack.length()) {
			return -1;
		}

		for (int i = 0; i <= haystack.length()-needle.length(); i++) {

			
			if(haystack.charAt(i) == needle.charAt(0)) {
				if(haystack.substring(i, i+needle.length()).equalsIgnoreCase(needle)) {
					track = i;
					return track;
				}
			}
		}
		return track;
	}

}
