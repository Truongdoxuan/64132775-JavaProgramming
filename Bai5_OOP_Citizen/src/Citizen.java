
public class Citizen {
	//Field
	private String id; 
	private String name;
	private short year;
	private String gender;
	private String nation;
	//Constructor - Hàm khởi tạo
	public Citizen(String id, String name, short year, String gender, String nation) {
		super();
		this.id = id;
		this.name = name;
		this.year = year;
		this.gender = gender;
		this.nation = nation;
	}
	public Citizen() {
		super();
	}
	//Getter -  Setter - Phương thức đóng gói
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Short getYear() {
		return year;
	}
	public void setYear(short year) {
		this.year = year;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getNation() {
		return nation;
	}
	public void setNation(String nation) {
		this.nation = nation;
	}
	//To string
	@Override
	public String toString() {
		return "Citizen [id=" + id + ", name=" + name + ", year=" + year + ", gender=" + gender + ", nation=" + nation
				+ "]";
	}
	
	
	
	
		
}
