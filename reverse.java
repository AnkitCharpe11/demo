package reverseNumber;

public class reverse {
	public static void main(String[] args) {
		
		int num =121121, rev=0,digit, k=num;
		while(num!=0)
		{
			digit = num%10;
			rev= rev*10+digit;
			num=num/10;
			
		}
		System.out.println(rev);
		
		if(k==rev)
		{
			System.out.println("its a palindrome");
		}
		else
		System.out.println("not a palindrome");
	}

}
