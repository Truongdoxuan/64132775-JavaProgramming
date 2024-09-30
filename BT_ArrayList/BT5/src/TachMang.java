/* Nhap so luong n phan tu co trong mang (n > 0):
Nhap vao gia tri 10 phan tu: 
List số lẻ: [1, 3, 5, 7, 9]
List số chẵn: [2, 4, 6, 8, 10] */
import java.util.ArrayList;
import java.util.Scanner;

public class TachMang {

	public static void main(String[] args) {
		//khai bao bien
		int n,a; //sl phan tu và gtri phan tu
		//khoi tao scanner nhạp du lieu
		Scanner scanner = new Scanner(System.in);
		
		//khoi tao ArrayList chua cac phan tu nhap vao
		ArrayList<Integer> arrayList = new ArrayList<>();
		
		do {
		    System.out.print("Nhap so luong n phan tu co trong mang (n > 0): ");
		    n = scanner.nextInt();
		} while (n <= 0);
		
		System.out.printf("Nhap vao gia tri %d phan tu: ",n);
		for(int i = 0; i < n; i++) {
			a = scanner.nextInt();
			arrayList.add(a);
		}
		
		//khoi tao 2 arraylist chua so le va so chan
		ArrayList<Integer> arrayListChan = new ArrayList<>();
		ArrayList<Integer> arrayListLe = new ArrayList<>();

		//duyet qa tung phan tu roi phan loai
		for(int i : arrayList) {
			if(i % 2 == 0) {
				arrayListChan.add(i);
			}
			else arrayListLe.add(i);
		}
		
		//in kq
		System.out.print("List số lẻ: ");
		System.out.println(arrayListLe);
		System.out.print("List số chẵn: ");
		System.out.println(arrayListChan);
		
		//dong scanner
		scanner.close();
		
	}

}
