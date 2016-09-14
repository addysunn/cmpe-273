package src;

public class Generic<T> {

	private T t;
	
	public void setvalue(T t)
	{
		this.t=t;
	}
	public T getvalue()
	{
		return t;
	}

	public static String name() {
		
		Generic<String> ts = new Generic<String>();
		ts.setvalue("Honda Civic");
		
		String name=ts.getvalue();
		System.out.println("Name of car is: " + name);
		return name; 
	}
	public static Integer price() {
		
		Generic<Integer> ti = new Generic<Integer>();
		ti.setvalue(35);
		
		int price=ti.getvalue();
		System.out.println("Price of car is: " + price);
		return price; 
	}
	public static Double mileage() {
		
		Generic<Double> td = new Generic<Double>();
		td.setvalue(16.2);
		
		Double mileage=td.getvalue();
		System.out.println("mileage of car is: " + mileage);
		return mileage; 
	}

}
