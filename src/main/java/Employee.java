
class Employee {
	 
	 private String title;
	 private String lastName;
	 private String firstName;
	 private int age;
	 private double salary;
	 private String ssn;
	 
	 Employee(){
		 
	 }
	 
	 Employee(String title, String lastName, String firstName, int age, double salary, String ssn){
		 setTitle(title); 
		 setLastName(lastName);
		 setFirstName(firstName);
		 setAge(age);
		 setSalary(salary); 
		 setSsn(ssn);
	 }
	 
	 Employee(String lastName, String firstName, int age, String ssn){
		 setLastName(lastName);
		 setFirstName(firstName);
		 setAge(age);
		 setSsn(ssn);
	 }
	 
	 Employee(String lastName, String firstName){
		 setLastName(lastName);
		 setLastName(firstName);
	 }

	 
	 public void setTitle(String title) {
		 this.title = title;
	 }
	 
	 private void setLastName(String lastName) {
		 this.lastName = lastName;
	 }
	 
	 private void setFirstName(String firstName) {
		 this.firstName = firstName;
	 }
	 
	 private void setAge(int age) {
		 this.age = age;
	 }
	 
	 private void setSalary(double salary) {
		 this.salary = salary;
	 } 
	 
	 private void setSsn(String ssn) {
		 this.ssn = ssn;
	 }
	 
	 String getTitle() {
		 return this.title;
	 }
	 
	 String getLastName() {
		 return this.lastName;
	 }
	 
	 String  getFirstName() {
		 return this.firstName;
	 }
	 
	 int getAge() {
		 return this.age;
	 }
	 
	 double  getSalary() {
		 return this.salary;
	 } 
	 
	 String getSsn() {
		 return this.ssn;
	 }
	 
	 void printName(){
		 System.out.println("First name: " + this.firstName);
		 System.out.println("Last name: " + this.lastName);
		 
	 }
}

