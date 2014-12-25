import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**Copyright 2014 lashou Software Co. Ltd.
 * All right reserved. 
 * @author lyz
 * @version 1.0.0
 *
 * @date 2014年8月1日,下午3:16:20
 */

/**
 * @author lyz
 * @date 2014年8月1日,下午3:16:20
 * @version 1.0.0
 * @Description: TODO
 */
public class Testtsss {

	public static void main( String [] args ) {
		Thread t  = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for ( int j = 100000; j < 1000000000; j++ ) {
					String str = j+"";
					StringBuilder tmp = new StringBuilder();
					try {
						MessageDigest md5 = MessageDigest.getInstance( "MD5" );
						md5.update( str.getBytes() );
						byte [] buf = md5.digest();
						for ( int i = 0; i < buf.length; i++ )
							tmp.append( Testtsss.byteToHex( buf[i], 2 ) );
						if(tmp.toString().equals( "0263bcf70efc6b086280efe4c8d5bf2e" )){
							System.out.println(j);
							return ;
						}
						if(j%1000000==1){
							System.out.println("j:"+j);
						}
					} catch ( NoSuchAlgorithmException e ) {
						e.printStackTrace();
					}
				}
			}
		});
		
		t.start();
	}

	public static String byteToHex( byte value, int minlength ) {

		String s = Integer.toHexString( value & 0xff );
		if ( s.length() < minlength ) {
			for ( int i = 0; i < ( minlength - s.length() ); i++ )
				s = "0" + s;
			return s;
		}
		return s;
	}
}
