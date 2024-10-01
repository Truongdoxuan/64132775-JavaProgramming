import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//thiet lap phuong thuc nhap
		Scanner scanner = new Scanner(System.in);
		StudentManager manager = new StudentManager();
		
		//them sinh vien
		manager.addStudent("sv001", 8.0);
		manager.addStudent("sv002", 8.75);
		manager.addStudent("sv003", 9.0);
		manager.addStudent("sv004", 5.25);
		manager.addStudent("sv005", 8.0);
		manager.addStudent("sv006", 9.5);
		manager.addStudent("sv007", 9.25);
		manager.addStudent("sv008", 8.25);
		manager.addStudent("sv009", 9.75);
		manager.addStudent("sv010", 8.0);

		//cap nhat diem 
		System.out.println("\nCap nhat diem cho sv009: ");
		manager.updateStudentScore("sv009", 10.0);
		
		//xoa sinh vien
		System.out.println("\nXoa sinh vien sv004: ");
		manager.removeStudent("sv004");
		
		//in danh sach sv
		System.out.println("Danh sach sinh vien: ");
		manager.printAllStudent();
				
		//lay diem cua sinh vien
		System.out.println("\nLay diem cua sinh vien 007");
		Double score = manager.getStudentScore("sv007");
		if (score != null) {
			System.out.println("Diem cua sv007: "+score);
		}
		else System.out.println("Khong tim thay sinh vien ma: sv007");
		
		//dong scanner
		scanner.close();
		
	}

}
