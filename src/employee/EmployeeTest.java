package employee;

public class EmployeeTest {

    public static void main(String[] args) {

//        System.out.println(Employee.serialNum);

        Employee employeeKim = new Employee();
        employeeKim.setEmployeeName("Kim");
        System.out.println(employeeKim.serialNum);

        Employee employeeLee = new Employee();
        employeeLee.setEmployeeName("Lee");
//        employeeKim.serialNum++;

        System.out.println(employeeKim.getEmployeeName() + "님의 사번은 " + employeeKim.getEmployeeId() + "입니다.");
        System.out.println(employeeLee.getEmployeeName() + "님의 사번은 " + employeeLee.getEmployeeId() + "입니다.");

    }

}
