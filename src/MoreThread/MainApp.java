package MoreThread;

public class MainApp 
{
	public void app()
	{
		for( int i = 0; i < 2000; i ++ )
		{
			Thread t = new Thread(
					new Runnable() {
						@Override
						public void run() 
						{
							StaticInstance obj = StaticInstance.getIntegerValue();
						}
					});
			t.start();
		}
	}
	
	public static void main(String[] args) {
		MainApp app = new MainApp();
		app.app();
	}

}
