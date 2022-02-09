//This project focuses on parent child classes (Parent; Animals) (Child; Dog, Cat, Eagle) using "extends" 
//on child classes. Also uses Bird interface on Eagle class using "implements" to ensure Eagle 
//has desired Bird interface methods. 
 
public class Main {

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.setName("Billy");
		dog.setAge(5);
		dog.setWeight(60);
		dog.setRunSpeed(20);
		System.out.println(dog);
		
		Cat cat = new Cat();
		cat.setName("Mittens");
		cat.setAge(5);
		cat.setWeight(60);
		cat.setSleepTime(360);
		System.out.println(cat);
		
		Eagle eagle = new Eagle();
		eagle.setAge(10);
		eagle.setWeight(30);
		eagle.setWingSpan(200);
		eagle.setBeakColour("Orange");
		System.out.println(eagle);
		eagle.wingSpan();
		eagle.beakColor();

	}

}
