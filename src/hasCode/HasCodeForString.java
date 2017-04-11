package hasCode;

import java.util.HashSet;
import java.util.Set;


public class HasCodeForString {

	/**
	 * @param <E>
	 * @param args
	 */
	public static <E> void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		
		String s0=new String();
		String s1=new String("1");
		String s2=new String("1");
		String s3=new String("12");
		String s4=new String("abc");
		
		set.add(s0);
		
		System.out.println(s0.hashCode());
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
	}
}
