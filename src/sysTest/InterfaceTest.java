/**Copyright 2014 Ultrapower Software Co. Ltd.
 * All right reserved. 
 * @author lyz
 * @version 3.0.0
 *
 * @date 2014-1-9,下午03:06:05
 */
package sysTest;

import java.util.HashSet;
import java.util.Set;

/** 
 * @ClassName: Interface 
 * @Description: TODO 
 * @author lyz
 * @date 2014-1-9 下午03:06:05 
 * 
 * @version 3.0.0 
 */
public class InterfaceTest {

	private Set<String> set =new HashSet<String>() ; 
	
	public void put(String name ){
		System.out.println("put run "+set.size());
		set.add(name);
	}
	
	public Set<String> get(){
		Set<String> newset =null ; 
		synchronized (set) {
			newset = set ; 
			set = new HashSet<String>();
			System.out.println("getMethod  run "+ newset.size());
		}
		return newset ;
	}
	
	
}
