package tasks;


public class keywords_task2 {
	
	
	public static int a = 10; // ...........>static variable

	public static void demo() // .....>Static method
	{
		System.out.println("Static method");
	}

	static {   //static block
		System.out.println("Hello guys");
	}
	public static void main(String[] args) {
		demo(); // .......>without creating object we are invoking static method
		//int value = a; // ........>static variable
		keywords_task2.a=15;
		System.out.println(a);
	}
	
	
}



