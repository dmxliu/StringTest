import java.util.ArrayList;
import java.util.List;

public class GeneratePswd {

	@SuppressWarnings( { "unchecked", "unchecked" } )
	public static void main( String [] args ) {
			System.out.println(getPswd()  );
	}

	public static String getPswd(  ) {
		StringBuffer buf = new StringBuffer(
				"a,b,c,d,e,f,g,h,i,g,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z" );
		buf.append( ",A,B,C,D,E,F,G,H,I,G,K,L,M,N,O,P,Q,R,S,T,U,V,W,X,Y,Z" );
		buf.append( ",1,2,3,4,5,6,7,8,9,0" );
		StringBuffer b = new StringBuffer();
		String [] arr = buf.toString().split( "," );
		java.util.Random r;
		int k;
		for ( int i = 0; i < 15; i++ ) {
			r = new java.util.Random();
			k = r.nextInt();
			b.append( String.valueOf( arr[Math.abs( k % 62 )] ) );
		}
		return b.toString();
	}
}
