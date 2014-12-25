import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**Copyright 2014 Ultrapower Software Co. Ltd.
 * All right reserved. 
 * @author lyz
 * @version 3.0.0
 *
 * @date 2014-3-13,下午02:39:14
 */

/** 
 * @ClassName: StringTest 
 * @Description: TODO 
 * @author lyz
 * @date 2014-3-13 下午02:39:14 
 * 
 * @version 3.0.0 
 */
public class StringTest {

	public static void main(String[] args) {
		int j = 0 ;
		while(j<10){
			j++;
		Long startTime = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			String str = "20140223091719|com.ai.omframe.instance.service.impl.InstanceQrySVImpl|getInstAccrelByUserId|1|C31377|1";
			StringTest.checkLogMsg(str);
		}
		long endTime = System.currentTimeMillis();
		System.out.println(endTime - startTime );
		}
	}
	
	protected static  boolean checkLogMsg(String logMsg){
		boolean flag = true ; 
		String first = logMsg.split("\\|")[0];
		Pattern p = Pattern.compile("\\d+");
		Matcher m = p.matcher(first);
		while (m.find()) {
			if(first.equalsIgnoreCase(m.group())){
				flag = false ; 
			}
		}
		return flag;
	}
	
}
