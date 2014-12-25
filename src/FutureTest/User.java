/**Copyright 2013 Ultrapower Software Co. Ltd.
 * All right reserved. 
 * @author lyz
 * @version 3.0.0
 *
 * @date 2013-12-4,下午04:05:30
 */
package FutureTest;

/** 
 * @ClassName: User 
 * @Description: TODO 
 * @author lyz
 * @date 2013-12-4 下午04:05:30 
 * 
 * @version 3.0.0 
 */
public class User {

	private String name ; 
	
	private String sex ; 
	
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "User [age=" + age + ", name=" + name + ", sex=" + sex + "]";
	}
	
	
	
}
