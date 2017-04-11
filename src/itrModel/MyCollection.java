package itrModel;

public class MyCollection implements Collection {
	//假设这个集合内部是由数组实现
    public String string[] = {"A","B","C","D","E"};  
	
	@Override
	public Iterator iterator() {
		return new MyIterator(this);
	}

	@Override
	public Object get(int i) {
		// TODO Auto-generated method stub
		return string[i];
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return string.length;
	}

}
