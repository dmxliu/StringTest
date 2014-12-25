import java.util.concurrent.ArrayBlockingQueue;


/**Copyright 2014 lashou Software Co. Ltd.
 * All right reserved. 
 * @author lyz
 * @version 1.0.0
 *
 * @date 2014年7月21日,上午11:29:28
 */

/**
 * @author lyz
 * @date 2014年7月21日,上午11:29:28
 * @version 1.0.0
 * @Description: TODO
 */
public class TestW {

	public boolean isOver ;
	
	public void createServer(long num ){
		ArrayBlockingQueue<String> quene = new ArrayBlockingQueue<String>(10000);
		isOver = true;
		doStart( num, quene );
		for ( int i = 0; i < 50; i++ ) {
			try {
				quene.put( num+"======"+i );
			} catch ( InterruptedException e ) {
				e.printStackTrace();
			}
		}
		isOver = false ; 
	}
	
	
	public void doStart(long num ,  final ArrayBlockingQueue<String> quene){
		Thread t = new Thread(new Runnable() {
			
			@Override
			public void run() {
				while(!quene.isEmpty()||isOver){
					try {
						System.out.println(quene.take());
					} catch ( InterruptedException e ) {
						e.printStackTrace();
					}
				}
			}
		});
		t.start();
	}
	
	public void doEnd( ArrayBlockingQueue<String> quene){
		
		if(quene.isEmpty()){
			quene = null ;
		}
		
	}
	
	public static void main( String [] args ) {
		TestW t = new TestW();
		t.doSt();
		
	}
	
	public void doSt() {
		
		for ( int i = 0; i < 100; i++ ) {
			Test tt = new Test();
			tt.num = i;
			Thread t = new Thread(tt);
			t.start();
		}
	}
	
	
	


	class Test implements Runnable{
		public long num ; 
		
		@Override
		public void run() {
			TestW testW = new TestW();
			testW.createServer( num );
		}
	}

	
}
