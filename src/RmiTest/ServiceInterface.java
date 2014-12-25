/**Copyright 2013 Ultrapower Software Co. Ltd.
 * All right reserved. 
 * @author lyz
 * @version 3.0.0
 *
 * @date 2013-12-18,上午09:43:27
 */
package RmiTest;

import java.rmi.Remote;
import java.rmi.RemoteException;

/** 
 * @ClassName: ServiceInterface 
 * @Description: TODO 
 * @author lyz
 * @date 2013-12-18 上午09:43:27 
 * 
 * @version 3.0.0 
 */
public interface ServiceInterface extends Remote {
	
	
	public int add(int num )throws RemoteException;
	
	public User setUser(int age , User u )throws RemoteException;

}
