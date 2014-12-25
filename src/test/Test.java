/**Copyright 2013 Ultrapower Software Co. Ltd.
 * All right reserved. 
 * @author lyz
 * @version 3.0.0
 *
 * @date 2013-12-4,下午03:06:32
 */
package test;

/** 
 * @ClassName: Test 
 * @Description: TODO 
 * @author lyz
 * @date 2013-12-4 下午03:06:32 
 * 
 * @version 3.0.0 
 */
public class Test {
	
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		
		int num = 0; 
		for (long i = 0; i < 10000000000l; i++) {
			num++;
		}
		System.out.println(num);
		long endTime = System.currentTimeMillis();
		System.out.println("time="+(endTime - startTime ));
	}

}
