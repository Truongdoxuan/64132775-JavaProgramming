/*Enter the number of items:  3
Enter the value of all items (separated by space):  1 2 3
The values are: [1, 2, 3] */

import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		//khai bao scanner de nhap vao tu ban phim
		Scanner scanner = new Scanner(System.in);
		
		//nhap so luong phan tu trong mang
		System.out.print("Enter the number of items:  ");
		int n = scanner.nextInt();
		
		//khoi tao mang
		int[] array = new int[n];
		if (n > 0) {
			System.out.print("Enter the value of all items (separated by space):  ");
			for (int i = 0; i < n; i++) {
				array[i] = scanner.nextInt();
			}
			
			//hien thi mang
			System.out.print("The values are: [");
			for(int i = 0; i < n; i++) {
				System.out.print(array[i]);
				if(i < n - 1) {
					System.out.print(", ");
				}
			}
			System.out.print("]");
		}else {
			System.out.println("The values are: []");
		}
		//dong scanner
		scanner.close();
	}
}
