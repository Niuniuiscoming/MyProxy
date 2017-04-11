package exception;

public class ExceptionTest4 {
	public void method(String str) throws MyException, MyException2
    {
        if (null == str)
        {
            throw new MyException("传入的字符串参数不能为null！");
        }
        else if ("hello".equals(str))
        {
            throw new MyException2("传入的字符串不能为hello");
        }
        else
        {
            System.out.println(str);
        }
    }

	public static void main(String[] args) {
		

	  
	        // 异常处理方式2，采用try...catch语句
	        try
	        {
	            ExceptionTest4 test = new ExceptionTest4();
	            test.method(null);

	        }
	        
	        catch (MyException e)
	        {
	            System.out.println("进入到MyException catch块");
	            e.printStackTrace();
	        }
	        catch (MyException2 e)
	        {
	            System.out.println("进入到MyException2 catch块");
	            e.printStackTrace();
	        }
	        catch (Exception e)
	        {
	            //虽然需要加上，但是这块代码不会被执行，只是为了编译成功
	            System.out.println("进入Exception catch块");
	            e.printStackTrace();
	            //如果去掉前面两个catch块或其中之一，则发生该异常时就会进入此catch块
	            //catch块的匹配是按照从上到下的顺序，所以这个块如果放在最前面就会捕获所有的异常，后面的块永远不会执行，这时候会提示编译错误
	        }
	        finally
	        {
	            System.out.println("程序处理完毕");
	        }

	}

}

class MyException extends Exception
{

    public MyException()
    {
        super();
    }
    
    public MyException(String message)
    {
        super(message);
    }
}


class MyException2 extends Exception
{
    public MyException2()
    {
        super();
    }
    public MyException2(String message)
    {
        super(message);
    }

}
