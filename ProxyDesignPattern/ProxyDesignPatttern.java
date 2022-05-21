package ProxyDesignPattern;

public class ProxyDesignPatttern {

	public static void main(String[] args) throws Exception {
		//DatabaseExecuter de = new ProxyClass("NonAdmin","Admin@123");
		//de.executeDatabase("DELEE");
		
		//DatabaseExecuter de1 = new ProxyClass("NonAdmin","Admin@345");
      //  de1.executeDatabase("DELETE");
        
        DatabaseExecuter de2 = new ProxyClass("Admin","Admin@345");
        de2.executeDatabase("DELETE");
	}

}
