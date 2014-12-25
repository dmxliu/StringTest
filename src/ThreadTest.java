import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


/**Copyright 2014 lashou Software Co. Ltd.
 * All right reserved. 
 * @author lyz
 * @version 1.0.0
 *
 * @date 2014年6月4日,下午12:07:40
 */

/**
 * @author lyz
 * @date 2014年6月4日,下午12:07:40
 * @version 1.0.0
 * @Description: TODO
 */
public class ThreadTest {

	
	public void doTest(){
		ExecutorService SERVICE = Executors.newFixedThreadPool(10);
		Model model = new Model();
		model.size = 0 ;
		model.max = 1000 ; 
		for ( int i = 0; i < 1000; i++ ) {
			SERVICE.execute( new MyThread(model) );
		}
		
	}
	
	public void isOver(){
		System.out.println("this task is over ");
	}
	
	public static void main( String [] args ) {
//		ThreadTest t = new ThreadTest();
//		t.doTest();
//		
	}
	
	public synchronized void doAdd(int size , int max){
		size = size+1;
		System.out.println("当前："+size);
		if(max==size){
			isOver();
		}
		
	}
	
	
	public synchronized void doAdd(Model model){
		model.size = model.size +1;
		System.out.println("当前："+model.size);
		if(model.max==model.size){
			isOver();
		}
		
	}

	class MyThread implements Runnable{

		Model model ;
		
		
		public MyThread(Model model){
			this.model = model;
		}
		
		/**
		 * @date 2014年6月4日,下午12:09:10
		 * @author lyz
		 * @version 1.0.0
		 *
		 * @see java.lang.Runnable#run()
		 */
		@Override
		public void run() {
			try {
				Thread.sleep( 100l );
				doAdd( model);
			} catch ( InterruptedException e ) {
				e.printStackTrace();
			}
			
		}
		
	}

	class Model {
		public int size ;
		
		public int max ;
		
		
	}
	
}
