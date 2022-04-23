import java.util.Scanner;
public class HelloWorld {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numbers : ");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		if((a<1)&&(a>0)&&(b<1)&&(b>0)){
			System.out.println("True");
		}
		else{
			System.out.println("False");
		}
	}

}
