import java.io.InputStream;
import java.net.URL;
import java.net.URLDecoder;


/**Copyright 2014 lashou Software Co. Ltd.
 * All right reserved. 
 * @author lyz
 * @version 1.0.0
 *
 * @date 2014年6月17日,下午3:38:59
 */

/**
 * @author lyz
 * @date 2014年6月17日,下午3:38:59
 * @version 1.0.0
 * @Description: TODO
 */
public class StringTestS {
	public static void main( String [] args ) {

		String queryString = 
				"SELECT " + 
				"    cast(o.key_ymd as int) AS stdate, " + 
				"    tc.province_name, " +
				"    tc.city_name, " + 
				"    dc.lv2_name, " + 
				"    dc.lv3_name, " + 
				"    o.action_type, " + 
				"    count(1) AS total_orders, " + 
				"    SUM(amount) AS total_rns, " + 
				"    SUM(total_fee)as total_revenue, " + 
				"    AVG(o.price) AS adr, " + 
				"    sum((g.price-g.cost_price)*amount) AS total_profit, " + 
				"    AVG(g.price-g.cost_price) AS avg_profit, " + 
				"    sum(amount*g.cost_price)AS total_cost, " + 
				"    count(DISTINCT buyer_id) AS user_num, " + 
				"    sum((g.price-g.cost_price)*amount)/sum(amount) AS avg_room_profit, " + 
				"    sum((g.price-g.cost_price)*amount)/count(1) AS avg_order_profit, " + 
				"    SUM((g.price-g.cost_price)*amount)/sum(amount*g.cost_price) AS com_rate " + 
				"FROM " + 
				"    dw_trade.go_goods g  " + 
				"    inner join dw_trade.go_order o on o.key_ymd>=%s AND o.key_ymd<=%s AND o.goods_id=g.goods_id AND g.new_cat IN(403,401,402,431,432,404,305,306,304,302,303) " + 
				"    inner join dw_default.dim_cat dc on g.new_cat=dc.new_cat  " + 
				"    inner join  dw_default.dim_city tc on tc.city_id=g.sales_city_id " + 
				"where  " + 
				"    dc.lv2_name in ('酒店','旅游') " + 
				"GROUP BY " + 
				"    stdate, " + 
				"    tc.province_name, " +
				"    tc.city_name, " + 
				"    dc.lv2_name, " + 
				"    dc.lv3_name, " + 
				"    o.action_type ";
		System.out.println(queryString);
	}
	
}
