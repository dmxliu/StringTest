/**Copyright 2013 Ultrapower Software Co. Ltd.
 * All right reserved. 
 * @author lyz
 * @version 3.0.0
 *
 * @date 2013-12-18,上午09:52:04
 */
package RmiTest;

import java.rmi.Naming;

/** 
 * @ClassName: Client 
 * @Description: TODO 
 * @author lyz
 * @date 2013-12-18 上午09:52:04 
 * 
 * @version 3.0.0 
 */
public class Client {
	public static void main(String[] args)throws Exception {
		ServiceInterface server = (ServiceInterface) Naming.lookup("rmi://127.0.0.1:8080/SerImpl");
		int result = server.add(10);
		System.out.println(result);
	}
}
