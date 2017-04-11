package stackTest;

import java.util.Iterator;
import java.util.Stack;


import serializableTest.User;

public class StackText {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Stack<User> stack=new Stack<User>();
		for(int i=0;i<=6;i++)
			stack.add(new User(i,"User"+i));
		
		stack.remove(3);
		User pushUser=stack.push(new User(100,"user233"));
		System.out.println("pushUser "+pushUser.userName);
		
		stack.addElement(new User(101,"user234"));
		
		
		//stack.pop();
		
		System.out.println("------------------------");
		Iterator<User> iterator=(Iterator<User>) stack.iterator();
		/*while(iterator.hasNext()){
			System.out.println(iterator.next().userName);
		}*/
		
		//int i=stack.search(pushUser);
				
		System.out.println(stack.search(pushUser));
		
		
	}

}
