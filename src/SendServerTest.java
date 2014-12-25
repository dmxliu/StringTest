
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * <p>
 * Title: 多线程服务器
 * </p>
 * <p>
 * Description: 本实例使用多线程实现多服务功能。
 * </p>
 * <p>
 * Filename:
 * </p>
 */

class SendServerTest {
	static int count = 1;

	public static void main(String[] args) throws IOException {
		System.out.println("Server starting...\n");
		// 使用8000端口提供服务, 在这里配置端口
		Thread thread = new Thread(new Runnable() {
		final ServerThread serverThread = new ServerThread( );	
			@Override
			public void run() {
				ServerSocket server;
				try {
					server = new ServerSocket(8080);
					while (true) { // 阻塞，直到有客户连接
						Socket socket = server.accept();
						System.out.println("Accepting Connection ...\n");
						// 启动服务线程
						serverThread.run( socket );
					}
				} catch ( IOException e ) {
					e.printStackTrace();
				}
			}
		});
		thread.start();
			
	}
}

// 使用线程，为多个客户端服务
class ServerThread {
	// 线程运行实体
	public void run( Socket sk ) {
		BufferedReader in = null;
		PrintWriter out = null;
		try {
			InputStreamReader isr = new InputStreamReader(sk.getInputStream());
			in = new BufferedReader(isr);
			out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(
					sk.getOutputStream())));
			while (true) {// 接收来自客户端的请求，根据不同的命令返回不同的信息。
				String msg = in.readLine();
				if (msg == null) {
					System.out.println("cmd is null");
					break;
				}else{
					String cmd = new String(msg.getBytes(), "GBK");
					System.out.println((SendServerTest.count++) + ":\t" + cmd);
					cmd = cmd.toUpperCase();
					if (cmd.startsWith("BYE")) {
						out.println("BYE");
						break;
					} else {
						out.println("Yahoo!!! I am Server!");
					}
				}
				
			}/* end while */
		} catch (IOException e) {
			System.out.println("exception : " + e.toString());
		} finally {
			// System.out.println("Closing Connection...\n");
			// 最后释放资源
			try {
				if (in != null)
					in.close();
				if (out != null)
					out.close();
				if (sk != null)
					sk.close();
			} catch (IOException e) {
				System.out.println("close err" + e);
			}// end try catch
		}// end finally
	}// end run
}// end class ServerThread
