/* Enter the number of items:  
Enter the value of all items (separated by space):  
0: *******(7) 
1: ****(4) 
2: ***(3) 
3: (0) 
4: *******(7) */
import java.util.Scanner;
public class Print_Array_Stars {

	public static void main(String[] args) {
		//khai bao scanner
		Scanner scanner = new Scanner(System.in);
		
		//nhap so luong phan tu
		System.out.print("Enter the number of items: ");
		int n = scanner.nextInt();
		
		//khoi tao mang
		int[] array = new int[n];
		
		//nhap gia tri phan tu
		System.out.print("Enter the value of all items (separated by space):  ");
		for (int i = 0; i < n; i++) {
			array[i] = scanner.nextInt();
		}
		
		//in sao
		for (int idx = 0; idx < n; idx++) { 
	         System.out.print(idx + ": ");
	         // Print value as the number of stars
	         for (int starNo = 1; starNo <= array[idx]; starNo++) {  
	            System.out.print("*");
	         }
	         System.out.printf("(%d)",array[idx]);
	         System.out.println("\n");
	      }
		//dong scanner
				scanner.close();
	}

}
