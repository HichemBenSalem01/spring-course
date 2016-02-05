package collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("app.xml");
		Bean bean = context.getBean(Bean.class);
		for (String token : bean.getList()) {
			System.out.println(token);
		}
		System.out.println("================================================");
		for (String token : bean.getMap().values()) {
			System.out.println(token);
		}
		System.out.println("---------------------------------------------------");
		for (String token : bean.getSet()) {
			System.out.println(token);
		}
		System.out.println("_________________________________________________");
		for(java.lang.Object key:bean.getProperties().keySet()){
			System.out.println(bean.getProperties().getProperty((String) key));
		}
	}

}
