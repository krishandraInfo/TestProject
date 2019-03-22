package info.inetsolv.SpringCore;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

/**
 * Hello world!
 *
 */
public class App {
public static void main(String[] args) {

	DefaultListableBeanFactory container = new DefaultListableBeanFactory();
	XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(container);
	reader.loadBeanDefinitions("spring.xml");
	Employee employee=(Employee)container.getBean("employee");
	employee.getDetails();
}
}
