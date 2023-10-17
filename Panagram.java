package assignment;

import java.util.Scanner;

public class Panagram {

		static boolean isPanagram(String s) {
			if(s.length()<26)
				return false;
			s=s.toLowerCase();
			for(char c='a';c<='z';c++) {
				if(s.indexOf(c)==-1)
					return false;
			}
			return true;
		}

		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			System.out.println("enter a string");
			String s = scan.nextLine();
			boolean res = isPanagram(s);
			if(res == true)
				System.out.println(s + " it is a panagram");
			else
				System.out.println(s + " it is not a panagram");
			scan.close();
		}


}
