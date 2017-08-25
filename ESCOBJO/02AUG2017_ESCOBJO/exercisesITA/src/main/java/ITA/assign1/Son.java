package ITA.assign1;

public class Son extends Parent{
	
    public static void main( String[] args ) 
    {
    	System.out.println( "Im the Son" ); 
    }
    
	public void method2() {
		String word = "Sorry for overriding method2";
		System.out.println(word);
	}
}
