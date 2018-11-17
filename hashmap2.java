package hashmap;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;

public class hashmap2 {

	public static void main(String[] args) {
	
		HashMap<Integer, Employee> map=new HashMap<Integer,Employee>();
		Employee e1=new Employee("tom",25,"admin");
		Employee e2=new Employee("tomy",26,"admin34");
		Employee e3=new Employee("tomuu",27,"admin345");
		map.put(1,e1);
		map.put(2,e2);
		map.put(3,e3);
		for(Entry m:map.entryset())
		{
			Employee e=map.getKey();
		}
		
		System.out.println(map);
	}
}
