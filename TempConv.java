package ff;
import java.util.Scanner;
public class TempConv {
	public static void main(String[] args)
	{
		//Scanner in=new Scanner(System.in);
		int cf,tempreture;
        if (args.length > 0) 
        { 
        	
        	 cf= Integer.parseInt(args[0]);
        	 tempreture=Integer.parseInt(args[1]);
        	
		System.out.println( conversion(cf,tempreture));
        }
        else
        	 System.out.println("No command line "+ 
                     "arguments found."); 
	}

	public static String conversion(int argsnum,int tempreture) {
		String result ;
		if(argsnum==0)
		{
			result =CeltoFar(tempreture)+" F";
		}
		else{
			result =FartoCel(tempreture)+" C";
		}
		return result;
		
	}
	public static int CeltoFar(int temp) {
		
		temp=(9*temp)/5+32;
		return temp;
		
	}
	public static int FartoCel(int temp) {
		
		temp=(temp-32)*5/9;
		return temp;
	}

}
