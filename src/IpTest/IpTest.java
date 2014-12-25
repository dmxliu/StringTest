/**Copyright 2013 Ultrapower Software Co. Ltd.
 * All right reserved. 
 * @author lyz
 * @version 3.0.0
 *
 * @date 2013-12-19,上午10:07:54
 */
package IpTest;

import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.UnknownHostException;

/** 
 * @ClassName: IpTest 
 * @Description: TODO 
 * @author lyz
 * @date 2013-12-19 上午10:07:54 
 * m
 * @version 3.0.0 
 */
public class IpTest {
 
	public static void main(String[] args) throws Exception {
		InetAddress ip = InetAddress.getByName("www.baidu.com");
		
		System.out.println(ip);
//		System.out.println(ip.getAddress());
//		ip=InetAddress.getLocalHost();
		Method [] ms = ip.getClass().getMethods();
		for (Method method : ms) {
			String name = method.getName();
			if(name.startsWith("is")&&method.getParameterTypes().length==0){
				System.out.println(name+"="+method.invoke(ip, null));
			}
		}
//		InetAddress[] ips = InetAddress.getAllByName("www.google.com");
//		for (InetAddress inetAddress : ips) {
//			System.out.println(inetAddress);
//		}
//		
//		System.out.println(InetAddress.getLocalHost());
		
		
		
	}
}
