import java.util.ArrayList;


public class List_of_Subjects {

	public static void main(String[] args) {
		//khoi tao ArrayList
		ArrayList<String> list = new ArrayList<String>();
		
		//them phan tu vao list
		list.add("Lập trình Java");
		list.add("Lập trình Thiết bị di động");
		list.add("Tư tưởng Hồ Chí Minh");
		list.add("Quản lý dự án phần mềm");
		list.add("Kiến trúc thiết kế phần mềm");
		list.add("Phát triển ứng dụng web");
		
		//hien thi list
		System.out.println("Danh sách các môn học HK1: ");
		for (int i = 0; i < list.size(); i++) {
			System.out.printf("(%d) ",i);
			System.out.println(list.get(i));
			
		}
	}
}
