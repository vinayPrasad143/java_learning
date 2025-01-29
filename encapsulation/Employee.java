package encapsulation;

public class Employee {

    private String employeeName;
    private int employeeAge;
    private int employeeSalary;

    public void setEmployeeName(String employeeName){
        this.employeeName = employeeName;
    }
    public void setEmployeeAge(int employeeAge){
        if (employeeAge>0){
            this.employeeAge = employeeAge;
        }
        else {
            System.out.println("employee age should be positive");
        }
    }
    public void setEmployeeSalary(int employeeSalary){
        if (employeeSalary>0){
            this.employeeSalary = employeeSalary;
        }
        else {
            System.out.println("Salary should be greater than 0");
        }
    }

    public String getEmployeeName(){
        return employeeName;
    }

    public int getEmployeeAge(){
        return employeeAge;
    }

    public int getEmployeeSalary(){
        return employeeSalary;
    }
}

 class Encapsulationexecutor{

     public static void main(String[] args) {

         Employee emp = new Employee();
         emp.setEmployeeName("Vinay prasad");
         emp.setEmployeeAge(25);
         emp.setEmployeeSalary(10000);
         String empName = emp.getEmployeeName();
         int empAge = emp.getEmployeeAge();
         int empSalary = emp.getEmployeeSalary();

         System.out.println("employee name is " + empName + " age of " + empAge + " having salary of " + empSalary);


         Employee emp1 = new Employee();
         emp1.setEmployeeName("Chandana prasad");
         emp1.setEmployeeAge(29);
         emp1.setEmployeeSalary(50000);
         String empName1 = emp1.getEmployeeName();
         int empAge1 = emp1.getEmployeeAge();
         int empSalary1 = emp1.getEmployeeSalary();

         System.out.println("employee name is " + empName1 + " age of " + empAge1 + " having salary of " + empSalary1);

     }

}