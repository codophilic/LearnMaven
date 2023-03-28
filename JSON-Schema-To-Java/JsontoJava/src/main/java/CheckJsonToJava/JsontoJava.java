package CheckJsonToJava;

import JsontoJava.Dept;
import JsontoJava.UrnJsonschemaEmployeeEmployee;

public class JsontoJava {
public static void main(String agrs[]) {
		
		
		
		
		
	Dept d1 = new Dept();
		
		d1.setId("1");
		d1.setName("IT");
		
		UrnJsonschemaEmployeeEmployee E1 = new UrnJsonschemaEmployeeEmployee();
		E1.setDept(d1);
		E1.setId("111111");
		E1.setName("Harsh");
		
		System.out.println(E1);
		System.out.println(d1);
		
		
		
		
		
	}
}
