class SalesDept {
    public static void main(String[] employee) {
        Employee emp = new Employee();
        emp.setEmpId(101);
        emp.setEmpName("Alice");
        emp.setEmpSalary(55000.0);

        System.out.println("Employee ID: " + emp.getEmpId());
        System.out.println("Employee Name: " + emp.getEmpName());
        System.out.println("Employee Salary: " + emp.getEmpSalary());
    }
}