package tasks;

public final class Keywords_task {
	final int a=10;
	
	final void abc() {
		System.out.println("FootBall:");
	
	}
	final void abc(String Name) {
		System.out.println("Player name:"+Name);
		System.out.println("Jersey number:"+a);
	}
	
public static void main(String[] args) {
	Keywords_task m= new Keywords_task();
	m.abc();
	m.abc("Messi");
}
}
