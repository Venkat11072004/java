package nrcm;
class Animal{
	void sleep() {
		System.out.println("sleeping");
	}
}
class Dog extends Animal{
	void bark() {
		System.out.println("Dog is barking");
	}
}
public class day5 {

	public static void main(String[] args) {
		Dog d=new Dog();
		d.bark();
		d.sleep();

	}

}
