//java program to convert all primitives into  its corresponding
//wrapper objects and vice-versa
 class wrapperExample4{
public static void main (String args[]){
byte b=10;
short s=20;
int i=30;
long l=40;
float f=50.0F;
double d=60.0D;
char c='a';
boolean b2=true;

//unboxing:Converting primitives into objects
Byte bytevalue=b;
Short shortvalue=s;
Integer intvalue=i;
Long longvalue=l;
Float floatvalue=f;
Double doublevalue=d;
Character charvalue=c;
Boolean boolvalue=b2;
//primitive values
System.out.println("---printig primitive values---");
System.out.println("Byte value:"+bytevalue);
System.out.println("Short value:"+shortvalue);
System.out.println("Integer value:"+intvalue);
System.out.println("Long value:"+longvalue);
System.out.println("Float value:"+floatvalue);
System.out.println("Double value:"+doublevalue);
System.out.println("Character value:"+charvalue);
System.out.println("Boolean value:"+boolvalue);
}
}
