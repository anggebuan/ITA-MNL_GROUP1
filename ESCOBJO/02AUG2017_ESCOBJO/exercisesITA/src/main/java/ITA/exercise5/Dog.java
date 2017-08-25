package ITA.exercise5;

/**
 * Hello world!
 *
 */
public class Dog {

	public static void main(String[] args) {
		
		System.out.println("\n I am a Dog \n");
		
		Dog p = new Dog();
		
		p.bark('A'); //char
		p.bark("howling"); //string
		
		p.bark(01234567); //long
	}

	public void bark(char type) {
		System.out.println(" I have a blood type " + type);
	}

	public void bark(String type) {
		System.out.println(" I can do barking and "+ type);
	}

	public void bark(long type) {
		System.out.println(" I can bark for "+ type + " hours");
	}

}
