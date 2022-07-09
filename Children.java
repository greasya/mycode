public class Children extends Parent2
{
int age;
public Children(int age)
{
//Children age = new Childern;
super(age);
this.age = age;
System.out.println("In Children - Age is " + this.age);
}
public Children()
{
System.out.println("Children Constructor");
}
public static void main(String[] args)
{
Children child = new Children(7);

//child.study();
}
public void study()
{
System.out.println("Studying");
}
}