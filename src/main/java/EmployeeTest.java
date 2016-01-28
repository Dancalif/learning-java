
public class EmployeeTest {
	
	public static void main(String[] args){
		Employee empObjectWithNameAgeSalarySSN = new Employee("Turanscaia", "Lesya", 32, "25347625463254672");
		Employee empObjectWithNameAgeSalarySSN2 = new Employee("Ivanov", "Petr", 67, "7897767866");
		

		empObjectWithNameAgeSalarySSN.printName();
		empObjectWithNameAgeSalarySSN2.printName();
		
		empObjectWithNameAgeSalarySSN2 = empObjectWithNameAgeSalarySSN;
		
		empObjectWithNameAgeSalarySSN.printName();
		empObjectWithNameAgeSalarySSN2.printName();
		
		String lastName = empObjectWithNameAgeSalarySSN.getLastName();
		System.out.println("Mr." + lastName);
	}

}
