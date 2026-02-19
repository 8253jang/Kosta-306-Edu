package ex0219.exam05;

public class MainApp {

	public static void main(String[] args) {
		
	    Course c = new Course();
		
		System.out.println("-1. ? 모든 타입 허용 -------------");
		c.register01(new Applicant<Person>(new Person()));
		c.register01(new Applicant<Worker>(new Worker()));
		c.register01(new Applicant<Student>(new Student()));
		c.register01(new Applicant<HighStudent>(new HighStudent()));
		c.register01(new Applicant<MiddleStudent>(new MiddleStudent()));
		
		
		
		System.out.println("\n-2. ? super Worker  -  Worker 이상 허용 ------");
		c.register02(new Applicant<Person>(new Person()));
		c.register02(new Applicant<Worker>(new Worker()));
		
		//c.register02(new Applicant<Student>(new Student()));
		//c.register02(new Applicant<HighStudent>(new HighStudent()));
		//c.register02(new Applicant<MiddleStudent>(new MiddleStudent()));
		
		
		System.out.println("\n-3. ? extends Student  - Student 이하 허용 -----");
		//c.register03(new Applicant<Person>(new Person()));
		//c.register03(new Applicant<Worker>(new Worker()));
		
		c.register03(new Applicant<Student>(new Student()));
		c.register03(new Applicant<HighStudent>(new HighStudent()));
		c.register03(new Applicant<MiddleStudent>(new MiddleStudent()));

	}

}








