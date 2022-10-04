package ybr.basics;
import java.util.*;
public class Exercise2 {
public static void main(String[] args) {
		int i, n;
		System.out.println("Input the number (Table to be calculated):   ");
		{
		System.out.println("Input number of terms: ");
		Scanner in = new Scanner(System.in);
			n = in.nextInt();
			System.out.println("\n");
			for (i = 0; i <= n; i++) {
				System.out.println(n + "*" + i + "=" + n * i);
			}
			in.close();
		}
	}
}
