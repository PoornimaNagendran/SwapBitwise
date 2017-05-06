package guvipractise;
import java.util.Scanner;
public class SwapBitwise {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("Swap using bitwise operator");
System.out.println("Enter numbers");
int a=s.nextInt();
int b=s.nextInt();
System.out.println("Before swapping");
System.out.println(a+"\n"+b);
a=a^b;
b=a^b;
a=a^b;
System.out.println("After swapping");
System.out.println(a+"\n"+b);
	}

}
