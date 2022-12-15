
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sonia.SpringCore.model.AppConfig;
import com.sonia.SpringCore.model.Samsung;
import com.sonia.SpringCore.model.Tyre;
import com.sonia.SpringCore.model.Vehicle;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

//		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

//		Vehicle obj = (Vehicle) context.getBean("car");
//		obj.drive();

//		Tyre tyre = (Tyre) context.getBean("tyre");
//		System.out.println(tyre);
		
		
		ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);
		Samsung s7 =(Samsung) factory.getBean(Samsung.class);
		s7.config();
		
	}
}
