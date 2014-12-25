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
public class Client2 {
	public static void main(String[] args)throws Exception {
		ServiceInterface server = (ServiceInterface) Naming.lookup("rmi://192.168.137.162:8080/serImpl");
		User u = new User();
		u.setAge(10);
		u.setName("name");
		server.setUser(20, u);
		System.out.println(u.toString());
		
		
		User u2 = new User();
		u2.setAge(10);
		u2.setName("name");
		ServiceInterface ser = new ServerImpl();
		ser.setUser(20, u2);
		System.out.println(u2);
		
	}
}
