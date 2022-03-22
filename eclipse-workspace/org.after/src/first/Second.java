package first;

public class Second extends One{
	
	@Override
	public void sample(int id, String name, long mobile) {
		// TODO Auto-generated method stub
		super.sample(id, name, mobile);
	}
	
	@Override
	public void sample(long mobile, String name, int id) {
		// TODO Auto-generated method stub
		super.sample(mobile, name, id);
	}
	@Override
	public void sample(String name, int id, long mobile) {
		// TODO Auto-generated method stub
		super.sample(name, id, mobile);
	}
	public static void main(String[] args) {
		One o = new One();
		o.sample(123, "Kumar", 9952032397l);
		o.sample("Hameed", 678, 98866543l);
		o.sample(98787676l, "Siva", 5689);
	}
	
	
	

}
