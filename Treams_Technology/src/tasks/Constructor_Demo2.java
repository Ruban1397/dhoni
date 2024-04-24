package tasks;

public class Constructor_Demo2 {
	String Name ;
	int fees;
	public Constructor_Demo2(String Name,int fees) {
		this.Name=Name;
		this.fees=fees;
		
	}
	void display()
	{
		System.out.println(this.Name);
		System.out.println(this.fees);
	}
	public static void main(String[] args) {
		Constructor_Demo2 cd=new Constructor_Demo2("Ruben",20000);
		cd.display();
	}
	}


