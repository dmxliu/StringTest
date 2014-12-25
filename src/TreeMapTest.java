import java.util.Map;
import java.util.TreeMap;


/**Copyright 2014 lashou Software Co. Ltd.
 * All right reserved. 
 * @author lyz
 * @version 1.0.0
 *
 * @date 2014年8月7日,下午12:00:52
 */

/**
 * @author lyz
 * @date 2014年8月7日,下午12:00:52
 * @version 1.0.0
 * @Description: TODO
 */
public class TreeMapTest {

	public TreeMapTest(){
		TreeMap<String ,Data> map = new TreeMap<String ,Data>();
		for ( int i = 0; i < 10; i++ ) {
			map.put( i+"", new Data(i) );
		}
		for ( Map.Entry<String ,Data> entry : map.entrySet() ) {
			System.out.println(entry.getKey()+"     "+entry.getValue());
		}
	}
	
	public static void main( String [] args ) {
		TreeMapTest t = new TreeMapTest();
	}
	
	class Data {
		private int num ; 
		
		private int nnum ; 
		
		public Data(int num ){
			this.num = num ;
			this.nnum = - num;
		}
		/**
		 * @date 2014年8月7日,下午12:12:58
		 * @author lyz
		 * @version 1.0.0
		 *
		 * @see java.lang.Object#toString()
		 */
		@Override
		public String toString() {
		
			return num+"="+nnum;
		}
		
	}
	
}
