import java.io.*;
import java.util.*;
class Test{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int inpVar=sc.nextInt();
System.out.println(Test.printMonth(inpVar));
}
public static String printDay(int monthno){
String month;
switch(monthno){
case 0:{day="JANUARY";break;}
case 1:{day="FEBRUARY";break;}
case 2:{day="MARCH";break;}
case 3:{day="APRIL";break;}
case 4:{day="MAY";break;}
case 5:{day="JUNE";break;}
case 6:{day="JULY";break;}
default:day="INVALID";
}//switch
return day;