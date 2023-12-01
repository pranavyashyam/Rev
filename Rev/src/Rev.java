import test.project.Rev;

public class Rev {
	private int number;
	public Rev()
	{
		System.out.println("Finding reverse");
	}
public Rev(int number)
{
	this();
	this.number=number;
	int rev = 0,rem;
	while(number!=0) {
		rem=number%10;
		rev=(rev*10)+rem;
		number=number/10;
	}
	System.out.println("reverse of  "+this.number  +"  is  "+rev);
}
public static void main(String args[])
{
	Rev r=new Rev(2453364);
	
}
}
