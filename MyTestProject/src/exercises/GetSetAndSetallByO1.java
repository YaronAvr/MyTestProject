package exercises;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javax.naming.ldap.HasControls;

public class GetSetAndSetallByO1 {

	MyMap myMap = new MyMap();
	
	public GetSetAndSetallByO1() {
		// TODO Auto-generated constructor stub
		for (int i = 0; i < 5; i++) {
			myMap.put(i, i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GetSetAndSetallByO1 app = new GetSetAndSetallByO1();
		System.out.println(app.toString());
		
		app.myMap.put(2, 22);
		System.out.println(app.toString());
		
		app.myMap.putAll(3, 33);
		System.out.println(app.toString());
		
		app.myMap.put(4, 44);
		System.out.println(app.toString());
		
		

	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		
		StringBuffer str = new StringBuffer();
		Iterator<Object> iterator = myMap.keySet().iterator();
		
		while (iterator.hasNext()) {
			Object key = iterator.next();
			str.append("key: " + key + " value: " + myMap.get(key) + "\n");
		}
		
		return str.toString();
	}
	
	class MyMap extends HashMap<Object, Integer>{
		
		boolean flag = false;
		Integer num = new Integer(100);
		
		@Override
		public Integer get(Object arg0) {
			// TODO Auto-generated method stub
			Integer obj = super.get(arg0);
			if (flag) {
				return num;
			}
			return obj;
		}
		
		@Override
		public Integer put(Object key, Integer value) {
			// TODO Auto-generated method stub
			if (flag) {
				flag = false;
			}
			
			return super.put(key, value);
		}
		
		
		public Integer putAll(Object key, Integer value) {
			// TODO Auto-generated method stub
			flag = true;
			num = value;
			return super.put(key, value);
		}
		
		
		
		
	}
	

}
