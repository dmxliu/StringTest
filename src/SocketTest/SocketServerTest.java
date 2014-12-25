/**Copyright 2013 Ultrapower Software Co. Ltd.
 * All right reserved. 
 * @author lyz
 * @version 3.0.0
 *
 * @date 2013-12-13,下午03:11:12
 */
package SocketTest;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/** 
 * @ClassName: SocketServerTest 
 * @Description: TODO 
 * @author lyz
 * @date 2013-12-13 下午03:11:12 
 * 
 * @version 3.0.0 
 */
public class SocketServerTest {
 
	public static void main(String[] args)  {
		
//			try {
//				ServerSocket server = new ServerSocket(8080);
//				int localport = server.getLocalPort();
//				System.out.println(localport);
//				System.out.println(server.getReuseAddress());
//				System.out.println(server.getInetAddress());
//				Socket s = server.accept();
//				BufferedInputStream bf =  new BufferedInputStream(s.getInputStream());
//				System.out.println("server accept"+s);
//				int c ; 
//				byte [] buffer = new byte[1024];
//				while((c= bf.read(buffer))!=-1){
//					String chunk = new String(buffer);
//				}
//			} catch (IOException e) {
//				
//			}

		String msg = "a";
		System.out.println(msg);
		msg.concat("asd");
		System.out.println(msg);
		
	}
}
