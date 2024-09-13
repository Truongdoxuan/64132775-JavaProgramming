import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// Khai báo biến
		int a, b, tong;
		// Chuẩn bị cho nhập dữ liệu
		Scanner banPhim = new Scanner(System.in);
							//System.in đại diện cho thiết bị 
							//nhập chuẩn (Bàn phím)
		//Nhập dữ liệu
			//-in HD cho User
		System.out.println("---CT TINH TONG 2 SO NGUYEN---");
		System.out.print("Nhap a = ");
			//đợi User nhập lấy dữ liệu cất vào biến a
		a = banPhim.nextInt();
		System.out.print("Nhap b = ");
		//đợi User nhập lấy dữ liệu cất vào biến a
		b = banPhim.nextInt();
		
		//tính tổng
		tong = a + b;
		
		//xuất kết quả
		System.out.printf("Tong = " + tong);
	} //end of class

}
