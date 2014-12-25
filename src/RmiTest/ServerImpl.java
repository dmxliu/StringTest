/**Copyright 2013 Ultrapower Software Co. Ltd.
 * All right reserved. 
 * @author lyz
 * @version 3.0.0
 *
 * @date 2013-12-18,上午09:39:05
 */
package RmiTest;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/** 
 * @ClassName: Server 
 * @Description: TODO 
 * @author lyz
 * @date 2013-12-18 上午09:39:05 
 * 
 * @version 3.0.0 
 */
public class ServerImpl extends UnicastRemoteObject implements ServiceInterface {

	private int count = 0;
	
	/** 
	 * @Fields serialVersionUID : TODO
	 */ 
	private static final long serialVersionUID = -4522012041078627029L;

	/**
	 * 2013-12-18,上午09:40:55
	 * @author lyz
	 * @version 3.0.0
	 *
	 * @throws RemoteException
	 */
	protected ServerImpl() throws RemoteException {
		System.out.println("server start.....");
	}

	/**
	 * @date 2013-12-18,上午09:46:56
	 * @author lyz
	 * @version 3.0.0
	 *
	 * @see RmiTest.ServiceInterface#add(int)
	 */
	@Override
	public int add(int num) throws RemoteException {
		System.out.println(count++);
		return num+num;
	}

	/**
	 * @date 2013-12-18,上午09:46:56
	 * @author lyz
	 * @version 3.0.0
	 *
	 * @see RmiTest.ServiceInterface#setUser(int, RmiTest.User)
	 */
	@Override
	public User setUser(int age, User u) throws RemoteException {
		u.setAge(age);
		return u;
	}

	
	
	
}
