/**Copyright 2014 Ultrapower Software Co. Ltd.
 * All right reserved. 
 * @author lyz
 * @version 3.0.0
 *
 * @date 2014-3-10,下午05:22:02
 */
package Classtest;


/**
 * @ClassName: Test
 * @Description: TODO
 * @author lyz
 * @date 2014-3-10 下午05:22:02
 * 
 * @version 3.0.0
 */
public class Test {

	public static void main( String [] args ) {

		//
		// try {
		// Test test = Test.class.newInstance();
		// Test test1 = new Test();
		// System.out.println(test);
		// System.out.println(test1);
		// } catch (InstantiationException e) {
		// e.printStackTrace();
		// } catch (IllegalAccessException e) {
		// e.printStackTrace();
		// }
		StringBuilder sql = new StringBuilder();
		sql.append( " SELECT CITY_NAME,SUPPORT_USERS, SALES_USERS, MANAGER_USERS,DC_NAME,ALL_HI_SP_COUNT,ON_SALES_SP_COUNT," );
		sql.append( " ON_SKU_COUNT,SKU_CONSUME_COUNT,NOT_SALES_COUNT,SALES_SKU_COUNT,NEW_SKU_COUNT,NEW_SKU_PROPORTION, " );
		sql.append( " USER_CONSUME_COUNT,SALES_VALUE,MARGIN_VALUE,AVG_USER_SALES,AVG_USER_MARGIN,ALL_USERS " );
		sql.append( " ALL_USERS_COUNT,USER_CONSUME_PROPORTION,SALES_CONSUME_COUNT " );
		sql.append( " FROM FACT_T F " );
		sql.append( " WHERE TIME_KEY =  20141124  ORDER BY CITY_NAME,DC_NAME" );
		System.out.println(sql.toString());
	}
}
