/**Copyright 2013 Ultrapower Software Co. Ltd.
 * All right reserved. 
 * @author lyz
 * @version 3.0.0
 *
 * @date 2013-12-25,上午11:14:07
 */
package classloadertest;

import java.lang.reflect.Method;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/** 
 * @ClassName: ClassLoaderImpl 
 * @Description: TODO 
 * @author lyz
 * @date 2013-12-25 上午11:14:07 
 * 
 * @version 3.0.0 
 */
public class ClassLoaderImpl extends UnicastRemoteObject implements ClassLoaderInterface {

	/** 
	 * @Fields serialVersionUID : TODO
	 */ 
	private static final long serialVersionUID = -1187798737080748529L;

	/**
	 * 2013-12-25,上午11:14:50
	 * @author lyz
	 * @version 3.0.0
	 *
	 * @throws RemoteException
	 */
	protected ClassLoaderImpl() throws RemoteException {
		System.out.println("server start ......");
	}

	/**
	 * @date 2013-12-25,上午11:14:34
	 * @author lyz
	 * @version 3.0.0
	 *
	 * @see classloadertest.ClassLoaderInterface#getClass(java.lang.String)
	 */
	@Override
	public Class<?> getClassName(String className) throws RemoteException {
		Class<?> c = null ; 
		try {
			c = Class.forName(className);
			Method[] me = c.getMethods();
			for (Method method : me) {
				System.out.println("server method :"+method.getName());
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return c;
	}

}
