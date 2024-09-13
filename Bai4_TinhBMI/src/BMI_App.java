import java.util.Scanner;

public class BMI_App {

	public static void main(String[] args) {
		// khai bao bien
		float chieucao, cannang, bmi;
		
		//set up nhap du lieu
		Scanner banPhim = new Scanner(System.in);
		
		//nhap du lieu
		System.out.println("Nhap chieu cao: ");
		chieucao = banPhim.nextFloat();
		System.out.println("Nhap can nang: ");
		cannang = banPhim.nextFloat();
		
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
