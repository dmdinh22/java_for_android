public class Dog{
	// attributes - state of the class and its objects
	int size;
	String name;

	// constructor
	public Dog(int inputSize, String inputName){
		size = inputSize;
		name = inputName;
	}

	// methods - behavior of the class and its objects
	// bark method - no return type
	public void bark(){
		System.out.println("woof! woof!");
	}

	// bark2 method - no return type
	public void bark2(){
		String sound = "Woof";
		System.out.println(sound);
	}


	public void printName(String name){
		System.out.println(name);
	}
}