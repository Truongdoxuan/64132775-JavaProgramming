import java.util.ArrayList;
import java.util.Scanner;

public class ThaoTac_ArrayList {

	public static void main(String[] args) {
		int n, a; //sl phan tu và gtri trong mang

		//khoi tao mang
		ArrayList<Integer> arraylist = new ArrayList<Integer>();
		
		//thiet lap phuong thuc nhap
		Scanner scanner = new Scanner(System.in);
//		n = scanner.nextInt();
		do {
		    System.out.print("Nhap so luong n phan tu co trong mang (n > 0): ");
		    n = scanner.nextInt();
		} while (n <= 0);
		
		for(int i = 0; i < n; i++) {
			System.out.printf("Nhap phan tu thu %d: ",i+1);
			a = scanner.nextInt();
			arraylist.add(a);
		}
		
		//tim min max
		int max = arraylist.get(0);
	    for(int i = 1; i < n; i++) {
	    	if(arraylist.get(i) > max)
	    		max = arraylist.get(i);
	    }
	    int min = arraylist.get(0);
	    for(int i = 0; i < n; i++) {
	    	if(arraylist.get(i) < min)
	    		min = arraylist.get(i);
	    }
	    
	    //arraylist.size() == n
	    //tinh tong cac phan tu
	    int sum = 0;
	    for(int i : arraylist) {
	    	sum+= i;
	    }
		
		//in arraylist
	    System.out.print("ArrayList cua ban la: [");
		for(int i = 0; i < n; i++) {
		    System.out.print("\t"+arraylist.get(i));
		}
	    System.out.println(" ]");
		System.out.println("Phan tu max: "+max);
		System.out.println("Phan tu min: "+min);
		System.out.println("Tong: "+sum);
	    
		//dong scanner
		scanner.close();
	}

}
