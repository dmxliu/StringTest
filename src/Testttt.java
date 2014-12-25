import java.text.SimpleDateFormat;
import java.util.Calendar;


/**Copyright 2014 lashou Software Co. Ltd.
 * All right reserved. 
 * @author lyz
 * @version 1.0.0
 *
 * @date 2014年8月19日,上午11:15:49
 */

/**
 * @author lyz
 * @date 2014年8月19日,上午11:15:49
 * @version 1.0.0
 * @Description: TODO
 */
public class Testttt {

	public static void main( String [] args ) {
		Calendar cal = Calendar.getInstance();
		//n为推迟的周数，1本周，-1向前推迟一周，2下周，依次类推
		int n = -1;
		String monday;
		cal.add(Calendar.DATE, n*7);
		//想周几，这里就传几Calendar.MONDAY（TUESDAY...）
		cal.set(Calendar.DAY_OF_WEEK,Calendar.MONDAY);
		monday = new SimpleDateFormat("yyyy-MM-dd").format(cal.getTime());
		System.out.println(monday);
	}
}
