package FlyweightDesignPattern;

import java.util.Random;

public class FlyweightDesignPatttern {

	  private static String employeeType[] = {"Developer", "Tester"};
	  private static String skills[] = {"Java", "C++", ".Net", "Python","Kotlin"};
	  
	  public static void main(String[] args) {
	    for(int i = 0; i < 10; i++) {
	      Employees e = EmployeesFactory.getEmployee(getRandEmployee());
	      
	      e.assignSkill(getRandSkill());
	      
	      e.task();
	    }
	  }
	  
	  public static String getRandEmployee() {
	    Random r = new Random();
	    int randInt = r.nextInt(employeeType.length);
	    
	    return employeeType[randInt];
	  }
	  
	  public static String getRandSkill() {
	    Random r = new Random();
	    int randInt = r.nextInt(skills.length);
	    
	    return skills[randInt];
	  }
	  
}
