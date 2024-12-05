package p;



public class Client {

	private Home home;
	private Activity activity;
	private int age;
	
	public Client (Home h, Activity a, int age) {
		
		this.setHome(h);
		this.setActivity(a);
		this.setAge(age);
		
	}
	
	@Override
	public String toString() {
		return "Client [home=" + home + ", activity=" + activity + ", age=" + age + "]";
	}

	public Home getHome() {
		return home;
	}
	public void setHome(Home home) {
		this.home = home;
	}
	public Activity getActivity() {
		return activity;
	}
	public void setActivity(Activity activity) {
		this.activity = activity;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	
}
