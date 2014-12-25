/**Copyright 2014 Ultrapower Software Co. Ltd.
 * All right reserved. 
 * @author lyz
 * @version 3.0.0
 *
 * @date 2014-1-7,上午09:31:11
 */
package writetest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;

/** 
 * @ClassName: WriteMain 
 * @Description: TODO 
 * @author lyz
 * @date 2014-1-7 上午09:31:11 
 * 
 * @version 3.0.0 
 */
public class WriteMain {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Map<Integer , User> us = new HashMap<Integer,User>();
		long startTime = System.currentTimeMillis(); 
		for (int i = 0; i < 100000; i++) {
			User u = new User();
			u.setAge("25");
			u.setName("liuyazhou");
			us.put(i,u);
		}
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(new File("D:/test.txt")));
		out.writeObject(us);
		long endTime = System.currentTimeMillis();
		System.out.println(endTime - startTime );
		ObjectInputStream in = new ObjectInputStream(new FileInputStream(new File("D:/test.txt")));
		Map<Integer , User> uss = (Map<Integer , User>)in.readObject();
		System.out.println(uss);
		
	}
	




}
