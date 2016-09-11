package src;

public class student1 implements Student {

	@Override
	public String subjects(String sub) {
		
		String s1=sub;
		System.out.println("Student 1 :" + s1);
		return s1;
	}

	@Override
	public int sports(int points) {
		// TODO Auto-generated method stub
		return points ;
	}

	@Override
	public int result(String name,int percent) {
		
		String info=name;
		System.out.println("Name :" + info);
		int result=percent;
		System.out.println("Result :" + result);
		return result;
	}

}
