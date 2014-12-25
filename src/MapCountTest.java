import java.util.HashMap;
import java.util.Map;


/**Copyright 2014 Ultrapower Software Co. Ltd.
 * All right reserved. 
 * @author Administrator
 * @version 3.0.0
 *
 * @date 2014年5月7日,下午4:08:52
 */


public class MapCountTest {

	public static void main( String [] args ) {
		Map<Integer , Integer> map = new HashMap<Integer, Integer>();
		
		for ( int i = 0; i < 60000000; i++ ) {
			map.put( i+1, 100 );
		}
		long start = System.currentTimeMillis();
		for ( int i = 1; i < 100000; i++ ) {
			map.put( i, map.get( i )+1 );
		}
		long end = System.currentTimeMillis();
		System.out.println(end-start);
	}
	
}
