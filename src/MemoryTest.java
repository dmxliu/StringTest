import java.util.ArrayList;
import java.util.List;

/**Copyright 2013 Ultrapower Software Co. Ltd.
 * All right reserved. 
 * @author lyz
 * @version 3.0.0
 *
 * @date 2013-12-31,下午02:51:23
 */

/** 
 * @ClassName: MemoryTest 
 * @Description: TODO 
 * @author lyz
 * @date 2013-12-31 下午02:51:23 
 * 
 * @version 3.0.0 
 */
public class MemoryTest {

	public static void main(String[] args) {
		List<Object> list = new ArrayList<Object>();
		int count = 0 ;
		try {
			while(true){
				count++;
				list.add(new Object());
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(count);
		}
	}
	
}
