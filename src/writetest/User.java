/**Copyright 2014 Ultrapower Software Co. Ltd.
 * All right reserved. 
 * @author lyz
 * @version 3.0.0
 *
 * @date 2014-1-7,上午09:48:18
 */
package writetest;

import java.io.Serializable;

/** 
 * @ClassName: User 
 * @Description: TODO 
 * @author lyz
 * @date 2014-1-7 上午09:48:18 
 * 
 * @version 3.0.0 
 */
public class User implements Serializable{
	/** 
	 * @Fields serialVersionUID : TODO
	 */ 
	private static final long serialVersionUID = -7061819014935358278L;

	private String name ; 
	
	private String age ;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "User [age=" + age + ", name=" + name + "]";
	} 
	
	
	
}
