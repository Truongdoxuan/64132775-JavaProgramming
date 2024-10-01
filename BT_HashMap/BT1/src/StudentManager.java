/*Sử dụng HashMap để quản lý danh sách sinh viên và điểm thi của họ. 
 Mỗi sinh viên sẽ có một mã số sinh viên (kiểu String) và điểm thi (kiểu Double). */
import java.util.HashMap;
import java.util.Map;

public class StudentManager {
	//dung hashmap de luu tru mssv va diem thi
	private HashMap<String, Double> studentMap;
	
	//constructor
	public StudentManager() {
		studentMap = new HashMap<>();
	}
	
	//them sinh vien
	public void addStudent(String id, Double score) {
		if (studentMap.containsKey(id)) {
			System.out.println("Sinh vien da ton tai");
		}
		else {
			studentMap.put(id, score);
			System.out.println("Them sinh vien thanh cong");
		}
	}
	
	//xoa sinh vien
	public void removeStudent(String id) {
		if (studentMap.containsKey(id)) {
			studentMap.remove(id);
			System.out.println("Xoa sinh vien thanh cong");
		}
		else System.out.println("Khong tim thay sinh vien ma: "+id);

	}
	
	public void updateStudentScore(String id, Double newScore) {
		if (studentMap.containsKey(id)) {
			studentMap.put(id, newScore);
			System.out.println("Cap nhat diem thanh cong");
		}
		else System.out.println("Khong tim thay sinh vien ma: "+id);
	}
	
	public Double getStudentScore(String id) {
		return studentMap.getOrDefault(id, null);
	}
	
	public void printAllStudent() {
		if (studentMap.isEmpty()) {
			System.out.println("Khong co sinh vien nao trong danh sach");
		}
		else {
			System.out.println("Danh sach sinh vien va diem thi:");
			for (Map.Entry<String, Double> entry : studentMap.entrySet()) {
				System.out.println("MSSV: "+ entry.getKey() + ", Diem thi: "+entry.getValue());
			}
		}
	}
}
