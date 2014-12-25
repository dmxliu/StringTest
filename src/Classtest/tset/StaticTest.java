/**Copyright 2014 lashou Software Co. Ltd.
 * All right reserved. 
 * @author lyz
 * @version 1.0.0
 *
 * @date 2014年10月23日,下午3:25:13
 */
package Classtest.tset;


/**
 * @author lyz
 * @date 2014年10月23日,下午3:25:13
 * @version 1.0.0
 * @Description: TODO
 */
public class StaticTest {

	public static final User user ; 
	
	static{
		user = new User() ; 
		System.out.println("do some thing");
	}
	
	
	public static void main( String [] args ) {

		String sql = "SELECT sent_date,task_id,count(1) order_count,SUM(total_fee) total_fee FROM mail_order_wap WHERE sent_date>="
				+ " AND sent_date<="
				+ " GROUP BY sent_date,task_id";
		System.out.println("wap sql:"+sql);
	}
	
}
