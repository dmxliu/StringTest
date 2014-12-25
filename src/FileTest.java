import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;

/**Copyright 2014 lashou Software Co. Ltd.
 * All right reserved. 
 * @author lyz
 * @version 1.0.0
 *
 * @date 2014年8月14日,下午2:29:34
 */

/**
 * @author lyz
 * @date 2014年8月14日,下午2:29:34
 * @version 1.0.0
 * @Description: TODO
 */
public class FileTest {

	public static void main( String [] args ) {

		Long start = System.currentTimeMillis();
		File file = new File( "d:/localhost_access_log" );
		File [] files = file.listFiles();
		try {
			OutputStreamWriter writer = new OutputStreamWriter(
					new FileOutputStream( "D:/device.txt" ), "UTF-8" );
			Set<String> set = new HashSet<String>();
			for ( File file2 : files ) {

				BufferedReader in = new BufferedReader( new InputStreamReader(
						new FileInputStream( file2) ) );
				String str;
				while ( ( str = in.readLine() ) != null ) {
					if ( str.contains( "deviceid" ) ) {
						try {
							str = str.split( "&" )[2].split( " " )[0].split( "=" )[1];
							if(set.contains( str )){
								continue;
							}else{
								set.add( str );
							}
						} catch ( Exception e ) {
							continue ; 
						}
//						System.out.println(str);
						writer.write( str + "\n" );
						writer.flush();
					}
					// System.out.println(str +"\n");
				}
				

				in.close();
			}
			writer.close();
		} catch ( Exception e ) {
			e.printStackTrace();
		}
		System.out.println( System.currentTimeMillis() - start );
	}
}
