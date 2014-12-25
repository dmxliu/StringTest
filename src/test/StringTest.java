/**Copyright 2013 Ultrapower Software Co. Ltd.
 * All right reserved. 
 * @author lyz
 * @version 3.0.0
 *
 * @date 2013-12-2,下午03:30:44
 */
package test;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/** 
 * @ClassName: StringTest 
 * @Description: TODO 
 * @author lyz
 * @date 2013-12-2 下午03:30:44 
 * 
 * @version 3.0.0 
 */
public class StringTest {

	public static void main(String[] args) {
		Object o  ;
		Map<Integer, String> s = new HashMap<Integer, String>();
		for (int i = 0 ; i < 100 ; i++) {
			if(i%10==0){
				System.out.println(i);
				s.put(1000, "i"+i);
			}else{
				s.put(i, i+"");
			}
		}
		TreeMap t ; 
		for (Map.Entry<Integer, String> entry : s.entrySet()) {
			
			System.out.println(entry.getKey()+"   "+entry.getValue());
		}
		
	}
	
}
