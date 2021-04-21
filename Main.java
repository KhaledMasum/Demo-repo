class Food{
	protected int tableNo; 
	
	Food()
	{
	System.out.println("Food has been ordered ");
	}
	protected void setOrder(int tableNo)
	{
		this.tableNo = tableNo;
	}
	protected int getOrder()
	{
		return tableNo;
	}
}

class Burger extends Food{
	String x;
	Burger()
	{
		System.out.println("Burger has been ordered ");
	}
	public void setChoice(String x)
	{
		this.x = x;
	}
	public String getChoice()
	{
		return x;
	}
	public void displayOrder()
	{
	System.out.println("Burger name: " +getChoice());
	System.out.println("Table number: " +getOrder());
	}
}

class Sandwitch extends Food{
	String y;
	Sandwitch()
	{
		System.out.println("Sandwitch has been ordered ");
	}
	public void setChoice(String y)
	{
		this.y = y;
	}
	public String getChoice()
	{
		return y;
	}
	public void displayOrder()
	{
	System.out.println("Sandwitch name: " +getChoice());
	System.out.println("Table number: " +getOrder());
	}	
}

public class Main{
	public static void main(String[] args){
		Burger b = new Burger();
		b.setChoice("Chicken burger");
		b.setOrder(10);
		b.displayOrder();
		
		Sandwitch s = new Sandwitch();
		s.setChoice("Beef sandwitch");
		s.setOrder(5);
		s.displayOrder();
	}
}