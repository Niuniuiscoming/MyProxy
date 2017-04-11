package serializableTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerTest {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		User user=new User(1, "Lee");
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("cache.txt"));
		out.writeObject(user);
		out.close();
		
		ObjectInputStream in =new ObjectInputStream(new FileInputStream("cache.txt"));
		User newuser=(User) in.readObject();
		in.close();
	}

	

}
