/**Copyright 2014 Ultrapower Software Co. Ltd.
 * All right reserved. 
 * @author lyz
 * @version 3.0.0
 *
 * @date 2014-3-4,上午10:59:31
 */

/**
 * @ClassName: Main
 * @Description: TODO
 * @author lyz
 * @date 2014-3-4 上午10:59:31
 * 
 * @version 3.0.0
 */
public class Main {

	public static void main(String[] args){
		StringBuffer str = new StringBuffer();
//		for ( int i = 0; i < 100; i++ ) {
//				str.append( "SELECT "+i+" AS NUM , '"+(i*100)+"<=X<"+((i+1)*100)+"' AS S, NVL(SUM(REN),0) FROM TEST_TTT T WHERE T.FEN>="+(i*100)+" AND T.FEN <"+((i+1)*100)+" UNION \n" );
//		}
//		System.out.println(str.toString());
		StringBuffer strs = new StringBuffer();
		for ( int i = 10; i < 50; i++ ) {
			strs.append( "SELECT "+i+" AS NUM , '"+(i*1000)+"<=X<"+((i+1)*1000)+"' AS S, NVL(SUM(REN),0) FROM TEST_TTT T WHERE T.FEN>="+(i*1000)+" AND T.FEN <"+((i+1)*1000)+" UNION \n" );
		}
		System.out.println(strs.toString());
	}
}
