class Student{
private int id;
private String name;
public void setId(int id){this.id=id;}
public void setName(String name){this.name=name;}
public int getId(){return id;}
public String getName(){return name;}
}
class BCA{
public static void main(String args[])
{
Student ob=new Student();
ob.setId(25935);
ob.setName("sam");
System.out.println("id:"+ob.getId());
System.out.println("Name:"+ob.getName());
}
}

