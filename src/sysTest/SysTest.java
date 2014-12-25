 /**Copyright 2014 Ultrapower Software Co. Ltd.
 * All right reserved. 
 * @author lyz
 * @version 3.0.0
 *
 * @date 2014-1-9,下午03:05:50
 */
package sysTest;

import java.util.Set;

/** 
 * @ClassName: SysTest 
 * @Description: TODO 
 * @author lyz
 * @date 2014-1-9 下午03:05:50 
 * 
 * @version 3.0.0 
 */
public class SysTest {

	public static void main(String[] args)throws Exception {
		final InterfaceTest in = new InterfaceTest();
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				for (int i = 0; i < 1000000; i++) {
					try {
						in.put("name"+i);
						Thread.sleep(1);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		});
		Thread t3 = new Thread(new Runnable() {
			public void run() {
				for (int i = 10000; i < 1000000; i++) {
					try {
						in.put("name"+i);
						Thread.sleep(1);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		});
		Thread t2 = new Thread(new Runnable() {
			public void run() {
				for (int i = 0; i < 100000; i++) {
					try {
						Set<String> set = in .get();
						System.out.println("t2 run "+set.size());
						Thread.sleep(10);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		});
		t1.start();
		t2.start();
		t3.start();
	}
	
}
