 
public class Eagle extends Animals implements Birds {
	public int wingSpan;
	public String beakColour;


	public int getWingSpan() {
		return wingSpan;
	}


	public void setWingSpan(int wingSpan) {
		this.wingSpan = wingSpan;
	}


	public String getBeakColour() {
		return beakColour;
	}


	public void setBeakColour(String beakColour) {
		this.beakColour = beakColour;
	}

	//Required by interface implementation
	public void wingSpan() {
		System.out.println("Wing span is " + wingSpan + "cm");
		
	}

	//Required by interface implementation
	public void beakColor() {
		System.out.println("Beak colour is " + beakColour);
		
	}


	@Override
	public String toString() {
		return "Eagle [name=" + name + ", age=" + age + ", weight=" + weight + ", wingSpan=" + wingSpan
				+ ", beakColour=" + beakColour + "]";
	}
	
	
	
}
