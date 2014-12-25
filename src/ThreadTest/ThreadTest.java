/**Copyright 2013 Ultrapower Software Co. Ltd.
 * All right reserved. 
 * @author lyz
 * @version 3.0.0
 *
 * @date 2013-12-16,下午05:45:12
 */
package ThreadTest;

/** 
 * @ClassName: ThreadTest 
 * @Description: TODO 
 * @author lyz
 * @date 2013-12-16 下午05:45:12 
 * 
 * @version 3.0.0 
 */
public class ThreadTest {

	
	public static void main(String[] args) throws Exception{
		final Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("sleep .....");
					try {
						Thread.sleep(1);
						while(true){
							System.out.println("true");
						}
					} catch (InterruptedException e) {
						e.printStackTrace(); 
					}
					System.out.println("wake up .... ");
			}
		});
		t1.start();
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				int i = 0 ;
				while(i<100000000){
					i++;
//					System.out.println(i);
				}
				t1.interrupt(); 
				System.err.println("T2 TEST=======================================");
			}
		});
		
		t2.start();
		
	}
}
