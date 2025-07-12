package kdy.dto;

public class EmployeeDto {
	
	  private int empId;           // 사번
	    private String empName;      // 이름
	    private String empNo;        // 주민번호 등
	    private String email;        // 이메일
	    private String phone;        // 전화번호
	    private String hireDate;     // 입사일 (DATE → String 또는 java.sql.Date)
	    private String jobTitle;     // 직책
	    private int deptId;          // 부서 ID
	    private double salary;       // 급여
	    private String activeYn;     // 재직 여부

	    // 기본 생성자
	    public EmployeeDto() {}

	    // 전체 필드 생성자
	    public EmployeeDto(int empId, String empName, String empNo, String email, String phone,
	                       String hireDate, String jobTitle, int deptId, double salary, String activeYn) {
	        this.empId = empId;
	        this.empName = empName;
	        this.empNo = empNo;
	        this.email = email;
	        this.phone = phone;
	        this.hireDate = hireDate;
	        this.jobTitle = jobTitle;
	        this.deptId = deptId;
	        this.salary = salary;
	        this.activeYn = activeYn;
	    }

	    // Getters and Setters
	    public int getEmpId() {
	        return empId;
	    }
	    public void setEmpId(int empId) {
	        this.empId = empId;
	    }

	    public String getEmpName() {
	        return empName;
	    }
	    public void setEmpName(String empName) {
	        this.empName = empName;
	    }

	    public String getEmpNo() {
	        return empNo;
	    }
	    public void setEmpNo(String empNo) {
	        this.empNo = empNo;
	    }

	    public String getEmail() {
	        return email;
	    }
	    public void setEmail(String email) {
	        this.email = email;
	    }

	    public String getPhone() {
	        return phone;
	    }
	    public void setPhone(String phone) {
	        this.phone = phone;
	    }

	    public String getHireDate() {
	        return hireDate;
	    }
	    public void setHireDate(String hireDate) {
	        this.hireDate = hireDate;
	    }

	    public String getJobTitle() {
	        return jobTitle;
	    }
	    public void setJobTitle(String jobTitle) {
	        this.jobTitle = jobTitle;
	    }

	    public int getDeptId() {
	        return deptId;
	    }
	    public void setDeptId(int deptId) {
	        this.deptId = deptId;
	    }

	    public double getSalary() {
	        return salary;
	    }
	    public void setSalary(double salary) {
	        this.salary = salary;
	    }

	    public String getActiveYn() {
	        return activeYn;
	    }
	    public void setActiveYn(String activeYn) {
	        this.activeYn = activeYn;
	    }

}
