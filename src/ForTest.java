
/**Copyright 2014 lashou Software Co. Ltd.
 * All right reserved. 
 * @author lyz
 * @version 1.0.0
 *
 * @date 2014年7月14日,下午5:28:43
 */

/**
 * @author lyz
 * @date 2014年7月14日,下午5:28:43
 * @version 1.0.0
 * @Description: TODO
 */
public class ForTest {

	public void test() throws InterruptedException{
		int num = 0 ; 
		TimeThread time = new TimeThread(num);
		Thread t = new Thread(time);
		t.start();
		for ( int i = 0; i < 100; i++ ) {
			num++;
			time.add();
			Thread.sleep( 2000);
			System.out.println("this:"+num);
		}
		time.isOver = false ;
	}
	
	public static void main( String [] args ) throws InterruptedException {
		ForTest f = new ForTest();
		f.test();
	}
	
	class TimeThread implements Runnable{
		private int num ;

		private boolean isOver;
		/**
		 * 2014年7月16日,上午10:23:40
		 * @author lyz
		 * @version 1.0.0
		 *
		 * @param num
		 */
		public TimeThread( int num ) {
			super();
			this.num = num;
			this.isOver = true ;
		}

		public void add(){
			num ++;  
		}
		
		/**
		 * @date 2014年7月16日,上午10:23:33
		 * @author lyz
		 * @version 1.0.0
		 *
		 * @see java.lang.Runnable#run()
		 */
		@Override
		public void run() {

			while(isOver){
				try {
					Thread.sleep( 1000l );
					System.out.println("thread:"+num);
				} catch ( InterruptedException e ) {
					e.printStackTrace();
				}
				
			}
		} 
		
		
	}
	
}
