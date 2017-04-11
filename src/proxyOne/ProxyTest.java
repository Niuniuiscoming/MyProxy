package proxyOne;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;


public class ProxyTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		Vector<String> vector=new Vector<String>();
		Sourceable source=new Proxy();
		source.method();
	}

}
