/**Copyright 2014 Ultrapower Software Co. Ltd.
 * All right reserved. 
 * @author lyz
 * @version 3.0.0
 *
 * @date 2014-1-20,下午02:35:19
 */
package TimeTest;

import java.text.SimpleDateFormat;
import java.util.Date;

/** 
 * @ClassName: TimeTest 
 * @Description: TODO 
 * @author lyz
 * @date 2014-1-20 下午02:35:19 
 * 
 * @version 3.0.0 
 */
public class TimeTest {

	public static void main(String[] args) throws Exception{

		SimpleDateFormat smp = new SimpleDateFormat("yyyyMMddhhmmss");
		Date d = smp.parse( "20140120000000" );
		System.out.println(d);
		System.out.println(d.getTime());
		System.out.println(d.getHours()); 
	}
}
