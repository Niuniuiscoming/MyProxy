package itr;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

import serializableTest.User;


public class ItrTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//List<User> list=new ArrayList<User>();
		List<User> list=new Vector<User>();
		for(int i=0;i<7;i++){
			list.add(new User(i,"User"+i));
		}
		Iterator<User> iterator=list.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		HashMap<String,Object> map=new HashMap<String, Object>();
		

	}

}
