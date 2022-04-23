import java.util.Scanner;
public class HelloWorld {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numbers : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		if((a==b)&&(a==c)&&(a==d)){
			System.out.println("Equal");
		}
		else{
			System.out.println("Not Equal");
		}
	}

}
