import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**Copyright 2014 Ultrapower Software Co. Ltd.
 * All right reserved. 
 * @author lyz
 * @version 3.0.0
 *
 * @date 2014-1-15,下午02:34:52
 */

/** 
 * @ClassName: MapTest 
 * @Description: TODO 
 * @author lyz
 * @date 2014-1-15 下午02:34:52 
 * 
 * @version 3.0.0 
 */
public class MapTest {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		for (int i = 0; i < 10; i++) {
			map.put(i+"key", "value"+i);
		}
		map.remove("0key");
		for (Map.Entry<String, String> entry : map.entrySet()) {
			System.out.println(entry);
		}
		
	}
}
