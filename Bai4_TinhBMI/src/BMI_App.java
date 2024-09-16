import java.util.Scanner;

public class BMI_App {

	public static void main(String[] args) {
		// khai bao bien
		float chieucao, cannang, bmi;
		
		//set up nhap du lieu
		Scanner banPhim = new Scanner(System.in);
		
		//nhap du lieu
		while (true) {
			System.out.print("Nhap chieu cao(m): ");
			
		try {
			chieucao = banPhim.nextFloat();
			if (chieucao > 0 && chieucao < 200) {
				break;
			} else {
				System.out.print("Yeu cau so trong khoang [0-200]\n");
			}
			
		} catch (Exception e) {
			System.out.print("Yeu cau so trong khoang [0-200]\\n");
			banPhim.nextLine();
			}
		} 
//		System.out.println("Nhap chieu cao: ");
//		chieucao = banPhim.nextFloat();
		
		while (true) {
			System.out.print("Nhap can nang (kg): ");
			
		try {
			cannang = banPhim.nextFloat();
			if (cannang > 0 && cannang < 200) {
				break;
			} else {
				System.out.print("Yeu cau so trong khoang [0-200]\n");
			}
				
		} catch (Exception e) {
			System.out.print("Yeu cau so trong khoang  [0-200]\n");
			banPhim.nextLine();
			}
		} 
		
		//tinh bmi
		bmi = cannang / (chieucao * chieucao);
		
		//xuat ket qua
		if (bmi < 18.5) {
			System.out.println("Ban thieu can");
		} 
		else if (bmi >= 18.5 && bmi < 25.0) {
			System.out.println("Ban binh thuong");
		}
		else if (bmi >= 25.0 && bmi < 30.0) {
			System.out.println("Ban thua can");
		}
		else System.out.println("Ban beo phi");
	}

}
