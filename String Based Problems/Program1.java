package string.problems.com;

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		String a;
		System.out.println("enter a string:");
		a = in.nextLine();
		count_of_string(a);
		in.close();
	}
	
	public static void count_of_string(String a) {
		char[] arr = a.toCharArray();
		int l = a.length();
		int Conscount =0;
		int vowcount =0;
		for(int i=0;i<l;i++) {
			if(arr[i] == 'a'|| arr[i] == 'e'|| arr[i]== 'i'||arr[i]=='o'||arr[i]=='u') {
				vowcount++;
			}else {
				Conscount++;
			}
		}
		System.out.println("no.of.vowels is:"+vowcount);
		System.out.println("no.of.consonents:"+Conscount);
	}

}
