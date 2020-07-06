public class Person{
	private String name;
	private int age;
	public Person(String myName,int myAge)
	{
		name=myName;
		age=myAge;
	}
	public int getAge()
	{
		return age;
	}
	public String getName()
	{
		return name;
	}
public void setAge(int myAge)
{
	age=myAge;
}
public void printDetails()
{
	System.out.println("The name of the person is "+name+ " and age is " + age);
}
public static void main(String[] args)
{
Person p=new Person("Teja",18);
p.printDetails();
}
}
