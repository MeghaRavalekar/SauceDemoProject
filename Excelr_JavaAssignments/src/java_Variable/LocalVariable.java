package java_Variable;

public class LocalVariable {

	// Local variables are declared only in the method or block and can be accessed in that method only 
	
		
		public void addition()
		{
			// local variable 
			int a = 10 ;
			
			int b = 20 ;
			
			int sum = a+b ;
			
			System.out.println("sum is:" + sum);
		}
		
	
		
		public static void main(String[] args) {
			
			LocalVariable ob = new LocalVariable();
			ob.addition();
			
			
			
			
			
	}

}
