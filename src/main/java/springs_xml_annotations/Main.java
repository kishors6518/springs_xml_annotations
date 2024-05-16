package springs_xml_annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("person.xml");
		Person person=context.getBean("person",Person.class);
		person.walk();
		System.out.println(person.getName());
		System.out.println(person.getAge());

	}

}
