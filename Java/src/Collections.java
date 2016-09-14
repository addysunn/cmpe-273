package src;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Collections {

	HashMap<Integer, String> has = new HashMap<Integer, String>();
	
	public void put() {

		has.put(01020304, "abcabc@abc.com");
		has.put(04020057, "xyzrhs@abc.com");
		has.put(03070066, "klmlhs@abc.com");
		has.put(07120760, "rhsabc@abc.com");
		
	}
	
	public String get(int y){
		
		int x = y;
		String val = has.get(x);
		return val;
	}
	
	public void remove(int y){
		
		int x = y;
		String val = has.remove(x);
		
	}
	
	public void display(){
		
		Set st = has.entrySet();
		Iterator itr = st.iterator();
		
				
		while(itr.hasNext()){
			Map.Entry men = (Map.Entry)itr.next();
			System.out.println("Key : " + men.getKey());
			System.out.println("Value : " + men.getValue());
								
		    }
	}
		
		public void sort(){
			
			Map<Integer, String> map = new TreeMap<Integer, String>(has);
			System.out.println("After sorting : ");
			display();
			
		}
}