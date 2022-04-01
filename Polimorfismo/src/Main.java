
public class Main {
public static void main(String[] args) {
	
	Cat cat = new Cat();
	Dog dog = new Dog();
	
//	cat.falar();
//	dog.falar();

	Animal animal = new Dog();
	
	falar(cat);
	falar(dog);

	animal = cat;
	
	if(animal instanceof Dog) {
		System.out.println("Cachorro");
	}
	
	if(animal instanceof Cat) {
		System.out.println("Gato");
	}
}
	
private static void falar(Animal a) {
	a.falar();
}

}
