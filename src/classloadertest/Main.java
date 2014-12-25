/**Copyright 2013 Ultrapower Software Co. Ltd.
 * All right reserved. 
 * @author lyz
 * @version 3.0.0
 *
 * @date 2013-12-25,上午11:16:56
 */
package classloadertest;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

/** 
 * @ClassName: Main 
 * @Description: TODO 
 * @author lyz
 * @date 2013-12-25 上午11:16:56 
 * 
 * @version 3.0.0 
 */
public class Main {

	public static void main(String[] args) throws Exception{
		LocateRegistry.createRegistry(8080);
		Naming.bind("rmi://192.168.25.68:8080/claImpl", new ClassLoaderImpl());
		System.out.println("server started");
	}
}
