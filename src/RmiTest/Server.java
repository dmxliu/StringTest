/**Copyright 2013 Ultrapower Software Co. Ltd.
 * All right reserved. 
 * @author lyz
 * @version 3.0.0
 *
 * @date 2013-12-18,上午09:48:20
 */
package RmiTest;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

/** 
 * @ClassName: Server 
 * @Description: TODO 
 * @author lyz
 * @date 2013-12-18 上午09:48:20 
 * 
 * @version 3.0.0 
 */
public class Server {
	public static void main(String[] args) throws Exception{
		LocateRegistry.createRegistry(8080);
//		Thread t1 = new Thread(new Runnable() {
//			
//			@Override
//			public void run() {
				try {
					Naming.bind("rmi://127.0.0.1:8080/SerImpl", new ServerImpl());
				} catch (MalformedURLException e) {
					e.printStackTrace();
				} catch (RemoteException e) {
					e.printStackTrace();
				} catch (AlreadyBoundException e) {
					e.printStackTrace();
				}
				System.out.println("do somgthing");
//			}
//		});
//		t1.start();
		System.out.println("start");
	}
}
