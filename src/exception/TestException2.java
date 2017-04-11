package exception;

public class TestException2 {  
    public static void main(String[] args) {  
        int[] intArray = new int[3];  
        try {  
            for (int i = 0; i <intArray.length; i++) {  
                intArray[i] = i;  
                
            }
            System.out.println(intArray[3]/0);
        }catch (ArithmeticException e) {  
            System.out.println("除数为0异常。");  
        }catch (ArrayIndexOutOfBoundsException e) {  
            System.out.println("intArray数组下标越界异常。");  
        }
        
        System.out.println("程序正常结束。");  
    }  
}  