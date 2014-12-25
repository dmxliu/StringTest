import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**Copyright 2013 Ultrapower Software Co. Ltd.
 * All right reserved. 
 * @author lyz
 * @version 3.0.0
 *
 * @date 2013-12-10,上午11:15:30
 */

/**
 * @ClassName: StreamTest
 * @Description: TODO
 * @author lyz
 * @date 2013-12-10 上午11:15:30
 * 
 * @version 3.0.0
 */
public class StreamTest {

	public static void main( String [] args ) throws IOException {

		Calendar cal = Calendar.getInstance();
 
        cal.set(Calendar.HOUR_OF_DAY, 0);
 
        cal.set(Calendar.SECOND, 0);
 
        cal.set(Calendar.MINUTE, 0);
 
        cal.set(Calendar.MILLISECOND, 0);
 
        Date date = new Date(cal.getTimeInMillis());

		System.out.println(date);
		Calendar calendar = Calendar.getInstance();
		calendar.setTime( date );
		calendar.add( Calendar.DAY_OF_MONTH, -22 );
		date = calendar.getTime();
		System.out.println( date );
	}

}
