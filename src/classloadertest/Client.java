/**Copyright 2013 Ultrapower Software Co. Ltd.
 * All right reserved. 
 * @author lyz
 * @version 3.0.0
 *
 * @date 2013-12-25,上午11:17:55
 */
package classloadertest;

import java.lang.reflect.Method;
import java.rmi.Naming;

/** 
 * @ClassName: Client 
 * @Description: TODO 
 * @author lyz
 * @date 2013-12-25 上午11:17:55 
 * 
 * @version 3.0.0 
 */
public class Client {

	public static void main(String[] args)  throws Exception {
		ClassLoaderInterface c =  (ClassLoaderInterface) Naming.lookup("rmi://192.168.25.68:8080/claImpl");
		Class clazz = c.getClassName("classloadertest.UserT");
//		Method[] ms = clazz.getMethods();
//		for (Method method : ms) {
//			System.out.println(method.getName());
//		}
		
	}
}
