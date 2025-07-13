package kdy.dto;

public class StudentDto {
	
	private int studentId;
	    private String name;
	    private String gender;
	    private int age;
	    private String department;
	    
	    public StudentDto() {}
		
	    
		public StudentDto(int studentId, String name, String gender, int age, String department) {
			super();
			this.studentId = studentId;
			this.name = name;
			this.gender = gender;
			this.age = age;
			this.department = department;
		}


		public int getStudentId() {
			return studentId;
		}
		public void setStudentId(int studentId) {
			this.studentId = studentId;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getDepartment() {
			return department;
		}
		public void setDepartment(String department) {
			this.department = department;
		}
	}
	
	

