import java.util.Scanner;
class Test{
public static void main(String args[]){
Scanner src=new Scanner(System.in);
char c=src.next().charAt(0);
if(c>='0'&&c<='9')
System.out.println("YES");
else System.out.println("NO");
}}