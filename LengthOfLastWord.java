package pundeyJava;

public class LengthOfLastWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(lengthOfLastWord("b   a    "));
	}

	public static int lengthOfLastWord(String s) {
		int length = 0;
		boolean isMultipleWords = false;
		s=s.trim();
		System.out.println(s);
		if(s.length() == 0) {
			return 0;
		}
		for(int i = s.length()-1; i>=0;i--) {
			System.out.println("'"+s.charAt(i)+"'");
			if(s.charAt(i) == ' ') {
				length = s.length() - i - 1;
				isMultipleWords = true;
				break;
			}
		}
		
		return isMultipleWords ? length : s.length();
	}

}
