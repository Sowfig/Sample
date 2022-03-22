package first;

public class Third extends Second{

	@Override
	public void sample(int id, String name, long mobile) {
		// TODO Auto-generated method stub
		super.sample(name, id, mobile);
	}
	
	@Override
	public void sample(String name, int id, long mobile) {
		// TODO Auto-generated method stub
		super.sample(id, name, mobile);
	}
	public void sample() {
		System.out.println("Hkjsabdjshgj");
	}
	
	public static void main(String[] args) {
		Third t = new Third();
		t.sample(123, "Sowfig", 982345678l);
		
		
	}
}
