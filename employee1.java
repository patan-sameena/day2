//intialization through method
class Employee{
int eid;
String name;
String dept;
void insertRecord(int e,String n, String d){
eid=e;
name=n;
dept=d;
}
void displayInformation(){
System.out.println(eid+""+name+""+dept);
}
}
class TestEmployee4{
public static void main(String args[]){
Employee e1=new Employee();
Employee e2=new Employee();
Employee e3=new Employee();
e1.insertRecord(111,"sameena","CSE");
e2.insertRecord(222,"assu","ECE");
e3.insertRecord(333,"shalu","EEE");
e1.displayInformation();
e2.displayInformation();
e3.displayInformation();
}
}

