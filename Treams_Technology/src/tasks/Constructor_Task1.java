package tasks;

public class Constructor_Task1 {
char letter;
String name;
int age;
static String Nationality="Indian";
public Constructor_Task1(char letter,String name,int age) {
	this.letter=letter;
	
	this.name=name;
	this.age=age;
	
} 
public void Display() {
	// TODO Auto-generated method stub
System.out.println("Initial:"+this.letter);
System.out.println("Name:" +this.name);
System.out.println("Age:" +this.age);
}

public void student() {
	System.out.println("Nationality:"+Nationality);

}
public static void main(String[] args) {
	

Constructor_Task1 ct=new Constructor_Task1('A',"Ruban",26);
Constructor_Task1.Nationality="Mexican";
ct.Display();

ct.student();

}
}
