# Lexicograph
import java.util.Scanner;
import java.util.TreeSet;

public class Lexicograph {

	
		public static void main(String[] args)
		{
			
		TreeSet<String> t=new TreeSet();
		String s[]=new String[3];
		Scanner sr=new Scanner(System.in);
		for(int i=0;i<s.length;i++){
			s[i]=sr.nextLine();
			t.add(s[i]);
		}
		for(String s1:t){
			System.out.println(s1);
		}
		       
		
		    }

	}
