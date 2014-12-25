/**Copyright 2013 Ultrapower Software Co. Ltd.
 * All right reserved. 
 * @author lyz
 * @version 3.0.0
 *
 * @date 2013-12-25,上午11:12:20
 */
package classloadertest;

import java.rmi.Remote;
import java.rmi.RemoteException;

/** 
 * @ClassName: ClassLoaderInterface 
 * @Description: TODO 
 * @author lyz
 * @date 2013-12-25 上午11:12:20 
 * 
 * @version 3.0.0 
 */
public interface ClassLoaderInterface extends Remote{

	public Class<?> getClassName(String className)throws RemoteException;
	
}
