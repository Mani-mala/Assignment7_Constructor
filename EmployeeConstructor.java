package assignment7;
import java.util.List;
import java.util.ArrayList;
public class EmployeeConstructor {
	public static void main(String[] args) {
		List<Employee> employees=new ArrayList<>();
		Employee.company();
		employees.add(new Employee("Mani",125346L,"mani@gmail.com","Testing",99900.99));
		employees.add(new Employee("Bala",875346L,"bala@gmail.com","Desiging",97900.99));
		employees.add(new Employee("Athi",555346L,"athi@gmail.com","Desiging",90900.99));
		int i=1;
		for(Employee employee : employees)
		{
			System.out.println("Employee : "+i++);
			employee.display();
		}
	}
}
class Employee
{
	private final static String companyname="Bell Information & Technology pvt.ltd,.";
    private final static String location="Surandai";
    private String employeename;
    private Long id;
    private String email;
    private String department;
    private double salary;
    
    Employee(String empname,Long id,String email,String department,double salary)
    {
    	this.employeename=empname;
    	this.id=id;
    	this.email=email;
    	this.department=department;
    	this.salary=salary;
    }
    static void company()
    {
    	System.out.println("       "+companyname);
    	System.out.println("               Location : "+location);
    }
    public void display()
    {
    	System.out.println("Name : "+employeename);
    	System.out.println("ID : "+id);
    	System.out.println("Email : "+email);
    	System.out.println("Department : "+department);
    	System.out.println("Salary : "+salary);
    	System.out.println();
    }
}
