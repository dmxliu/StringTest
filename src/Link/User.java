/**Copyright 2013 Ultrapower Software Co. Ltd.
 * All right reserved. 
 * @author lyz
 * @version 3.0.0
 *
 * @date 2013-12-5,下午03:27:37
 */
package Link;

/** 
 * @ClassName: User 
 * @Description: TODO 
 * @author lyz
 * @date 2013-12-5 下午03:27:37 
 * 
 * @version 3.0.0 
 */
public class User {

	private String name ; 
	
	private transient String pwd ;

	
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getPwd() {
		return pwd;
	}



	public void setPwd(String pwd) {
		this.pwd = pwd;
	}



	@Override
	public String toString() {
		return "User [name=" + name + ", pwd=" + pwd + "]";
	}

	
	
	public static void main(String[] args) {
		User u = new User();
		u.setName("name");
		u.setPwd("pwd");
		System.out.println(u.toString());
	}
	
	
}
