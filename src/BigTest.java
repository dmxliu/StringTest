import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;


/**Copyright 2014 lashou Software Co. Ltd.
 * All right reserved. 
 * @author lyz
 * @version 1.0.0
 *
 * @date 2014年7月18日,下午2:57:27
 */

/**
 * @author lyz
 * @date 2014年7月18日,下午2:57:27
 * @version 1.0.0
 * @Description: TODO
 */
public class BigTest {

	public static void main( String [] args ) {
		String str ="6,937,230";
		String str1 ="7,419,426";
		MathContext mc = new MathContext(2);
		BigDecimal big = new BigDecimal( str.replace( ",","" ) );
		BigDecimal big1 = new BigDecimal( str1.replace( ",","" ) );
		big.subtract( big1 ).divide( big1 ,mc).multiply( new BigDecimal( "100" ) );
		System.out.println(big.subtract( big1 ).divide( big1 ,mc).multiply( new BigDecimal( "100" ) ,mc));
	}
	
}
