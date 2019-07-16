package ff;

import java.util.Scanner;

public class perfect {public static void main(String args[]) 
{
	Scanner in=new Scanner(System.in);
	
	int m=in.nextInt();
	int res=CalcPerf(m);
	if(res==m)System.out.println("Perfect");
	else System.out.println("Not Perfect");
}

public static int CalcPerf(int m) {
int s=1;
	for(int i=2; i<Math.sqrt(m); i++) {
		if(m%i==0)s=s+i+m/i;
		
	}return s;
}
}
