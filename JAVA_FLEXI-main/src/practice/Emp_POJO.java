package practice;

public class Emp_POJO {
	private int empNo;
	private String ename;
	private double sal;

	// Default constructor
	public Emp_POJO() {
		this.empNo = 0;
		this.ename = null;
		this.sal = 0.0;
	}

	// Parameterized constructor
	public Emp_POJO(int empNo, String ename, double sal) {
		this.empNo = empNo;
		this.ename = ename;
		this.sal = sal;
	}

	// Getters and Setters
	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	// toString method
	@Override
	public String toString() {
		return "Emp [empNo=" + empNo + ", ename=" + ename + ", sal=" + sal + "]";
	}
}
