/**Copyright 2013 Ultrapower Software Co. Ltd.
 * All right reserved. 
 * @author lyz
 * @version 3.0.0
 *
 * @date 2013-12-4,下午04:05:02
 */
package FutureTest;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/** 
 * @ClassName: RealDate 
 * @Description: TODO 
 * @author lyz
 * @date 2013-12-4 下午04:05:02 
 * 
 * @version 3.0.0 
 */
public class RealDate implements Callable<List<User>>{

	/**
	 * @date 2013-12-4,下午04:06:10
	 * @author lyz
	 * @version 3.0.0
	 *
	 * @see java.util.concurrent.Callable#call()
	 */
	@Override
	public List<User> call() throws Exception {
		
		List<User> list = new ArrayList<User>();
		for (int i = 0; i < 1000; i++) {
			User u = new User();
			u.setAge(i);
			u.setName("name:"+i);
			u.setSex("man");
			list.add(u);
//			Thread.sleep(10);
		}
		System.out.println("构造业务数据结束");
		return list;
	}

}
