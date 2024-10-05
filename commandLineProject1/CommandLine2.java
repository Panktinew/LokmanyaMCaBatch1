package commandLineProject1;

public class CommandLine2 {

	public static void main(String[] args) {
		//javac pr1.java
		// java pr1 "hi" "hello"  56 78  
		
		double s = 0;
		for(int i=0  ; i< args.length ;  i++) {
			 
			System.out.println(args[i]);
			
			s = s+   Double.parseDouble(args[i]);
			
		}
		System.out.println(s);
		
		
		
	}

}
