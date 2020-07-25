package EpamTask10.Task10;

import java.util.*;
import java.util.function.Consumer;

public class averageNumb {
	public static void  avgRes(List<Integer> l, Consumer<Integer> c) {
		int sum = 0;
		for(int i : l) {
			sum = sum + i;
		}
		c.accept(sum);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no.of elements: ");
		int num = sc.nextInt();
		System.out.println("Enter the numbers: ");
		ArrayList<Integer> al = new ArrayList<Integer>();
		int i;
		for(i = 0; i < num; i++) {
			al.add(sc.nextInt());
		}
		avgRes(al, (Integer n) -> System.out.println("Average is: "+ (n / (float)num)));
	}
}
