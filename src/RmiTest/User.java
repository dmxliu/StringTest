/**Copyright 2013 Ultrapower Software Co. Ltd.
 * All right reserved. 
 * @author lyz
 * @version 3.0.0
 *
 * @date 2013-12-18,上午09:45:34
 */
package RmiTest;

import java.io.Serializable;

/** 
 * @ClassName: User 
 * @Description: TODO 
 * @author lyz
 * @date 2013-12-18 上午09:45:34 
 * 
 * @version 3.0.0 
 */
public class User implements Serializable {
  
	/** 
	 * @Fields serialVersionUID : TODO
	 */ 
	private static final long serialVersionUID = -8267537697826596342L;

	private String name ; 
	
	private int age ;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "User [age=" + age + ", name=" + name + "]";
	} 
	
	
}
