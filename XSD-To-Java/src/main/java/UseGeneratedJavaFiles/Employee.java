package UseGeneratedJavaFiles;

import generated.Department;
import generated.ObjectFactory;


public class Employee {
	public static void main(String agrs[]) {
		
		/*
		 * -  When generating Java classes from an XSD using a plugin like JAXB (Java Architecture for XML Binding), an ObjectFactory class is also generated alongside the Java classes.

- The ObjectFactory class serves as a factory for creating instances of the generated Java classes. It contains a factory method for each complex type defined in the XSD, which returns an instance of the corresponding Java class. This is necessary because the Java classes generated from the XSD do not have default constructors, since their fields are based on the XSD schema and may have required attributes or elements.

- Therefore, the ObjectFactory class provides a convenient way to create instances of the generated Java classes, without having to manually initialize their fields.

- In most cases, you can directly use the Java classes generated from the XSD, without needing to interact with the ObjectFactory class directly. However, if you need to create instances of the generated Java classes programmatically, you can use the factory methods provided by the ObjectFactory class.
		 
		 * You can create an instance of a generated Java class from an XSD, even though it doesn't have a default constructor. However, you cannot use the new keyword to create an instance of the class directly.

Instead, you need to use a factory method from the ObjectFactory class to create an instance of the class.
		 *
		 *
		 */
		
		
		ObjectFactory obj = new ObjectFactory();
		
		Department d1 = obj.createDepartment();
		
		d1.setId("1");
		d1.setName("IT");
		
		generated.Employee E1 = obj.createEmployee();
		E1.setDept(d1);
		E1.setId("111111");
		E1.setName("Harsh");
		
		System.out.println(E1);
		System.out.println(d1);
		
		
		
		
		
	}
}
