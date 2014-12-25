/**Copyright 2013 Ultrapower Software Co. Ltd.
 * All right reserved. 
 * @author lyz
 * @version 3.0.0
 *
 * @date 2013-12-19,下午03:36:20
 */
package Url;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

/** 
 * @ClassName: UrlTest 
 * @Description: TODO 
 * @author lyz
 * @date 2013-12-19 下午03:36:20 
 * 
 * @version 3.0.0 
 */
public class UrlTest2 {

	
	public static void main(String[] args) {
		try {
			URL u = new URL("http://www.nuomi.com/api/dailydeal?version=v1&city=nyingchi");
			String name = u.getContent().getClass().getName();
			System.out.println(name );
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
