package ExceptConcept;

public class CompileException {
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int a=20;
			int b=0;
			int c=a/b;
			System.out.println(c);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("Dont divide a num by zero");
		}
    
	}

}

