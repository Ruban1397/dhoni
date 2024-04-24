package tasks;

public class Constructor_demo {
String Name ;
int fees;
public Constructor_demo(String Name,int fees) {
	Name=Name;
	fees=fees;
	
}
void display()
{
	System.out.println(Name);
	System.out.println(fees);
}
public static void main(String[] args) {
	Constructor_demo cd=new Constructor_demo("Ruben",20000);
	cd.display();
}
}
//if you can't use this keyword ,null values will Display in the Output