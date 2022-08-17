package projectA13;


class Animal{}
class Dog extends Animal{}
class Cat extends Animal{}




public class projectA1306 {
	
	public static void changeDog(Animal animal) {
		try {
			Dog dog =(Dog)animal;
			
		}catch(Exception e) {
			
		}
		
	}

	public static void main(String[] args) {
		    Dog dog =new Dog();
		    changeDog(dog);
		    System.out.println("Dog");
		    Cat cat =new Cat();
		    changeDog(cat);
		    System.out.println("Cat");

	}

}
