import java.util.concurrent.ArrayBlockingQueue;

/**Copyright 2014 lashou Software Co. Ltd.
 * All right reserved. 
 * @author lyz
 * @version 1.0.0
 *
 * @date 2014年6月23日,上午10:34:10
 */

/**
 * @author lyz
 * @date 2014年6月23日,上午10:34:10
 * @version 1.0.0
 * @Description: TODO
 */
public class ArrayQueueTest {

	public static ArrayBlockingQueue<Integer> quene = new ArrayBlockingQueue<Integer>(
			10000 );

	public static void main( String [] args ) {

		Thread t1 = new Thread( new Runnable() {

			@Override
			public void run() {

				int i = 0;
				while ( i < 1000 ) {
					quene.add( i );
					i++;
					try {
						Thread.sleep( 1000l );
					} catch ( InterruptedException e ) {
						e.printStackTrace();
					}
				}
			}
		} );
		t1.start();

		Thread t2 = new Thread( new Runnable() {

			@Override
			public void run() {

				while ( true ) {
					try {
						System.out.println( quene.take() );
					} catch ( InterruptedException e ) {
						e.printStackTrace();
					}
				}
			}

		} );

		t2.start();

	}

}
