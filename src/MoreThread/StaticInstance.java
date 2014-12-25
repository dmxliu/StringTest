package MoreThread;

public class StaticInstance 
{

	private static Integer count = new Integer(0);
	
	private StaticInstance()
	{
		try
		{
			Thread.sleep(1000);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		System.err.println("---------外部静态实例类初始化！---------");
	}
	
	public static StaticInstance getIntegerValue()
	{
		synchronized( count )
		{
			Integer newValue = count ++;
//			count = count +1 ; 
			System.err.println(newValue);
		}
		return InnerInstance.outerInstance;
	}
	
	private static class InnerInstance 
	{
		public static StaticInstance outerInstance = new StaticInstance();
	}

}
