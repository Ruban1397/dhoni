package tasks;

public class Book {
	public void book_Title() {
		System.out.println("Many Types of Book is Available");
	}
}

class paper_book extends Book {
	public void type_A() {
		// TODO Auto-generated method stub
		System.out.println("1.Paper_Book:");
		System.out.println("This book is printed on papers");
	}
}

class E_book extends Book {
	public void type_B() {
		// TODO Auto-generated method stub
		System.out.println("2.E_Book:");
		System.out.println("This is Digital version of printed Book");
	}
}

class Audio_book extends Book {
	public void type_C() {
		// TODO Auto-generated method stub
		System.out.println("3.Audio_Book");
		System.out.println("This is a Voice-recording of a Book");
	}

	public static void main(String[] args) {
		paper_book p = new paper_book();
		E_book e = new E_book();
		Audio_book a = new Audio_book();
		p.book_Title();
		p.type_A();
		e.type_B();
		a.type_C();
		a.book_Title();

	}
}
