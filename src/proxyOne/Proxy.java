package proxyOne;

public class Proxy implements Sourceable {
	
	private Source source;
	
	public Proxy(){
		//super();
		this.source=new Source();
	}

	@Override
	public void method() {
		before();
		source.method();
		after();
		

	}
	
	public void before(){
		System.out.println("before proxy!");  
	}
	
	public void after(){
		System.out.println("after proxy!");  
	}

}
