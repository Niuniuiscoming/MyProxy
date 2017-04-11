package serializableTest;

import java.io.Serializable;

public class User implements Serializable{
	
	private static final long serialVersionUID = -3476620569421333290L;
	
	public int userId;
    public String userName;
    
    public User(){}
    
    public User(int userId,String userName){
    	this.userId=userId;
    	this.userName=userName;
    	
    }
}
