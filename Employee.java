class Employee {
    private int empId;
    private String empName;
    private double empSalary;

	public Employee(){
		System.out.println("Employee Constructor is created");
	}
	
    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpSalary(double empSalary) {
        this.empSalary = empSalary;
    }

    public double getEmpSalary() {
        return empSalary;
    }
}