package ITA.assign2;

/**
 * Hello world!
 *
 */
public class Parent
{
	
	  public static void main( String[] args ) 
	    {
	//	  Arrays arrRodents[]  = {"Rodent1", 2.9, 3.4, 3.5};
	  System.out.println( "Im the Parent Rodent" +"\n\n"); 
	  
	 
	  Parent arrRodent[] = new Parent[3];
		  arrRodent[0] = new Rodent1();
		  arrRodent[1] = new Rodent2();
		  arrRodent[2] = new Rodent3();
		  
		  for(int i = 0 ; i<=2; i++) {
			  arrRodent[i].actions();  
			 
		  }
	    
	    }

	
	public void actions() {
		System.out.println( "walking..." );
	}
}
