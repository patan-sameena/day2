//java program to demonstrate Narrow type casting
import java.io.*;
class Test{
public static void main(String args[])
{
double i=100.245;
short j=(short)i;
int k=(int)i;
System.out.println("Original value before casting:"+i);
System.out.println("After Typecasting to short:"+i);
System.out.println("After Typecasting to int:"+i);
}
}
