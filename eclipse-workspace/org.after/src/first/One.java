package first;

public class One {

	public void sample(String name,int id,long mobile) {
		// TODO Auto-generated method stub
		System.out.println("Name "+name+" Id "+id+" Mobile "+mobile);
	}


	public void sample(long mobile,String name,int id) {
		// TODO Auto-generated method stub
		System.out.println("Name "+name+" Id "+id+" Mobile "+mobile);

	}


	public void sample(int id,String name,long mobile) {
		// TODO Auto-generated method stub
		System.out.println("Name  "+name+" Id  "+id+" Mobile "+mobile);

	}

	public static void main(String[] args) {
		One o = new One();
		o.sample(112, "Arun", 987654321l);
		o.sample(999988877l, "Sowfig", 345);
		o.sample("Sathya", 567, 9876432l);


	}


}