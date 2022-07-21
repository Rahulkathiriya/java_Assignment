package Module2_oops_assignment;

class Parent
{
	Parent()
	{
		System.out.println("Parent class calling..................");
	}
}

class Child extends Parent
{
	Child()
	{
		System.out.println("Child class calling.....................");
	}
}

class SecondChild extends Child
{
	SecondChild()
	{
		System.out.println("SecondChild class calling...................");
	}
}



public class As04_parent_child_sub {

	public static void main(String[] args) {

		
		SecondChild SC = new SecondChild();
		
	}

}
