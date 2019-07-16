package ff;

public class fizz
{
public static void main(String args[])
{ fizz k=new fizz();
	for(int i=1; i<=100; i++)
	{
		if(i%3==0&& i%5==0)k.fifteen(i);
		else if(i%3==0)k.three(i);
		else if(i%5==0)k.five(i);
		else System.out.print(i+" ");
		
	}
}
public void three(int m) {
	System.out.print("Fizz ");
}
public void five(int m) {
	System.out.print("Buzz ");
}
public void fifteen(int n)
    {
	
		System.out.print("Fizzbuzz");
	}
}

