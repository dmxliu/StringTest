/**Copyright 2014 Ultrapower Software Co. Ltd.
 * All right reserved. 
 * @author Administrator
 * @version 3.0.0
 *
 * @date 2014年5月12日,上午10:21:46
 */
package TestMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest {

	public static void main( String [] args ) {

		List<Model> list = new ArrayList<Model>();
		for ( int i = 0; i < 60000; i++ ) {
			Model model = new Model();
			model.a = i % 10 + "";
			model.b = i % 10 + "";
			model.c = i % 10 + "";
			list.add( model );
		}
		Map<Model, Integer> map = new HashMap<Model, Integer>();
		for ( Model model : list ) {
			Integer count = 0;
			System.out.println(model.hashCode());
			if ( map.containsKey( model ) ) {
				count = map.get( model );
			}
			map.put( model, count + 1 );
		}
		list = new ArrayList<Model>();
		for ( Map.Entry<Model, Integer> entry : map.entrySet() ) {
			if ( entry.getValue() > 4 ) {
				list.add( entry.getKey() );
			}
		}
		System.out.println(list.size());
	}
}

class Model implements Comparable<Model> {

	String a;
	String b;
	String c;

	/**
	 * @date 2014年5月12日,下午3:44:29
	 * @author Administrator
	 * @version 3.0.0
	 *
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return a.hashCode() +b.hashCode()+c.hashCode();
	}
	
	/**
	 * @date 2014年5月12日,下午3:46:48
	 * @author Administrator
	 * @version 3.0.0
	 *
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals( Object arg0 ) {
		Model model = (Model) arg0;
		if(this.compareTo( model )==0){
			return true ; 
		}
		return super.equals( arg0 );
	}
	
	/**
	 * @date 2014年5月12日,上午10:22:40
	 * @author Administrator
	 * @version 3.0.0
	 * 
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo( Model model ) {

		if ( model.a.equals( this.a ) && model.b.equals( this.b )
				&& model.c.equals( this.c ) ) {
			return 0;
		}
		return 1;
	}
}
