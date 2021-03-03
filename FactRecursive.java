
public class FactRecursive {

	private static int factorial(int n) {
	    if(n <= 1) {
	      return 1;
	    }
	    
	    return n * factorial(n - 1);
	  }
	  
	  public static void main(String[] args) {
	    for(int i = 1; i <= 10; i++) {
	      System.out.printf("%d! = %d\n", i, factorial(i));
	    }
	  }
}	






