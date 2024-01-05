class Circle{
int radius;
void insert(int r){
radius=r;
}
void calculateArea(){System.out.println(3.14radius*radius);}
}
class TestCircle1{
public static void main(String args[]
Circle c1=new Circle();
Circle c2=new Circle();
c1.insert(5);
c2.insert(3);
c1.calculateArea();
c2.calculateArea();
}
}