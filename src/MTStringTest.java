
/**Copyright 2014 lashou Software Co. Ltd.
 * All right reserved. 
 * @author lyz
 * @version 1.0.0
 *
 * @date 2014年9月9日,上午10:09:33
 */

/**
 * @author lyz
 * @date 2014年9月9日,上午10:09:33
 * @version 1.0.0
 * @Description: TODO
 */
public class MTStringTest {

	public static void main( String [] args ) {
////		<span style="color: rgb(44,180,96);font-weight:bold;">57.8</span>元
//		String testStr = "<span style='color: rgb(44,180,96);font-weight:bold;'>57.8</span>元";
//		Pattern p = Pattern.compile( "<span style='color: rgb(44,180,96);font-weight:bold;'>(.*)</span>元" );
//		Matcher m = p.matcher( testStr );
//		while ( m.find() ) {
//			System.out.println( m.group( 1 ) );
//		}
//		
		StringBuilder sql = new StringBuilder();
		sql.append( " SELECT R.DESC_MSG, R.REASON, R.PARENT_NAME, " );
		sql.append( " COUNT(DISTINCT R.TRADE_NO) NUM_COUNT,  SUM(R.R_MONEY) PRICE " );
		sql.append( " FROM REFUND_REPORT R WHERE R.TIME_KEY = "+20140905+" " );
		sql.append( " GROUP BY R.DESC_MSG, R.REASON,R.PARENT_NAME " );
		sql.append( " ORDER BY R.DESC_MSG, R.REASON,R.PARENT_NAME " );
		System.out.println(sql.toString());
	}
}
