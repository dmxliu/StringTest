import java.util.Calendar;
import java.util.Date;


/**Copyright 2014 lashou Software Co. Ltd.
 * All right reserved. 
 * @author lyz
 * @version 1.0.0
 *
 * @date 2014年8月8日,下午12:05:18
 */

/**
 * @author lyz
 * @date 2014年8月8日,下午12:05:18
 * @version 1.0.0
 * @Description: TODO
 */
public class TimeTest {

	public static void main( String [] args ) {
		Calendar c = Calendar.getInstance(); 
        c.add(Calendar.MONTH, -1);
		System.out.println(new Date(c.getTimeInMillis()+86400*1000));
	}
}
