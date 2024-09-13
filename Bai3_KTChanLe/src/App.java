import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// khai bao bien
		int x;
		// chuan bi cho nhap du lieu
		Scanner banPhim = new Scanner(System.in);
		
		// nhap du lieu
		System.out.print("Enter an integer: ");
		x = banPhim.nextInt();
		// ktra so chan le
		if (x % 2 == 0) {
			System.out.printf("%d is even",x);
		} else {
			System.out.printf("%d is odd",x);
		}
		

	}

}
