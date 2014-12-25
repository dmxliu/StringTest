/**Copyright 2014 Ultrapower Software Co. Ltd.
 * All right reserved. 
 * @author lyz
 * @version 3.0.0
 *
 * @date 2014-1-13,上午11:32:37
 */
package initTest;

/** 
 * @ClassName: InitTest 
 * @Description: TODO 
 * @author lyz
 * @date 2014-1-13 上午11:32:37 
 * 
 * @version 3.0.0 
 */
public class Test{
	public static void main(String[] args) {
		System.out.println(InitTest.name);
		
	}
}
class InitTest {
		static{
			System.out.println("InitTest start......");
		}
		
		public static final String name = "hello world ";
		
		
		
}