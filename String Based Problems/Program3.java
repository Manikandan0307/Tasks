package string.problems.com;

import java.util.Scanner;

public class Program3 {

	static void Reverse(String str) {
		char[] a = str.toCharArray();
		int l = a.length;
		String Reverse = "";
		for (int i=0;i<l;i++) {
			Reverse =Reverse+a[l-1-i];
		}
		System.out.println(Reverse);
		}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the String:");
		String str = in.nextLine();
		Reverse(str);
		in.close();
		
	}

}
