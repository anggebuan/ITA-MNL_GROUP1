package ITA.assign1;

/**
 * Hello world!
 *
 */
public class Parent
{
	
	  public static void main( String[] args ) 
	    {
		  System.out.println( "Im the Parent" ); 
		 // Son s = new Son ();
		  //Parent p = (Parent)s;
	  	 // p.method1();
		  Parent p = new Son(); 
		  p.method1();
		  
	    }
	 
	
	public void method1() {
		System.out.println( "Im the 1st Method" ); 
		method2();
	}
	
	public void method2() {
		String word = "Im the 2nd Method";
		System.out.println(word);
	}
}
