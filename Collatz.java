package ff;

import java.util.Scanner;

public class Collatz {
	public static void collatzseq(int number){
		while(number!=1) 
		{
			System.out.print(number+" ");
			if(number%2==0)
				{
				number/=2;
				}
			else
				{
				number=3*number+1;
				}
		
		}
		
		System.out.print(number+" ");
		
	}
public static void main(String args[]) {
	Scanner in=new Scanner(System.in);
	if(args.length>0) {
		
	
	int number=Integer.parseInt(args[0]);
	collatzseq(number);

	}else {
		System.out.println("no command line arguments");
	}
	
}


}
