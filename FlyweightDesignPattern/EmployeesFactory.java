package FlyweightDesignPattern;
import java.util.HashMap;


class EmployeesFactory {
  private static HashMap<String, Employees> m = new HashMap<String, Employees>();
  
  public static Employees getEmployee(String type) {
    Employees p = null;
    if(m.get(type) != null) {
      p = m.get(type);
    } else {
      switch(type) {
      case "Developer": 
        System.out.println("Developer Created");
        p = new Developer();
        break;
      case "Tester":
        System.out.println("Tester Created");
        p = new Tester();
        break;
      default:
        System.out.println("No Such Employee");
      }
      
      m.put(type, p);
    }
    return p;
  }
}