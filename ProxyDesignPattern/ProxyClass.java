package ProxyDesignPattern;

public class ProxyClass implements DatabaseExecuter  {
	boolean ifAdmin;
	DatabaseExecuteImpl de0;

	
	public ProxyClass(String user,String pass){
		if(user=="Admin" && pass=="Admin@345") {
			ifAdmin=true;
		}
		de0 = new DatabaseExecuteImpl();
		
	}
	
	
	@Override
	public void executeDatabase(String query) throws Exception {
		if(ifAdmin) {
			de0.executeDatabase(query);
		}
		else {
			if(query.equals("DELETE")) {
				throw new Exception("DELETE not Allowed for non-admin user ");
			}
			else {
				de0.executeDatabase(query);
			}
		}
		
	}

}
