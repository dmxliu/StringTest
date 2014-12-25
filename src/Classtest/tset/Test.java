/**Copyright 2014 lashou Software Co. Ltd.
 * All right reserved. 
 * @author lyz
 * @version 1.0.0
 *
 * @date 2014年10月23日,下午3:26:15
 */
package Classtest.tset;

/**
 * @author lyz
 * @date 2014年10月23日,下午3:26:15
 * @version 1.0.0
 * @Description: TODO
 */
public class Test {

	public static void main( String [] args ) {
		 StringBuffer sql = new StringBuffer();
	        sql.append("select distinct a.key_ymd,a.session_id,a.url, b.trade_no,b.total_fee,b.pay_time from ");
	        sql.append("(select distinct session_id,key_ymd,url ");
	        sql.append("from dw_srclog.visit_wap_log ");
	        sql.append("where key_ymd=");
	        sql.append(" and url like '%pofist%' ");
	        sql.append(") a ");
	        sql.append("inner join ");
	        sql.append("(select trade_no,client_id session_id,total_fee,pay_time ");
	        sql.append("from dw_trade.go_buy_log ");
	        sql.append("where status=2 ");
	        sql.append("and pay_time>='");
//	        sql.append(startY_m_d);
	        sql.append("' and pay_time<'");
//	        sql.append(endY_m_d);
	        sql.append("' and app_name='wap'");
	        sql.append(") b ");
	        sql.append("on a.session_id=b.session_id");
	        System.out.println(sql.toString());
	        
	        String sqls = "SELECT sent_id,sent_date,SUM(total_fee) sum_total_fee,count(*) order_count from mail_order GROUP BY sent_id,sent_date limit "
                    + 1000 + "," + 10000;
	        System.out.println(sqls );
	        
	        
	        String updateSql = "UPDATE sent_" + 20120929 + " SET total_fee="
                    + 11 + " , order_count = " + 1
                    + ",is_order=1 WHERE id=" + 1268;
	        System.out.println(updateSql);
	}
}
