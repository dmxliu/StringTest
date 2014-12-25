import java.io.File;
import java.io.UnsupportedEncodingException;

/**Copyright 2014 Ultrapower Software Co. Ltd.
 * All right reserved. 
 * @author lyz
 * @version 3.0.0
 *
 * @date 2014-3-4,下午02:34:09
 */

/** 
 * @ClassName: Test 
 * @Description: TODO 
 * @author lyz
 * @date 2014-3-4 下午02:34:09 
 * 
 * @version 3.0.0 
 */
public class Test {

	public static void main(String[] args) throws UnsupportedEncodingException {
		File file = new File(args[0]);
		File [] files = file.listFiles();
		for (File file2 : files) {
			String fileName = file2.getName();
			String newName = fileName = new String(fileName.getBytes("GBK"),
					"IBM-eucCN");
			System.out.println("old Name :["+fileName+"] new Name:["+newName+"]");
		}
//		String name = "APP_100_WKO_400813_鐪佺鍗忎綔20140313-鍖椾含绉诲姩娴嬭瘯鑱旇皟鍗曚竴.xlsx";
//		name = new String(name.getBytes("GBK"),
//		"UTF-8");
//		String name ="APP_100_WKO_400813_省端协作20140313-北京移动测试联调单一.xlsx";
//		name = new String(name.getBytes("UTF-8"),
//		"GBK");
//		System.out.println(name);
		
	}
}
