

public class FinllyTes {

	private String t ;
	
	public String getT() {
	
		return t;
	}

	
	public void setT( String t ) {
		this.t = t;
	}

	public void test(FinllyTes t){
		try {
			t.setT( "test1" );
			return ; 
		} catch ( Exception e ) {
		}finally{
			t.setT( "test2" );
		} 
	}
	
	public static void main( String [] args ) {
		
		FinllyTes t = new FinllyTes();
		t.test(t);
		System.out.println(t.getT());
		
	}
	
}
