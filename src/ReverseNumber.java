public class ReverseNumber {
public static void main(String[] args) {
	int no=702093;
	int rev=0,rem;
	while(no!=0)
	{
		rem=no%10;
		rev=rev*10+rem;
		no=no/10;
	}
	System.out.println("The reverse number is:  "+ rev);
}
}
