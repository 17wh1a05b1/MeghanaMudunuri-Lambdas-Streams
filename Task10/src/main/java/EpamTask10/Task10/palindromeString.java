package EpamTask10.Task10;

import java.util.*;

public class palindromeString {
	interface palStr{
		public List<String> pal();
	}
	public static boolean findPal(String s) {
		int len = s.length();
		for(int i = 0; i < len/2; i++) {
			if(s.charAt(i) != s.charAt(len - i -1)) return false;
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		palStr p = () -> {
			System.out.println("Enter no.of strings: ");
			int num = sc.nextInt();
			List<String> s = new ArrayList<>();
			System.out.println("Enter the strings: ");
			int i;
			for(i=0;i<num;i++) {
				s.add(sc.next());
			}
			List<String> result = new ArrayList<>();
			for(i=0; i<s.size(); i++) {
				String str = s.get(i);
				if(findPal(str) == true)
					result.add(str);
			}
			return result;
		  };
	  System.out.println("Palindrome strings are: " +p.pal());
	}

}
