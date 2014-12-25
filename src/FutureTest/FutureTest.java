/**Copyright 2013 Ultrapower Software Co. Ltd.
 * All right reserved. 
 * @author lyz
 * @version 3.0.0
 *
 * @date 2013-12-4,下午04:04:22
 */
package FutureTest;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/**
 * @ClassName: FutureTest
 * @Description: TODO
 * @author lyz
 * @date 2013-12-4 下午04:04:22
 * 
 * @version 3.0.0
 */
public class FutureTest {

	public static void main(String[] args) throws Exception {
		ExecutorService service = Executors.newFixedThreadPool(100);

		for (int i = 0; i < 10000; i++) {

			FutureTask<List<User>> task = new FutureTask<List<User>>(
					new RealDate());


			service.submit(task);
			// task.get(1000l,TimeUnit.MILLISECONDS);

			// Thread.sleep(1000);
			System.out.println("处理业务逻辑结束");
			List<User> list = task.get();
			System.out.println(Thread.activeCount());
			if(i%100==1)Thread.sleep(10000);
		}

	}

}
