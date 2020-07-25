package EpamTask10.Task10;

import java.util.*;
import java.util.function.Consumer;

public class wordWithA {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the strings: ");
		String s =  sc.nextLine();
		System.out.println("Strings starting with 'a' are: ");
		String str[] = s.split(" ");
		List<String> al = Arrays.asList(str);
		Aletters(al, (String result)-> System.out.print(result+" "));
	}
	public static void Aletters(List<String> l, Consumer<String> c) {
		for(String i : l) {
			if(i.charAt(0) == 'a' && i.length()==3) {
				c.accept(i);
			}
		}
	}
}