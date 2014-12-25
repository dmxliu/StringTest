/**Copyright 2013 Ultrapower Software Co. Ltd.
 * All right reserved. 
 * @author lyz
 * @version 3.0.0
 *
 * @date 2013-12-5,下午02:07:39
 */
package Quene;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * @ClassName: QueneTest
 * @Description: TODO
 * @author lyz
 * @date 2013-12-5 下午02:07:39
 * 
 * @version 3.0.0
 */
public class QueneTest {

	public static void main(String[] args) throws Exception {

		final MyQueue<String> qu = new MyQueue<String>(100000);

		Thread t1 = new Thread(new Runnable() {

			public void run() {
				for (int i = 0; i < 10000l; i++) {
					if((qu.add("add    " + i)==null))System.out.println("添加失败");
				}
				System.out.println("is over");
			}
		});

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				int i = 0 ;
				while(i<=10){
					i++;
					while (!qu.isEmpty()) {
						// System.out.println(qu.poll());
						qu.take();
					}
					System.out.println("this is over");
					try {
						Thread.sleep( 1000l );
					} catch ( InterruptedException e ) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		});

		t1.start();
		Thread.sleep(1l);
		t2.start();
		Thread.sleep(1000l);
		
		System.out.println("size = " + qu.size());
	}

}
