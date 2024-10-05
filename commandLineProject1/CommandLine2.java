package commandLineProject1;

import java.util.List;

public class CommandLine2 {

	public static void main(String[] args) {
		//javac pr1.java
		// java pr1 "hi" "hello"  56 78  
		
		double s = -13.4;
		
		//condition ? True : False  --- short cut of if
		
		  String ans= s >0 ? "positive" : "negative";
		System.out.println(ans);

		
		
		 ans= s >0 ?  s%2==0 ? "Even" : "odd"      : "negative";
		   
		   
		   /*if(s >0) {
			System.out.println("positive");
		}
		else {
			System.out.println("negative");
			
		}*/
		
		
		
		for(int i=0  ; i< args.length ;  i++) {
			
			
			
			 
			System.out.println(args[i]);
			
			s = s+   Double.parseDouble(args[i]);
			
		}
		System.out.println(s);
		
		
	//	List<Integer> lst;
	}

}
