 
public class Dog extends Animals{
	
//	Dog(String name, int age, int weight){
//		super(name, age, weight);
//	}

	public int runSpeed;
	
	
	public int getRunSpeed() {
		return runSpeed;
	}

	public void setRunSpeed(int runSpeed) {
		this.runSpeed = runSpeed;
	}






	@Override
	public String toString() {
		return "Dog [name=" + name + ", age=" + age + ", weight=" + weight + ", runSpeed=" + runSpeed + "]";
	}
	
}
